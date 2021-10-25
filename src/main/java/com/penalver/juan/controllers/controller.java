package com.penalver.juan.controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.penalver.juan.dao.UsuarioDao;
import com.penalver.juan.models.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jpenalvs
 */
@RestController
public class controller{

    @Autowired
    private UsuarioDao usuarioDao;

    
    
    @RequestMapping(value = "usuario")
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }
    
     @RequestMapping(value = "usuario/{id}")
    public void eliminar(@PathVariable Long id) {
        usuarioDao.eliminar(id);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

//     @RequestMapping(value = "usuario/{id}")
//    public Usuario getUsuario(@PathVariable Long id) {
//        Usuario usuario = new Usuario();
//        usuario.setId(id);
//        usuario.setNombre("Lucas");
//        usuario.setApellido("Moy");
//        usuario.setTelefono("9893489384");
//        usuario.setPassword("Lucas22");
//        return usuario;
//    }
//    @RequestMapping(value = "usuario")
//    public List<Usuario> listadoUsuarios() {
//        List<Usuario> Usuarios = new ArrayList();
//        Usuario usuario0 = new Usuario();
//        usuario0.setId(2L);
//        usuario0.setNombre("Lucas");
//        usuario0.setApellido("Moy");
//        usuario0.setEmail("paco@mail.com");
//        usuario0.setTelefono("9893489384");
//        usuario0.setPassword("Lucas22");
//        Usuario usuario1 = new Usuario();
//        usuario1.setId(3L);
//        usuario1.setNombre("Maria");
//        usuario1.setApellido("Moy");
//        usuario1.setEmail("paco@mail.com");
//        usuario1.setTelefono("9893489384");
//        usuario1.setPassword("Lucas22");
//        Usuario usuario2 = new Usuario();
//        usuario2.setId(4L);
//        usuario2.setNombre("Sabrina");
//        usuario2.setApellido("Moy");
//        usuario2.setEmail("paco@mail.com");
//        usuario2.setTelefono("9893489384");
//        usuario2.setPassword("Lucas22");
//        Usuarios.add(usuario0);
//        Usuarios.add(usuario1);
//        Usuarios.add(usuario2);
//        return Usuarios;
//    }
//    
}
