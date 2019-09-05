package cn.handsome.zp;

import cn.handsome.zp.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZpApplicationTests {

    @Autowired
    private Person person;


    @Value("${name}")
    private String name;
    @Autowired
    private ApplicationContext ac;

    @Test
    public void serviceTest() {
        boolean b = ac.containsBean("helloService");

        System.out.println(b);

    }

    @Test
    public void contextLoads() {
        System.out.println(person);
        System.out.println("name : " + name);
    }

}
