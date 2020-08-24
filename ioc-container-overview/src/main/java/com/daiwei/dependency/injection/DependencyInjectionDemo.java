package com.daiwei.dependency.injection;

import com.daiwei.dependency.annotation.Super;
import com.daiwei.dependency.domain.User;
import com.daiwei.dependency.repository.UserRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/**
 *  example of looking up bean by name
 * Created by Daiwei on 2020/8/23
 */
public class DependencyInjectionDemo {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-injection-context.xml");
        UserRepository userRepository = (UserRepository) beanFactory.getBean("userRepository");
        Collection<User> users = userRepository.getUsers();
        System.out.println(users);
    }

}
