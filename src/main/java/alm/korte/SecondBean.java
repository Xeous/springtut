package alm.korte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecondBean {


    private TestBean bean;

    @Bean
    public TestBean printBean() {
        System.out.println(bean.getName()
                + bean.getValue());
        return bean;
    }
}