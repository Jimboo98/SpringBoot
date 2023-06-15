package com.jimbo.springboot.app.springbootdi.Models.service;


//import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")

public class MiServicioComplejo implements Iservice{
    @Override
    public String operacion(){
        return "ejecutando algun proceso importante complejo...";
    }
}
