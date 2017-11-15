package com.gonzazago.HayEquipo.controller;


import com.gonzazago.HayEquipo.dto.UsuarioDTO;
import com.gonzazago.HayEquipo.entities.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.gonzazago.HayEquipo.services.UserService;

import java.util.*;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    private static UserService userService;

    @PostMapping(value="/save-user",produces = "application/json")
    public ResponseEntity<UsuarioDTO> crearUsuario(@RequestBody UsuarioDTO user) throws Exception {

        Usuario userCreado = userService.registrarUsuario(user);

        return new ResponseEntity(userCreado, HttpStatus.CREATED);


    }

    @RequestMapping(value = "/getAlls")
    public List<UsuarioDTO> getAllUser() {
        List<UsuarioDTO> user = new ArrayList<>();

        UsuarioDTO usr = new UsuarioDTO();

        usr.setNombre("Gonzalo");
        usr.setApellido("Zago");
        usr.setMail("gonza@mail.com");

        user.add(usr);


        return user;
    }

}
