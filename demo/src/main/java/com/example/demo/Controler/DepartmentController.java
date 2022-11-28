package com.example.demo.Controler;


import com.example.demo.Entities.Department;
import com.example.demo.Entities.Users;
import com.example.demo.Services.IServiceDepartment;
import com.example.demo.Services.IServiceUsers;
import com.example.demo.repositories.IRepositoriyDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController:anotacion que indica que esto es un   controlador
@Controller

//@RequestMapping: define le URL donde se hara la peticion (http://localhost:8080/departmen(end poit al que deseo ingresar))
@RequestMapping("departmen")
public class DepartmentController {
    ////@Autowired: TRAE INTERFAZ DEL IserviceUsers  (BASE DE DATOS) y pordebajo toda la logica de ImpleServicesUsers
    @Autowired
    private IServiceDepartment ServiceDepartment;









}
