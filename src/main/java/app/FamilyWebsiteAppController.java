package app;

import app.service.FamilyMemberService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FamilyWebsiteAppController {
    
    @Autowired
    private FamilyMemberService familyMemberService;
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public ResponseEntity familyMemberList() {
//        List familyMemberList = familyMemberService.list();
//        return new ResponseEntity(familyMemberList, HttpStatus.OK);
//    }
}
