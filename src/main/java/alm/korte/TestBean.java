package alm.korte;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gabor on 2015.02.03..
 */

@Configuration
public class TestBean {
    private String name;
    private int value;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Bean
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}