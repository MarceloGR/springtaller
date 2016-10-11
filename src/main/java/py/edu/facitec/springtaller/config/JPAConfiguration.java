package py.edu.facitec.springtaller.config;





import java.util.Properties;

import javax.sql.DataSource;
import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement public class JPAConfiguration { 
	 
 	@Bean 
 	public LocalContainerEntityManagerFactoryBean entityManagerFactory(){ 
 		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();  	
 		em.setDataSource(dataSource());  	
 		em.setPackagesToScan(new String[]{"py.edu.facitec.springtaller.model"});  	
 		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();  	
 		em.setJpaVendorAdapter(vendorAdapter); 
 		em.setJpaProperties(additionalProperties()); 
 		return em; 
 	} 
//******************My SQL *************
	@Bean  	
 	public DataSource dataSource(){
 		DriverManagerDataSource dataSource = new DriverManagerDataSource(); 
 		dataSource.setDriverClassName("com.mysql.jdbc.Driver"); 
 		dataSource.setUrl( "jdbc:mysql://localhost:3306/springtaller");  	
 		dataSource.setUsername( "root" );  	
 		dataSource.setPassword( "" );  	
 		return dataSource; 
 	} 
 	
////*******************Postgre**************
// 	@Bean
// 	public DataSource dataSource(){
// 		DriverManagerDataSource dataSource = new DriverManagerDataSource(); 
// 		dataSource.setDriverClassName("org.postgresql.Driver"); 
// 		dataSource.setUrl( "jdbc:postgresql://localhost:5432/formativa");  	
// 		dataSource.setUsername( "postgres" );  	
// 		dataSource.setPassword( "12345" );  	
// 		return dataSource; 
// 	} 
 	 
 	private Properties additionalProperties() {
 		Properties properties = new Properties();  	
 		properties.setProperty("hibernate.hbm2ddl.auto", "update"); 
 		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect"); 
 		properties.setProperty("hibernate.show_sql", "true"); 
 	 	 return properties; 
 	} 
 
 	@Bean 
 	public PlatformTransactionManager transactionManager (EntityManagerFactory emf){ 
 		JpaTransactionManager transactionManager =  	new JpaTransactionManager(); 
 		transactionManager.setEntityManagerFactory(emf);  	
 		return transactionManager; 
 	} 
 	 
 	 
} 

