package com.example.demo.Services;

import com.example.demo.Entities.Category;
import com.example.demo.Entities.Users;

import java.util.List;
import java.util.Map;

public interface IServiceCategory {
    //SE ACCEDE A LA BASE DE DATOS Y SE OBTIENE UNA LISTA DE OBJETO
    List<Category> listCategory();

    public Category buscarID(Map<String,Object> categoryDate);
    public Category buscarNombre(String id);
}
