package com.example.demo.Services;

import com.example.demo.Entities.Department;

import java.util.List;

public interface IServiceDepartment {



    //SE ACCEDE A LA BASE DE DATOS Y SE OBTIENE UNA LISTA DE OBJETO
    public List<Department> listDepartmen();
}
