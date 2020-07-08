package com.lhz.di.demo;

import com.lhz.spring.context.entity.User;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author: lhz
 * @date: 2020/7/8
 **/
public class AnnotationDIDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(applicationContext);
		String xmlPath = "classpath:\\META-INF\\denpendency-injection-setter.xml";
		applicationContext.register(AnnotationDIDemo.class);

		applicationContext.refresh();
		UserHolder bean = applicationContext.getBean(UserHolder.class);
		System.out.println(bean);

		applicationContext.close();
	}

	@Bean
	public UserHolder userHolder(User user){
		return new UserHolder(user);
	}
}
