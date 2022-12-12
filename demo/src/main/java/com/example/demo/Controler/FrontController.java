package com.example.demo.Controler;

import com.example.demo.Entities.*;
import com.example.demo.Services.IServiceCategory;

import com.example.demo.Services.IServiceCity;
import com.example.demo.Services.IServiceDepartment;
import com.example.demo.Services.IServiceUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.net.http.HttpClient;
import java.util.List;

@Controller
public class FrontController {
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

    @RequestMapping(method = RequestMethod.GET,value="/")
    //@ResponseBody para indicar que el resultado del método lo vuelque en el cuerpo de la respuesta.
    public String home(Model model, @AuthenticationPrincipal OidcUser principal){
        if (principal != null){

            Users user=ServicioUser.buscaryguardar(principal.getClaims());
            model.addAttribute("user",user);
        }

        return "index";
    }


    @RequestMapping(value = "/booking/new/{Correo}",method = RequestMethod.GET,produces="application/json")
//@ResponseBody para indicar que el resultado del método lo vuelque en el cuerpo de la respuesta.

    //@RequestBody convierte los datos json enviado por http de ID en formato variable para poder manipularlo
    //@PathVariable busca en la url el [id] y lo transforma en el tipo long ej: http://localhost:8080/Users/public/login/1
    public String userCorreo (Model model,@PathVariable String Correo) {
            model.addAttribute("correo",Correo);
        //ServicioUser SE UTILIZA LOS SERVICIOS DE LA INTERFAZ PARA ACCEDER A LOS METODOS DEL SERVICIO
         return  "redirect:/bookings/news/{Correo}";
         //preguntar porque usar redirect y no return
    }

    @GetMapping("/user")
    public String users(Model model){
        List<Users> users=this.ServicioUser.findall();
        model.addAttribute("users",users);
        return "mapa";
    }
    @GetMapping("/bookings/news/{Correo}")
    public String newBooking(Model model,@PathVariable String Correo){
        model.addAttribute("booking",new Bookings());
        Users users=ServicioUser.buscarApellido(Correo);
        if(users!=null) {
            model.addAttribute("id", users.getId());
        }
        return "reserva";
    }







}
