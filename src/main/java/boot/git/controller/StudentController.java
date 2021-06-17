package boot.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
@GetMapping("/show")
public String fecthStudent()
{

return "welcome Student";
}

}
