package com.anfabv.logistica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/documentos")
    public String documentos() {
        return "documents/documentos";
    }
}
