package Q2_B_Change_ATM_Pin_Event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);

       Myuser user=applicationContext.getBean(Myuser.class);
       user.setUname("payal");
       user.setUpin(12345);
       user.changeAtmPin();
        System.out.println("done");
    }

}
