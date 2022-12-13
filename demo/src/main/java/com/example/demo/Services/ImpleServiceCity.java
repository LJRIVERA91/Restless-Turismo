package com.example.demo.Services;

import com.example.demo.Entities.City;
import com.example.demo.Entities.Department;
import com.example.demo.Entities.Users;
import com.example.demo.repositories.IRepositoriyDepartment;
import com.example.demo.repositories.IRepositoryCity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImpleServiceCity implements IServiceCity{
    //permite inyectar unas dependencias con otras dentro de Spring
    @Autowired
    // es privado para que nadie acceda
    private IRepositoryCity RepositoryCity;
    @Autowired
    // es privado para que nadie acceda
    private IRepositoriyDepartment RepositoriyDepartment;

    @Override
    //SE ACCEDE A LA BASE DE DATOS Y SE OBTIENE UNA LISTA DE OBJETO
    public List<City> listCity(){

        return this.RepositoryCity.findAll();
    }

    @Override
    //SE ACCEDE A LA BASE DE DATOS Y SE OBTIENE UNA LISTA DE OBJETO
    public List<City> listCitybyDepartment(String department){
       Department department1 = RepositoriyDepartment.findBynombre(department);

        return (List<City>) this.RepositoryCity.findByDepartment(department1.getId());
    }
}
