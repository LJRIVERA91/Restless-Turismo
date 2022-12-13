package com.example.demo.Controler;


import com.example.demo.Entities.Bookings;
import com.example.demo.Entities.Users;
import com.example.demo.Entities.Category;
import com.example.demo.Services.BookingService;
import org.springframework.format.annotation.DateTimeFormat;
import com.example.demo.Services.IServiceUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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
        public RedirectView createBooking(@ModelAttribute @DateTimeFormat(pattern = "YYYY-MM-DD") Bookings booking,Model model,Users id, RedirectAttributes redirectAttrs){
                    model.addAttribute(booking);
                    booking.setUser(id);
                    booking.setEstado(true);
                    this.service.save(booking);
                    redirectAttrs.addFlashAttribute("mensaje","Reserva realizada con exito")
                                  .addFlashAttribute("clase","success");
                    System.out.println(booking.getCategory());
                    return new RedirectView("/user");
        }
}
