derbyLookup
===========

Spring+hibernate+derby to created an restful web service project.

Verision 1.0.0
Start Steps:
1. Check Eclipse properties of derbyLookup "Web Deployment Assembly";
2. Run Unit Test "DerbyDEVTest" and "DerbyPRODTest" generate the Derby Database;

Web.xml Setting
1. Web.xml add "spring.profiles.active" to control with database will be choosed to connect. (@ActiveProfiles);
2. Web.xml take notice of the loading sequences between <context-param> and <init-param>, 
  in case of "'territoryService': Injection of autowired dependencies failed;"
3. Filter and Listener (ContextLoaderListener);

Spring+Hibernate Setting
1. Seprate the spring and common-db file, looks good to seprate 
  AbstractTransactionalJUnit4SpringContextTests and AbstractJUnit4SpringContextTests;
2. RestFul ContentNegotiationManagerFactoryBean;
3. JPA Tools another project to build @Entity;
4. SessionFactory openSession and Close session;
