package com.example.demo.Services;

import com.example.demo.Entities.Category;
import com.example.demo.Entities.Users;
import com.example.demo.repositories.IRepositoryCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

//@Service RECONOCE QUE ESTO ES UN SERVICIO
@Service

public class ImpleServiceCategory implements IServiceCategory{
    //@Autowired: TRAE INTERFAZ DEL BASE DE DATOS Department (BASE DE DATOS) con el nombre RepositoryDepartment
    @Autowired
    // es privado para que nadie acceda
    private IRepositoryCategory RepositoryCategory;
    @Override
    //SE ACCEDE A LA BASE DE DATOS Y SE OBTIENE UNA LISTA DE OBJETO
    public List<Category> listCategory(){

        return this.RepositoryCategory.findAll();
    }
    @Override
      public Category buscarID(Map<String,Object> categoryDate){
       String nombre= (String) categoryDate.get("nombre");
       Category categorys =buscarNombre(nombre);
       if (categorys==null){
           long id= (Long) categoryDate.get("id");
          Category category=new Category(id=id,nombre=nombre);
       }
      System.out.println(categorys.getId());
       return categorys;
   }

    @Override
    public Category buscarNombre( String id) {

        return this.RepositoryCategory.findBynombre(id);
    }
}
