/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penalver.juan.dao;
import com.penalver.juan.models.Usuario;
import java.util.List;



public interface UsuarioDao{
    List<Usuario> getUsuarios();

    public void eliminar(Long id);
    
}
