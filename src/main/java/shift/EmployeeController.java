package shift;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @Autowired
  private EmployeeRepository repository;

  @CrossOrigin(origins = "http://localhost:9000")
  @RequestMapping("/createEmployee")
  public @ResponseBody Employee createEmployee(@RequestParam(value="firstName") String firstName,@RequestParam(value="lastName") String lastName) {
    return repository.save(new Employee(firstName, lastName));
  }

  @CrossOrigin(origins = "http://localhost:9000")
  @RequestMapping("/allEmployees")
  public @ResponseBody List<Employee> allEmployess() {
    return repository.findAll();
  }

  @CrossOrigin(origins = "http://localhost:9000")
  @RequestMapping("/deleteAll")
  public @ResponseBody void deleteAll() {
    repository.deleteAll();
  }

}
