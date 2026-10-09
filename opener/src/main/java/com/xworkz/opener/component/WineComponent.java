package com.xworkz.opener.component;

import com.xworkz.opener.dto.WineDto;
import com.xworkz.opener.service.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
@RequestMapping("/")
public class WineComponent {

    private List<String> companyLocation;

    public WineComponent()
    {
        System.out.println("WineComponent started");
    }

    @PostConstruct
    public void onInit()
    {
        System.out.println("onInit() started in WineComponent with @PostConstruct");
        companyLocation= Stream.of("Mumbai","Pune","Bangalore","Hyderabad","Chennai","Delhi","Ahmedabad","Gurgaon").collect(Collectors.toList());
    }



    @Autowired
    private WineService wineService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(LocalDate.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                if (text != null && !text.isEmpty()) {
                    setValue(LocalDate.parse(text, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                }
            }
        });
    }

    @PostMapping("/Wine")
    public String takeWine(@Valid WineDto wineDto, BindingResult bindingResult, Model model)
    {
        System.out.println("takeWine() started with @PostMapping");
        if(bindingResult.hasErrors())
        {
            model.addAttribute("error","Validation failed. please check the details");
            List<ObjectError> error=bindingResult.getAllErrors();
            model.addAttribute("errors",error);
            model.addAttribute("dto",wineDto);
            model.addAttribute("companyLocation",companyLocation);
        }
        else
        {
            System.out.println(wineDto);
            System.out.println("Validation passed");
            wineService.save(wineDto);
            model.addAttribute("message","Wine saved successfully");
            model.addAttribute("dto",new WineDto());
            model.addAttribute("companyLocation",companyLocation);
        }
        return "Wine.jsp";
    }

    @GetMapping("/Wine")
    public String startWine(Model model)
    {
        System.out.println("startWine() started with @GetMapping");
        model.addAttribute("companyLocation",companyLocation);

        return "Wine.jsp";
    }
}
