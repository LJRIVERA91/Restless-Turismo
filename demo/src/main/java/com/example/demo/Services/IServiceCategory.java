package com.example.demo.Services;

import com.example.demo.Entities.Category;

import java.util.List;

public interface IServiceCategory {
    //SE ACCEDE A LA BASE DE DATOS Y SE OBTIENE UNA LISTA DE OBJETO
    List<Category> listCategory();
}
