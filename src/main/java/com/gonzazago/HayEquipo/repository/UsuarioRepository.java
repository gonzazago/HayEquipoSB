package com.gonzazago.HayEquipo.repository;

import com.gonzazago.HayEquipo.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {


}
