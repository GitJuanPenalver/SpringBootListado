/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penalver.juan.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author jpenalvs
 */
@Entity
@Table(name="usuarios")
@Data
public class Usuario {
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String password;

}
