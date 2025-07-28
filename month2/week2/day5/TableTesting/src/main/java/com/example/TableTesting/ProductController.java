package com.example.TableTesting;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String showProducts(Model model)
    {
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }
}
