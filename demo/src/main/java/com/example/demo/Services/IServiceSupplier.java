package com.example.demo.Services;

import com.example.demo.Entities.City;
import com.example.demo.Entities.supplier;

import java.util.List;

public interface IServiceSupplier {
    //SE ACCEDE A LA BASE DE DATOS Y SE OBTIENE UNA LISTA DE OBJETO
    List<supplier> listSupplirbyDepartAndCateg(long id, long id1);

}


