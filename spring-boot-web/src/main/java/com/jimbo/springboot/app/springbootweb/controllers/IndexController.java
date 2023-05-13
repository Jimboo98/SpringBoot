package com.jimbo.springboot.app.springbootweb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jimbo.springboot.app.springbootweb.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({ "/index", "/", "/home" })
    public String index(Model model) {
        model.addAttribute("titulo", "hola spring Framework con model");
        return "index";
    }

    @RequestMapping("/perfil")
    public String perfil(Model model){
        Usuario usuario = new Usuario();
        usuario.setNombre("Jaime");
        usuario.setApellido("Orozco");
        usuario.setEmail("jaime@orozco.com");
        model.addAttribute("usuario", usuario);

        model.addAttribute("titulo", "Perfil del usuario: " .concat(usuario.getNombre()));

        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar (Model model){
        List <Usuario> usuarios = new ArrayList<>();
        model.addAttribute("titulo", "Listado de usuarios");
        model.addAttribute("usuarios", usuarios);
        return "listar";
    }

}
