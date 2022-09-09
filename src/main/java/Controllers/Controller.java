package Controllers;

import Services.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {



  @GetMapping("/")
  public String index(){
    return "Welcome\n" + "";
  }

  /*
  Service service = new Service();
  @GetMapping("getFirst")
  public String getFirst(){
    service.readFromFile();
    return "";
  }

   */


}
