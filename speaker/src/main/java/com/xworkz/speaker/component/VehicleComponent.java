package com.xworkz.speaker.component;

import com.xworkz.speaker.dto.VehicleDto;
import com.xworkz.speaker.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")

public class VehicleComponent {
    public VehicleComponent() {
        System.out.println("VehicleComponent started");
    }

    @PostMapping("/vehicle")
    public String vehicleStart(Model model, @Valid VehicleDto vehicleDto , BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            System.out.println("Errors in VehicleDto");
            model.addAttribute("error", "Validation failed. Please check the form.");
            List<ObjectError> error = bindingResult.getAllErrors();
            model.addAttribute("errors", error);
        }

        else {
            System.out.println("Running vehicleStart() in VehicleComponent");
            vehicleService.save(vehicleDto);
            System.out.println(vehicleDto);
            System.out.println("Vehicle saved successfully");
            model.addAttribute("success", "Vehicle saved successfully");
            }
            return "Vehicle.jsp";

    }

    @Autowired
    private VehicleService vehicleService;
}
