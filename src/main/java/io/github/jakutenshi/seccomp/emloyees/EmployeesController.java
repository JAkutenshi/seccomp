package io.github.jakutenshi.seccomp.emloyees;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeesController {

    @GetMapping("/employees")
    public String employees() {
        return "employees";
    }
}
