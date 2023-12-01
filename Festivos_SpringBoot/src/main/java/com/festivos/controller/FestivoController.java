package com.festivos.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.festivos.model.FestivoOperaciones;
import com.festivos.service.FestivoServicio;

@RestController
@RequestMapping("/festivos")
public class FestivoController {
    
    @Autowired
    private FestivoServicio festivoServicio;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/verificar/{año}/{mes}/{dia}", method = RequestMethod.GET)
    public String verificarFestivo(@PathVariable int año, @PathVariable int mes, @PathVariable int dia) {
        if (festivoServicio.esFechaValida(String.valueOf(año) + "-" + String.valueOf(mes) + "-" + String.valueOf(dia))) {
            Date fecha = new Date(año - 1900, mes - 1, dia);
            return festivoServicio.esFestivo(fecha) ? "Es Festivo" : "No es festivo";
        } else {
            return "Fecha No valida";
        }

    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/obtener/{año}", method = RequestMethod.GET)
    public List<FestivoOperaciones> obtener(@PathVariable int año) {
        return festivoServicio.obtenerFestivos(año);
    }
}
