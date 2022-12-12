package com.example.demo.repositories;

import com.example.demo.Entities.Category;
import com.example.demo.Entities.City;
import com.example.demo.Entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
//**********************************************************************************************************************
//__________________________________________QUE ES UN REPOSITORIO?_____________________________________________________*

//_________________ES UNA INTERFACE QUE CONSULTA DIRECTAMNETE EN LA BASE DE DATOS______________________________________*
//_____________*___AL ACCEDER A LOS METODO EXTENDIDOS CrudRepository __________________________________________________*
//_________________ACCEDEMOS A FUNCION DEL CRUD , COMO ELIMINAR , BUSCAR , EDITAR Q____________________________________*
//_________________ YA ESTAN PROGRAMADAS EN ESA FUNCION (CrudRepository)_______________________________________________*
//_____________*____AL ACCEDER A LOS METODO EXTENDIDOS  JPARepository__________________________________________________*
//_________________ACCEDEMOS A FUNCION DEL CRUD , COMO ELIMINAR , BUSCAR , EDITAR _____________________________________*
//_________________PERO TAMBIEN NOS DEJA HACER CONSULTAS SQL CON @query________________________________________________*
//__________CrudRepository <Users,Long> Users: ES LA ENTIDAD DONDE SE HARA EL CRUD_____________________________________*
//__________CrudRepository <Users,Long> Long: ES EL TIPO DE DATO DE LA LLAVE PRIMARIA _________________________________*
//**********************************************************************************************************************

public interface IRepositoryCity extends JpaRepository<City,Long> {
    //@Query=anotacion para hacer consulta




    @Query(value ="SELECT * FROM city u WHERE u.city_departamento = :id",nativeQuery = true)

    //@Param=pasa los datos del id a param para enviarlo a la consulta @Query
    List<City> findByDepartment( @Param("id") long id);  //busca por nombre de departamnwto q contiene una ciudad

}
