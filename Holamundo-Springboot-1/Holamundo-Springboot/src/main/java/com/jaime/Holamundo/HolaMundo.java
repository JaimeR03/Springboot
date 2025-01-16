package com.jaime.Holamundo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")
public class HolaMundo {

    @GetMapping
    @ResponseBody
 public String mostrarMensaje(){

     return"Hola mundo en Spring boot";
    }



}
