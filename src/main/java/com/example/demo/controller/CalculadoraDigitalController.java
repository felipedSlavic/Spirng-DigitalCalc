package com.example.demo.controller;

import com.example.demo.service.CalculadoraDigitalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/digital")
public class CalculadoraDigitalController {
   private final CalculadoraDigitalService calcularService;

    public CalculadoraDigitalController(CalculadoraDigitalService calcularService) {
        this.calcularService = calcularService;
    }

    @GetMapping("/download")
    public String tempoDowloand(@RequestParam double info1, @RequestParam double info2) {
        try {
            return String.valueOf(calcularService.estimarDowloand(info1,info2));
        } catch (IllegalArgumentException e){
            return e.getMessage();
        }
    }

    @GetMapping("/fotos")
    public String tempoFotos(@RequestParam double info1, @RequestParam double info2) {
        try {
            return String.valueOf(calcularService.estimarFotos(info1,info2));
        } catch (IllegalArgumentException e){
            return e.getMessage();
        }
    }


    @GetMapping("/franquia")
    public String tempoFranquia(@RequestParam double info1, @RequestParam double info2) {
        try {
            return String.valueOf(calcularService.estimarUsoFranquia(info1,info2));
        } catch (IllegalArgumentException e){
            return e.getMessage();
        }
    }
}
