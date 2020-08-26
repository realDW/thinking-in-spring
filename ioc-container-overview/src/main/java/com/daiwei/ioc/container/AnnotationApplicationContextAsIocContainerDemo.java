package com.daiwei.ioc.container;

import com.daiwei.ioc.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 具有注解能力的 {@link org.springframework.context.ApplicationContext} 作为IoC 容器
 * Created by Daiwei on 2020/8/27
 */
public class AnnotationApplicationContextAsIocContainerDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AnnotationApplicationContextAsIocContainerDemo.class);
        applicationContext.refresh();
        getBeanByType(applicationContext);
    }

    @Bean
    public User user() {
        User user = new User();
        user.setId(1L);
        user.setName("hello");
        return user;
    }

    public static void getBeanByType(BeanFactory beanFactory) {
        User user = beanFactory.getBean(User.class);
        System.out.println(user.toString());
    }

}
