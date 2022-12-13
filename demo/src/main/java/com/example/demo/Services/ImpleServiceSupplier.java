package com.example.demo.Services;

import com.example.demo.Entities.supplier;
import com.example.demo.repositories.IRepositorysupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpleServiceSupplier implements IServiceSupplier {
    @Autowired
    // es privado para que nadie acceda
    private IRepositorysupplier Repositorysupplier;



    @Override
    //SE ACCEDE A LA BASE DE DATOS Y SE OBTIENE UNA LISTA DE OBJETO
    public List<supplier> listSupplirbyDepartAndCateg(long id, long id1){


        return  this.Repositorysupplier.findBysupplier(1,1);
    }
}
