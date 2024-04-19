package com.f1.f1list;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class F1controller {
    @GetMapping("/mensaje")
    public String obtenerMensaje() {
        return "¡Hola! Este es un mensaje de prueba.";
    }
}
