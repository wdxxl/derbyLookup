package com.wdxxl.derbyLookup.derby;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import junit.framework.TestCase;

import org.junit.Test;

/**
 *
 * This UnitTest used to create DB and insert Some Test Data
 * @author King.Wang
 *
 */

public class DerbyDEVTest extends TestCase {

	private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    private Properties props = new Properties();
   
    
    protected void setUp() throws Exception{
    	Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
    	props.put("user", "derby");
    	props.put("password", "derby");
    }
    //First to Run this to Create Table and Schema
    @Test
	public void testCreateTableAndSchema() throws Exception {
        // create and connect the database named derbyLookupDB
        conn = DriverManager.getConnection("jdbc:derby:c://derbyLookupDEV//derbyLookupDB;create=true", props);
        // create a table
        stmt = conn.createStatement();
        try {
        	stmt.execute("CREATE TABLE DERBYLOOKUP(ID VARCHAR(4) ,CITY VARCHAR(50),COUNTY VARCHAR(50),ZIP_CODE VARCHAR(50),REVISION VARCHAR(10), " +
        			"DESCRIPTION VARCHAR(200), RATING VARCHAR(200), STATE_CODE VARCHAR(4), STATE_NUM VARCHAR(4), LINE VARCHAR(4),LOOKUP VARCHAR(10))");
        } catch (SQLException e) {
        	e.printStackTrace();
        }
	}

	//Second to Check the Table is existed or not
	@Test
	public void testTableExistAtFisrt() throws SQLException {
		conn = DriverManager.getConnection("jdbc:derby:c://derbyLookupDEV//derbyLookupDB;", props);
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT COUNT(*) FROM DERBYLOOKUP");
		while (rs.next()) {
			assertEquals("expect Result is 0","0",rs.getString(1));
		}
	}
	
	//Insert Test Data for Further Used.
	@Test
	public void testInsertDatas()throws SQLException{
		conn = DriverManager.getConnection("jdbc:derby:c://derbyLookupDEV//derbyLookupDB;", props);
        stmt = conn.createStatement();
        stmt.execute("insert into DERBYLOOKUP values ('3','','','99501','09 12','Description','404','AK','54','HO','HO54')");
        stmt.execute("insert into DERBYLOOKUP values ('4','city','conty','99502','09 13','Description','405','AW','53','HA','HA53')");
	}
	
	
	
	protected void tearDown() throws Exception {
		if(rs!=null){
			rs.close();
		}
		stmt.close();
		conn.close();
	}

}
