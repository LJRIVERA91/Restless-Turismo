package com.example.demo.Services;

import com.example.demo.Entities.Department;
import com.example.demo.repositories.IRepositoriyDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//**********************************************************************************************************************
//____________________________________QUE ES UN SERVICIO_CLASE_________________________________________________________*
//_____________________________________________________________________________________________________________________*
//SERVICIO:LO QUE VOY A HACER CUANDO ME LLEGUE UN PETICION DEL CONTROLADOR y HALLA PASADO POR LA INTERFACE SERVICIO____*
//_________CLASE: LOGICA DEL SERVICIO _________________________________________________________________________________*
//¿QUE HAY AQUI?: AQUI ES DONDE SE HARAN LAS OPERACIONES CON LOS DATOS QUE SE EXTRAIGAN DE LA BASE DE DATOS____________*
//_____________________________________________________________________________________________________________________*
//_________ImpleServiceUsers: AQUI IMPLEMENTAMOS LOS SERVICIONS DE IServiceUsers O GENRAMOS LA LOGICA__________________*
//**********************************************************************************************************************

//@Service RECONOCE QUE ESTO ES UN SERVICIO
@Service



//implements: Enviamos LAS FUNCIONES A L INTERFAZ IServiceDepartment
public class ImpleServiceDeparment implements IServiceDepartment{
    //@Autowired: TRAE INTERFAZ DEL BASE DE DATOS Department (BASE DE DATOS) con el nombre RepositoryDepartment
    @Autowired
    // es privado para que nadie acceda
    private IRepositoriyDepartment RepositoryDepartment;



    @Override
    //SE ACCEDE A LA BASE DE DATOS Y SE OBTIENE UNA LISTA DE OBJETO
    public List<Department> listDepartmen(){

        return this.RepositoryDepartment.findAll();
    }



}
