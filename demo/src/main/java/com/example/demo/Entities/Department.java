package com.example.demo.Entities;

import javax.persistence.*;

//(BD)@Entity :CREA LA TABLA (Department) EN BASE EN LA CLASE  (Department)
@Entity
//@Table:CREO LA ENTIDAD (Department) EN LA BASE DE DATOS
@Table(name="Departmen")
public class Department {

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

    @Column(name = "coodenadas")
    private String coodenadas;


    //SECCION 3________________________________CARDINALIDA O LLAVES FORENAEAS___________________________________________




    //SECCION 4__________________________________________CONTRUCTOR_____________________________________________________

    public Department() {
    }

    public Department(long id, String nombre,String coodenadas) {
        this.id = id;
        this.nombre = nombre;
        this.coodenadas = coodenadas;
    }

    //SECCION 5__________________________________________GETTER AND SETTER______________________________________________


    public long getId() { return id;}

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCoodenadas() {
        return coodenadas;
    }

    public void setCoodenadas(String coodenadas) {
        this.coodenadas = coodenadas;
    }
}
