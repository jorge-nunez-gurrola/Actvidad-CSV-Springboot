package com.example.csvService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ciudades")
public class CiudadController {
    
    @Autowired
    private CiudadService ciudadService;

    @GetMapping("/todas")
    public List<Ciudad> getAllCiudades()  {
        // El link hacia el csv cambiaria dependiendo de su ubicacion en cada dispositivo
        return ciudadService.ciudadCSV("C:/Users/USER/Documents/GitHub/Actvidad-CSV-Springboot/csvService/mx.csv");
    }
}
