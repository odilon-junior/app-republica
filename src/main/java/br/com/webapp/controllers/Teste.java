package br.com.webapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by odilon on 14/01/17.
 */


@RestController
public class Teste {

    @RequestMapping(value = "teste", method = RequestMethod.GET)
    public String init(){
        return "Alo mundo";
    }

}
