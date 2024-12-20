package com.lalbr.core.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @GetMapping(value = {"/rezepte/{name}","/Rezepte/{name}"})
    public String rezepteTemplateGetMapping(@PathVariable String name, Model model){
        model.addAttribute("rezept", recipeService.findRezeptModelByName(name));
        return "rezepte/rezeptTemplate";
    }

    @GetMapping(value={"/rezepte","/Rezepte","/rezept","/Rezept","/rezepte/","/Rezepte"})
    public String rezeptOverviewGetMapping(Model model){
        List<RecipeModel> list = recipeService.findAllRezeptModel();
        model.addAttribute("rezeptList",list);
        return "rezepte/rezepte";
    }

    @GetMapping(value = {"/rezeptersteller","/rezeptErsteller","/recipecreator","/recipeCreator","/Rezeptersteller","/RezeptErsteller","/rezeptCreator","/RezeptCreator","/Rezeptcreator"})
    public String rezepterstellerGetMapping(Model model){
        model.addAttribute("rezept",new RecipeModel());
        return "rezepte/rezeptErsteller";
    }


    @PostMapping("/rezeptersteller")
    public String rezepterstellerPost(@ModelAttribute RecipeModel recipeModel, Model model){
        model.addAttribute("rezept", recipeModel);
        //rezeptService.saveRezeptModel(rezeptModel);
        return "sensordata";
    }

}
