package com.api.sales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api/clientes/hello/{nome}", method = RequestMethod.GET)
@ResponseBody
public class ClientController {


    public String helloClient( @PathVariable("name") String nameClient ){
        return String.format("Hello %s ", nameClient);
    }

}

