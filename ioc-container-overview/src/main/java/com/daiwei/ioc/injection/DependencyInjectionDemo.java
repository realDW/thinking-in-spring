package com.daiwei.ioc.injection;

import com.daiwei.ioc.domain.User;
import com.daiwei.ioc.repository.UserRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

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
