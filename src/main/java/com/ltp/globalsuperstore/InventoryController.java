package com.ltp.globalsuperstore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class InventoryController {

    @GetMapping("/")
    public String getForm(Model model) {
        model.addAttribute("categories", Constants.CATEGORIES);
        return "form";
    }

    @GetMapping("/inventory")
    public String getInventory() {
        return "inventory";
    }
}
