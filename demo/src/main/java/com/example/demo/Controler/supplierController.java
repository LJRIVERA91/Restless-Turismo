package com.example.demo.Controler;

import com.example.demo.Entities.City;
import com.example.demo.Entities.Department;
import com.example.demo.Entities.supplier;
import com.example.demo.Services.IServiceDepartment;
import com.example.demo.Services.IServiceSupplier;
import com.example.demo.Services.ImpleServiceSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//@Controller:anotacion que indica que esto es un   controlador y que necesita @ResponseBody para regresar la informacion
@Controller
//@RequestMapping: define le URL donde se hara la peticion (http://localhost:8080/supplier(end poit al que deseo ingresar))
@RequestMapping("supplier")

public class supplierController {
    //_____________________________________________SERVICIOS________________________________________
    ////@Autowired: TRAE INTERFAZ DEL IserviceUsers  (BASE DE DATOS) y pordebajo toda la logica de ImpleServicesUsers
    @Autowired
    private IServiceSupplier ServiceSupplier;

    //______________________________________________OBTNER CIUDADES___________________________________________________________
    //@RequestMapping: end point de peticion
    //method:ES EL VERBO CON EL QUE ACCESO POST GET DELET PATCH
    //value:UBICACION ENDPOINT
    //params={"city","category"} SE REUPERAN ESTOS DOS VALORES
    @RequestMapping(method = RequestMethod.GET,value="/searchSupplier",params={"city","category"})
    //@ResponseBody para indicar que el resultado del método lo vuelque en el cuerpo de la respuesta.
    //@RequestBody convierte los datos json enviado por http de user en formato objeto para poder manipularlo
    //@RequestParam RECUPERO LOS DATOS Y LOS VUELTO VARIABLES
    public @ResponseBody List<supplier> searchSupplier(@RequestParam long city,@RequestParam long category) {


        //RETORNO LISTA CONSULTADA
        return this.ServiceSupplier.listSupplirbyDepartAndCateg(city,category);
    }

}
