package struts2.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Value("DroidEye")
    private String username;

    //public void setUsername(String username) {
    //    this.username = username;
    //}

    public void hello() {
        System.out.println("My name is " + username);
    }

}
