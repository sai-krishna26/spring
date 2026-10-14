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
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
@RequestMapping("/Wine")
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


    @PostMapping
    public String takeWine(Model model, @Valid WineDto wineDto, BindingResult bindingResult)
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
            this.wineService.save(wineDto);
            model.addAttribute("message","Wine saved successfully");
            model.addAttribute("dto",new WineDto());
            model.addAttribute("companyLocation",companyLocation);
        }
        return "Wine";
    }

    @GetMapping
    public String startWine(Model model)
    {
        System.out.println("startWine() started with @GetMapping in WineComponent");
        model.addAttribute("companyLocation",companyLocation);

        return "Wine";
    }

    @GetMapping("/showAll")
    public String showAll(Model model)
    {
        System.out.println("showAll() started with @GetMapping");
        List<WineDto> dtoList = this.wineService.findAll();
        model.addAttribute("wineDtoList",dtoList);
        return "WineData";
    }

    @GetMapping("/editWine")
    public String editWine(@RequestParam Integer id, Model model)
    {
        System.out.println("editWine() started with @GetMapping in WineComponent");
        System.out.println("editing wine id:"+id);
        WineDto wineDto=this.wineService.findById(id);

        if(wineDto!=null) {
            model.addAttribute("dto",wineDto);
            model.addAttribute("companyLocation",companyLocation);
        }
        else
        {
            model.addAttribute("error","Wine not found with id:"+id);
            model.addAttribute("companyLocation",companyLocation);
        }
        return "WineUpdate";
    }

    @PostMapping("/editWine")
    public String updateWine(Model model, @Valid WineDto wineDto, BindingResult bindingResult)
    {
        System.out.println("updateWine() started with @PostMapping");
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
            this.wineService.save(wineDto);
            model.addAttribute("message","Wine updated successfully");
            model.addAttribute("dto",wineDto);
            model.addAttribute("companyLocation",companyLocation);
        }
        return "WineUpdate";
    }
}
