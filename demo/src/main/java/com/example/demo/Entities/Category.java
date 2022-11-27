package com.example.demo.Entities;

import javax.persistence.*;

//(BD)@Entity :CREA LA TABLA (Department) EN BASE EN LA CLASE  (Department)
@Entity
//@Table:CREO LA ENTIDAD (Department) EN LA BASE DE DATOS
@Table(name="Category")
public class Category {
    //SECCION 2__________________________________________ATRIBUTOS______________________________________________________
    //@Id :SEÑALA QUE EL ATRIBUTO DESPUES DE @Id ES LA PRIMARY KEY
    @Id
    //@GeneratedValue :LE DA UN VALOR AUTOMATICO AL ATRIBUTO DEACUERDO A UN FUNCION EN ESTA CASO AUTO INCREMENTANDO
    @GeneratedValue(strategy = GenerationType.AUTO )
    //id :CONTIENE LO DEFINIDO EN @Id Y @GeneratedValue
    private long id;
    //@Column crea la columna nombre
    @Column(name = "nombre")
    private String nombre;

    //SECCION 4__________________________________________CONTRUCTOR_____________________________________________________

    public Category() {
    }

    public Category(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //SECCION 5__________________________________________GETTER AND SETTER______________________________________________


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
