package com.example.demo.Entities;

import javax.persistence.*;

//(BD)@Entity :CREA LA TABLA (Department) EN BASE EN LA CLASE  (Department)
@Entity
//@Table:CREO LA ENTIDAD (Department) EN LA BASE DE DATOS
@Table(name="supplier")
public class supplier {

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
    //@Column crea la columna nombre
    @Column(name = "direccion")
    private String direccion;
    //@Column crea la columna nombre
    @Column(name = "coordenadas")
    private String coordenadas;
    //SECCION 3________________________________CARDINALIDA O LLAVES FORENAEAS________________________________________________________________


    //ManyToOne: DEFINICION  Many: muchas ciudades (la clase ciudad)
    //ManyToOne: DEFINICION  One: un departamento (la variable departmento)
    @ManyToOne
    //COLUMNA LLAVE FORANES (FK) de esta clase City unida a:
    @JoinColumn(name="supplier_Category")
    //UNIDO AL OBJETO Users que es una entidad
    private  Category category;


    //ManyToOne: DEFINICION  Many: muchas ciudades (la clase ciudad)
    //ManyToOne: DEFINICION  One: un departamento (la variable departmento)
    @ManyToOne
    //COLUMNA LLAVE FORANES (FK) de esta clase City unida a:
    @JoinColumn(name="supplier_City")
    //UNIDO AL OBJETO Users que es una entidad
    private  City city;
    //SECCION 4__________________________________________CONTRUCTOR_____________________________________________________
    public supplier() {
    }

    public supplier(long id, String nombre, String direccion, String coordenadas, Category category, City city) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.coordenadas = coordenadas;
        this.category = category;
        this.city = city;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}