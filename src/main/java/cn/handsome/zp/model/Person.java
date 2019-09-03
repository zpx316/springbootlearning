package cn.handsome.zp.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author zp
 * @Description:
 * @date 2019-09-03 18:32
 */
@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;
    private String sex;
    private List girls;
    private Map maps;
}