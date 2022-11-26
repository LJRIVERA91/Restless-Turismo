package com.example.demo.Entities;
import javax.persistence.*;

@Entity

@Table(name="restaurant")
public class Restaurant {
    @Id
    //@GeneratedValue :LE DA UN VALOR AUTOMATICO AL ATRIBUTO DEACUERDO A UN FUNCION EN ESTA CASO AUTO INCREMENTANDO
    @GeneratedValue(strategy = GenerationType.AUTO )
    //id :CONTIENE LO DEFINIDO EN @Id Y @GeneratedValue
    private long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "categoria")
    private  String categoria;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "contacto")
    private String contacto;

    public Restaurant(){

    }

    public Restaurant(String nombre, String imagen, String categoria, String direccion, String contacto) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.categoria = categoria;
        this.direccion = direccion;
        this.contacto = contacto;
    }

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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
}
