package com.example.demo.Services;

import com.example.demo.Entities.City;
import com.example.demo.repositories.IRepositoryCity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImpleServiceCity implements IServiceCity{
    @Autowired
    // es privado para que nadie acceda
    private IRepositoryCity RepositoryCity;

    @Override
    //SE ACCEDE A LA BASE DE DATOS Y SE OBTIENE UNA LISTA DE OBJETO
    public List<City> listCity(){

        return this.RepositoryCity.findAll();
    }
}
