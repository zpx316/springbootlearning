package cn.handsome.zp;

import cn.handsome.zp.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZpApplicationTests {

    @Autowired
    private Person person;


    @Value("${name}")
    private String name ;

    @Test
    public void contextLoads() {
//        System.out.println(person.getMaps().get("k1"));
        System.out.println("name : "+name);
    }

}
