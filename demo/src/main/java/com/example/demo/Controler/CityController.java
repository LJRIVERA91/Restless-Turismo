package com.example.demo.Controler;



import com.example.demo.Entities.Bookings;
import com.example.demo.Entities.City;
import com.example.demo.Entities.Users;
import com.example.demo.Services.IServiceCity;
import com.example.demo.Services.IServiceDepartment;
import com.example.demo.Services.IServiceUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller:anotacion que indica que esto es un   controlador y que necesita @ResponseBody para regresar la informacion
@Controller
//@RequestMapping: define le URL donde se hara la peticion (http://localhost:8080/city(end poit al que deseo ingresar))
@RequestMapping("city")
public class CityController {
    //_____________________________________________SERVICIOS________________________________________
    ////@Autowired: TRAE INTERFAZ DEL IserviceUsers  (BASE DE DATOS) y pordebajo toda la logica de ImpleServicesUsers
    @Autowired
    private IServiceDepartment ServiceDepartment;
    @Autowired
    private IServiceCity ServiceCity;


    //______________________________________________OBTNER CIUDADES___________________________________________________________
    //@RequestMapping: end point de peticion
    //method:ES EL VERBO CON EL QUE ACCESO POST GET DELET PATCH
    //value:UBICACION ENDPOINT
    //params=RECUPERA EL VALOR ENVIADO POR URL
    @RequestMapping(method = RequestMethod.GET,value="/searchCity", params="departament")
    //@ResponseBody para indicar que el resultado del método lo vuelque en el cuerpo de la respuesta.
    //@RequestBody convierte los datos json enviado por http de user en formato objeto para poder manipularlo
    public @ResponseBody List<City> searchCity(Model model,@RequestParam String departament) {
        //AjaxResponseBody result = new AjaxResponseBody();
        System.out.println(departament);



        //CARGO LA LISTA DE OBJETOS DE CIUDADES____________________________________________________________________
        List<City> listaCity=this.ServiceCity.listCitybyDepartment(departament);


        return listaCity;
    }





}
