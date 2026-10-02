package com.xworkz.speaker.component;

import com.xworkz.speaker.dto.VehicleDto;
import com.xworkz.speaker.service.VehicleService;
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
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
@RequestMapping("/vehicle")
public class VehicleComponent {

    List<String> vehicleBrand;
    List<String> vehicleModel;
    List<String> vehicleAvail;

    public VehicleComponent() {
        System.out.println("VehicleComponent started");
    }

    @PostConstruct
    public void onInit()
    {
        System.out.println("onInit() in VehicleComponent");
        vehicleBrand= Stream.of("Toyota","Honda","Ford","BMW","Mercedes","Audi","Hyundai","Maruti","Tata","Mahindra").collect(Collectors.toList());
        vehicleModel= Stream.of("Sedan","SUV","Hatchback","Coupe","Convertible","MPV","Pickup","Wagon").collect(Collectors.toList());
        vehicleAvail=Stream.of("Available","Not Available").collect(Collectors.toList());
    }

    @PostMapping
    public String vehicleStart(@Valid VehicleDto vehicleDto, Model model , BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            System.out.println("Errors in VehicleDto");
            model.addAttribute("error", "Validation failed. Please check the form.");
            List<ObjectError> error = bindingResult.getAllErrors();
            model.addAttribute("errors", error);
            model.addAttribute("dto",vehicleDto);
        }

        else {
            System.out.println("Running vehicleStart() in VehicleComponent");
            vehicleService.save(vehicleDto);
            System.out.println(vehicleDto);

            System.out.println("no errors in validation, saving the vehicle");
            model.addAttribute("success", "Vehicle saved successfully");
            model.addAttribute("dto",new VehicleDto());

            model.addAttribute("vehicleBrand", vehicleBrand);
            model.addAttribute("vehicleModel", vehicleModel);
            model.addAttribute("vehicleAvail", vehicleAvail);
            }

            return "Vehicle";

    }

    @GetMapping
    public String vehicleStart(Model model) {
        System.out.println("Running vehicleStart() in VehicleComponent");

         model.addAttribute("vehicleBrand", vehicleBrand);

        model.addAttribute("vehicleModel", vehicleModel);

        model.addAttribute("vehicleAvail", vehicleAvail);

        return "Vehicle";
    }

    @Autowired
    private VehicleService vehicleService;
}
