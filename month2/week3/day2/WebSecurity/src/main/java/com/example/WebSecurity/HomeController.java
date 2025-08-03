package com.example.WebSecurity;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/redirect")
    public String redirectAfterLogin(Authentication authentication) {
        if (authentication != null) {
            for (GrantedAuthority authority : authentication.getAuthorities()) {
                String role = authority.getAuthority();

                if ("ROLE_ADMIN".equals(role)) {
                    return "redirect:/admin/dashboard";  // make sure you have this mapping
                } else if ("ROLE_USER".equals(role)) {
                    return "redirect:/dashboard";        // make sure you have this mapping
                }
            }
        }
        // fallback if no role found
        return "redirect:/login?error";
    }

    @GetMapping("/dashboard")
    public String userDashboard() {
        return "dashboard";  // dashboard.html
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "admin";  // admin.html
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";  // login.html your custom login page
    }
}
