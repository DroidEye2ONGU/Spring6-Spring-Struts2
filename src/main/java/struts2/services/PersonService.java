package struts2.services;

import org.springframework.stereotype.Service;

@Service("personService")
public class PersonService {

    public void save() {
        System.out.println("PersonService's save....");
    }

}
