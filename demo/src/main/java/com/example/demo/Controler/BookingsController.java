package com.example.demo.Controler;


import com.example.demo.Entities.Bookings;
import com.example.demo.Entities.Users;
import com.example.demo.Services.BookingService;
import org.springframework.format.annotation.DateTimeFormat;
import com.example.demo.Services.IServiceUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

//@RestController:anotacion que indica que esto es un   controlador
@RestController
//@RequestMapping: define le URL donde se hara la peticion (http://localhost:8080/Users/(end poit al que deseo ingresar))
public class BookingsController {
        BookingService service;
        @Autowired
        IServiceUsers ServicioUser;

        public BookingsController(BookingService service){
                        this.service=service;
        }

        @PostMapping("/booking")
        public RedirectView createBooking(@ModelAttribute @DateTimeFormat(pattern = "YYYY-MM-DD") Bookings booking,Model model){
                    model.addAttribute(booking);
                    this.service.save(booking);
                    System.out.println("Se guardo reserva con exito");
                    return new RedirectView("/inicio1");

        }
}
