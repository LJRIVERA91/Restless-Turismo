package com.example.demo.Services;

import com.example.demo.Entities.City;

import java.util.List;

public interface IServiceCity {
    //SE ACCEDE A LA BASE DE DATOS Y SE OBTIENE UNA LISTA DE OBJETO
    List<City> listCity();

    //SE ACCEDE A LA BASE DE DATOS Y SE OBTIENE UNA LISTA DE OBJETO
    List<City> listCitybyDepartment(String department);
    //SE ACCEDE A LA BASE DE DATOS Y SE OBTIENE UNA LISTA DE OBJETO

}
