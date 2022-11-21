package com.example.demo.Services;

import com.example.demo.Entities.Bookings;
import com.example.demo.Entities.Users;
import com.example.demo.repositories.BookingRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
public class BookingService {
    private BookingRepository repository;

    public BookingService(BookingRepository repository) {
        this.repository = repository;
    }

   public List<Bookings> getBookin(){
        return this.repository.findAll();
   }

   public Bookings save(Bookings newBooking){
        return  this.repository.save(newBooking);
   }

   /*public Bookings busqueda(long id){
        return this.repository.findbyUser(id);
   }*/

   /*public Bookings saveBookings(Map<String,Object> bookingDate){
       Long codigo= (Long) bookingDate.get("id");
       Bookings bookings =busqueda(codigo);
       if (bookings==null){
           String description= (String) bookingDate.get("descripcion");
           LocalDate fecha = (LocalDate)bookingDate.get("fecha");
           String hora= (String)bookingDate.get("hora");
           Users iduser=(Users) bookingDate.get("booking_users");
           Bookings bookings1= new Bookings(codigo=codigo,fecha=fecha,hora=hora,description=description,iduser=iduser);
           return save(bookings1);
       }
      System.out.println(bookings.getId());
       return bookings;
   }*/


    public  boolean deleteBooking(long id){
       Bookings newBookings=repository.findById(id).orElse(null);;
       boolean condicion=true;
       if (newBookings==null){
           condicion=false;
       }else {
           // ELIMINO EL ID SI SE ENCONTRO EL ID
           repository.deleteById(id);
           condicion=true;
       }
       return condicion;
   }


}

