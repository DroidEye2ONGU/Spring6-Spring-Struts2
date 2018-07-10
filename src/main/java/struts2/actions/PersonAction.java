package struts2.actions;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import struts2.services.PersonService;

@Component
@Scope("prototype")
public class PersonAction {

    @Autowired
    private PersonService personService;

    //public void setPersonService(PersonService personService) {
    //    this.personService = personService;
    //}

    public String execute() {
        System.out.println("execute....");
        personService.save();
        return "success";
    }

}
