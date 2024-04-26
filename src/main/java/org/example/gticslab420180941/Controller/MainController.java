package org.example.gticslab420180941.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping(value = "/Empleados", method = RequestMethod.GET)
    @ResponseBody
    public String Empleados(){
        return "Empleados";
    }
}

@GetMapping("/listar")
public String listarEmpleados(){

}