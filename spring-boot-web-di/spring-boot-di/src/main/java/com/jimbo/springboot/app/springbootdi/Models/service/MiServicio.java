package com.jimbo.springboot.app.springbootdi.Models.service;

//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;

//@Component("miServicioSimple")
//@Primary
public class MiServicio implements Iservice {
    @Override
    public String operacion() {
        return "ejecutando algun proceso importante simple...";
    }
}
