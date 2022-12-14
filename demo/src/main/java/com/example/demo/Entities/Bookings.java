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
    @GeneratedValue(strategy = GenerationType.AUTO)
    //id :CONTIENE LO DEFINIDO EN @Id Y @GeneratedValue
    private long id;
    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "hora")
    private String hora;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private boolean estado;


    //SECCION 3________________________________CARDINALIDA O LLAVES FORENAEAS________________________________________________________________


    //ManyToOne: DEFINICION  Many: muchas facturas (la clase facturas)
    //ManyToOne: DEFINICION  One: un Usuario (la variable Users)
    @ManyToOne
    //COLUMNA LLAVE FORANES (FK)
    @JoinColumn(name = "Booking_Users")
    //UNIDO AL OBJETO Users que es una entidad
    private Users user;

    //SECCION 4__________________________________________CONTRUCTOR_______________________________________________________________
    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;


    //SECCION 3________________________________CARDINALIDA O LLAVES FORENAEAS________________________________________________________________


    //ManyToOne: DEFINI
    // CION  Many: muchas ciudades (la clase ciudad)
    //ManyToOne: DEFINICION  One: un departamento (la variable departmento)
    @ManyToOne
    //COLUMNA LLAVE FORANES (FK) de esta clase City unida a:
    @JoinColumn(name = "Bookings_supplier")
    //UNIDO AL OBJETO Users que es una entidad
    private Bookings bookings;

//SECCION 4__________________________________________CONTRUCTOR_____________________________________________________

    public Bookings() {
        //user= new Users();
    }

    public Bookings(LocalDate fecha, String hora, String descripcion, boolean estado, Users user, Category category) {
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;
        this.estado = estado;
        this.user = user;
        this.category = category;
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


    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;


    }
    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Bookings getBookings() {
        return bookings;
    }

    public void setBookings(Bookings bookings) {
        this.bookings = bookings;
    }
}