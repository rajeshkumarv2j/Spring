package com.logicbig.example.collection.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class ListInjectionValueExample {
    public static void main (String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config-value.xml",
                                                                        ListInjectionValueExample
                                                                                            .class);
        TestBean bean = context.getBean(TestBean.class);
        System.out.println(bean.getStringList());
    }

    private static class TestBean {
        private final List<String> stringList;

        public TestBean (List<String> stringList) {
            this.stringList = stringList;
        }

        public List<String> getStringList () {
            return stringList;
        }
    }
}