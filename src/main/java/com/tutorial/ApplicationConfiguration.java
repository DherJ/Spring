package com.tutorial;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
<<<<<<< HEAD
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.tutorial.aspect.UserAspect;
<<<<<<< HEAD
import com.tutorial.validateur.ValidateurUser;

@Configuration
@EnableAutoConfiguration
@EnableAspectJAutoProxy
@ComponentScan({ "com.tutorial.controller", "com.tutorial.service",
		"com.tutorial.dao", "com.tutorial.validateur", "com.tutorial.aspect" })
@MapperScan("com.tutorial.dao")
public class ApplicationConfiguration extends WebMvcConfigurerAdapter {

=======
import com.tutorial.dao.UserDao;
import com.tutorial.dao.VehiculeDao;
import com.tutorial.service.UserService;
import com.tutorial.service.UserServiceImpl;
import com.tutorial.service.VehiculeService;
import com.tutorial.service.VehiculeServiceImpl;
import com.tutorial.validateur.ValidateurUser;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({ "com.tutorial.controller", "com.tutorial.service",
		"com.tutorial.dao", "com.tutorial.validateur", "com.tutorial.aspect",
		"com.tutorial.exception" })
@MapperScan("com.tutorial.dao")
public class ApplicationConfiguration extends WebMvcConfigurerAdapter {

	@Autowired
	public UserDao userDao;

	@Autowired
	public VehiculeDao vehiculeDao;

>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations(
				"/resources/");
	}

	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

<<<<<<< HEAD
	// @Bean
	// public UserService userService() {
	// return new UserServiceImpl();
	// }
=======
	@Bean
	public UserService userService() {
		return new UserServiceImpl();
	}

	@Bean
	public VehiculeService vehiculeService() {
		return new VehiculeServiceImpl();
	}
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/tutoSpringDB");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres");
		return dataSource;
	}

	@Bean
	public DataSourceTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean
	public ValidateurUser validateurUser() {
		return new ValidateurUser();
	}

	@Bean
	public UserAspect userAspect() {
		return new UserAspect();
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		return sessionFactory.getObject();
	}

	@Bean
	public InternalResourceViewResolver jspViewResolver() {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setPrefix("/WEB-INF/jsp/");
		bean.setSuffix(".jsp");
		return bean;
	}

	@Bean(name = "messageSource")
	public ReloadableResourceBundleMessageSource getMessageSource() {
		ReloadableResourceBundleMessageSource resource = new ReloadableResourceBundleMessageSource();
		resource.setBasename("classpath:messages");
		resource.setDefaultEncoding("UTF-8");
		return resource;
	}
<<<<<<< HEAD

	// @Override
	// public void addViewControllers(ViewControllerRegistry registry) {
	// registry.addViewController("/home").setViewName("home");
	// registry.addViewController("/").setViewName("index");
	// registry.addViewController("/index").setViewName("index");
	// registry.addViewController("/login").setViewName("login");
	// }
=======
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
}