package com.example.demo.Entities;

import javax.persistence.*;
import java.time.LocalDate;

//(BD)@Entity :CREA LA TABLA (Users) EN BASE EN LA CLASE  (Users)
@Entity
//@Table:CREO LA ENTIDAD (Users) EN LA BASE DE DATOS
@Table(name="Booking")
public class Bookings {

    //SECCION 2__________________________________________ATRIBUTOS_________________________________________________________________

    //@Id :SEÑALA QUE EL ATRIBUTO DESPUES ES LA PRIMARY KEY
    @Id
    //@GeneratedValue :LE DA UN VALOR AUTOMATICO AL ATRIBUTO DEACUERDO A UN FUNCION EN ESTA CASO AUTO INCREMENTANDO
    @GeneratedValue(strategy = GenerationType.AUTO )
    //id :CONTIENE LO DEFINIDO EN @Id Y @GeneratedValue
    private long id;
    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "hora")
    private String hora;

    @Column(name = "descripcion")
    private String descripcion;

    //SECCION 3________________________________CARDINALIDA O LLAVES FORENAEAS________________________________________________________________

    //ManyToOne: DEFINICION
    //ManyToOne: DEFINICION  Many: muchas facturas (la clase facturas)
    //ManyToOne: DEFINICION  One: un Usuario (la variable Users)
    @ManyToOne
    //COLUMNA LLAVE FORANES (FK)
    @JoinColumn(name="Booking_Users")
    //UNIDO AL OBJETO Users que es una entidad
    Users user;
    //SECCION 4__________________________________________CONTRUCTOR_______________________________________________________________

    public Bookings(){

    }

    public Bookings(LocalDate fecha, String hora, String descripcion, Users user) {
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;
        this.user = user;
    }

    //SECCION 5__________________________________________GETTER AND SETTER_________________________________________________________________


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
