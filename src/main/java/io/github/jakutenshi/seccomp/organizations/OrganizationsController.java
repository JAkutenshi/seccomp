package io.github.jakutenshi.seccomp.organizations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrganizationsController {

    @GetMapping("/organizations")
    public String objects() {
        return "organizations";
    }
}
