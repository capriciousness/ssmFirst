package pers.pluto.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.pluto.service.AccountService;

public class TestSpring {
    @Test
    public void run1() {
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService accountService = (AccountService) ac.getBean("accountService");
        //调用方法
        accountService.findAll();
    }
}
