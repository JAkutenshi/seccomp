package io.github.jakutenshi.seccomp.organizations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class OrganizationsController {
    @Autowired
    private OrganizationRepository organizationRepository;

    @GetMapping("/organizations")
    public String showOrganizations(Model model) {
        model.addAttribute("organizations", organizationRepository.findAll());
        model.addAttribute("organization", new Organization());
        model.addAttribute("selected", new Organization("Noname", "Nohome", "Pooru"));
        return "organizations";
    }

    @PostMapping("/organizations")
    public String newOrganizationSubmission(@ModelAttribute Organization organization, Model model) {
        organizationRepository.save(organization);
        model.addAttribute("organizations", organizationRepository.findAll());
        return "redirect:/organizations";
    }

    @PostMapping("/remove")
    public String removeSelectedOrganization(@ModelAttribute("selected") Organization selected, Model model) {
        organizationRepository.deleteById(selected.getId());
        return "redirect:/organizations";
    }
}
