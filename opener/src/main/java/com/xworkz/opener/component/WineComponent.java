package com.xworkz.opener.component;

import com.xworkz.opener.dto.WineDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/Wine")
public class WineComponent {
    public WineComponent()
    {
        System.out.println("WineComponent started");
    }

    @PostMapping
    public String takeWine(@Valid WineDto wineDto, BindingResult bindingResult, Model model)
    {
        System.out.println("takeWine started with @PostMapping");
        if(bindingResult.hasErrors())
        {
            model.addAttribute("error","Validation failed. please check the details");
            List<ObjectError> error=bindingResult.getAllErrors();
            model.addAttribute("errors",error);
            model.addAttribute("dto",wineDto);
        }
        else
        {
            System.out.println(wineDto);
            System.out.println("Validation passed");


        }
    }
}
