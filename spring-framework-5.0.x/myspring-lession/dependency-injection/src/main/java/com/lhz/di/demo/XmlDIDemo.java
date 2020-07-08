package com.lhz.di.demo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author: lhz
 * @date: 2020/7/8
 * 基于xml的依赖注入
 **/
public class XmlDIDemo {
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

		String xmlPath = "classpath:\\META-INF\\denpendency-injection-setter.xml";
		//加载解析生成 beandefinition
		reader.loadBeanDefinitions(xmlPath);

		//依赖查找  伴随着bean创建
		UserHolder bean = beanFactory.getBean(UserHolder.class);
		System.out.println(bean);

	}

}
