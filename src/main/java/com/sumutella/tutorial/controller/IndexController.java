package com.sumutella.tutorial.controller;

import com.sumutella.tutorial.service.RecipeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sumutella
 * @time 2:50 PM
 * @since 1/3/2020, Fri
 */
@Slf4j
@RequiredArgsConstructor
@Controller
public class IndexController {
    private final RecipeService recipeService;


    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
