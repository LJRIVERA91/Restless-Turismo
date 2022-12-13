package com.example.demo.Controler;


import com.example.demo.Entities.Category;
import com.example.demo.Entities.Department;
import com.example.demo.Entities.Users;
import com.example.demo.Services.IServiceCategory;
import com.example.demo.Services.IServiceCity;
import com.example.demo.Services.IServiceDepartment;
import com.example.demo.Services.IServiceUsers;
import com.example.demo.repositories.IRepositoriyDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller:anotacion que indica que esto es un   controlador y que necesita @ResponseBody para regresar la informacion
@Controller


public class DepartmentController {
    //_______________________________________________SERVIIOS__________________________________________________________
    ////@Autowired: TRAE INTERFAZ DEL IserviceUsers  (BASE DE DATOS) y pordebajo toda la logica de ImpleServicesUsers
    @Autowired
    IServiceUsers ServicioUser;
    @Autowired
    private IServiceDepartment ServiceDepartment;
    @Autowired
    private IServiceCategory ServiceCategory;
    @Autowired
    private IServiceCity ServiceCity;

    //_______________________________________________METODOS__________________________________________________________

    @RequestMapping(value = "/booking/login/{Apellido}",method = RequestMethod.GET,produces="application/json")
//@ResponseBody para indicar que el resultado del método lo vuelque en el cuerpo de la respuesta.

    //@RequestBody convierte los datos json enviado por http de ID en formato variable para poder manipularlo
    //@PathVariable busca en la url el [id] y lo transforma en el tipo long ej: http://localhost:8080/Users/public/login/1
    //MODEL: ES UN CONTENEDOR QUE LLEVA DATOS AL HTML
    public String findById (Model model ,@PathVariable String Apellido) {
        // System.out.println(id);

        //SE ENVIA EL CORREO PARA LLEVARLO A LA URL ____________________________________________________________________
        String correo=Apellido;
        model.addAttribute("correo",correo);
        //ServicioUser SE UTILIZA LOS SERVICIOS DE LA INTERFAZ PARA ACCEDER A LOS METODOS DEL SERVICIO

        //CARGO LA LISTA DE OBJETOS DE DEPARTAMENTOS____________________________________________________________________
        List<Department> lista=this.ServiceDepartment.listDepartmen();
        //ENVIA LOS DATO AL HTML
        model.addAttribute("lista",lista);

        //CARGO LA LISTA DE OBJETOS DE CATEGORIA____________________________________________________________________
        List<Category> listaCategoy=this.ServiceCategory.listCategory();
        //ENVIA LOS DATO AL HTML
        model.addAttribute("listaCategoy",listaCategoy);


        return "mapa";
    }



    }










