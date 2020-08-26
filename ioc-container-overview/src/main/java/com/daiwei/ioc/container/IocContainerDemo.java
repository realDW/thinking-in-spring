package com.daiwei.ioc.container;

import com.daiwei.ioc.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * 手动起一个 ioc 容器 ioc 容器示例
 * Created by Daiwei on 2020/8/27
 */
public class IocContainerDemo {

    public static void main(String[] args) {
        // 创建 beanFactory 容器
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        int num = reader.loadBeanDefinitions("classpath:/META-INF/dependency-injection-context.xml");
        System.out.println(num);
        lookupCollectionByType(beanFactory);
    }

    private static void lookupCollectionByType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> beans = listableBeanFactory.getBeansOfType(User.class);
            System.out.println("get beans collection by type -" + beans.toString());
        }
    }
}
