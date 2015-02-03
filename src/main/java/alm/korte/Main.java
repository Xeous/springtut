package alm.korte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gabor on 2015.02.03..
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");

        ApplicationContext context2 =
                new AnnotationConfigApplicationContext(SecondBean.class);


        TestBean bean = context.getBean(TestBean.class);
        System.out.println(bean.getName() + bean.getValue());

        bean.setName("más név");
        bean.setValue(60);

        System.out.println(bean.getName() + bean.getValue());

        TestBean testBean2 = context.getBean(TestBean.class);
        System.out.println(testBean2.getName() + testBean2.getValue());


        SecondBean secondBean = (SecondBean) context2.getBean("printBean");
    }
}
