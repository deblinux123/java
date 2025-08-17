package com.example.E_Commerce;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController 
{
    @GetMapping("/default")
    public String redirectAfterLogin(Authentication authentication)
    {
        if (authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN")))
        {
            return "redirect:/dashboard";
        }
        
        return "redirect:/";
    }    
}
