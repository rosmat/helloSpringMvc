package com.mycompany.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
final class PlaintextController {

    private static final String HELLO_WORLD = "Hello, World!";

    @RequestMapping(value = "/plaintext", produces = "text/plain")
    String plaintext() {
        return HELLO_WORLD;
    }

}
