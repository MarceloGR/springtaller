package py.edu.facitec.springtaller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.hibernatespring.dao.ClienteDao;
import py.edu.facitec.springtaller.controller.HomeController;
@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class, ClienteDao.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter{
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver =new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/"); 
		resolver.setSuffix(".jsp");
		return resolver; }

}
