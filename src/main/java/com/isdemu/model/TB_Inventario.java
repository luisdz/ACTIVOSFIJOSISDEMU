/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jose Eduardo
 */
@Entity
@Table(name = "TB_INVENTARIO", schema = "dbo")
public class TB_Inventario {
    
     @Id
    @Column(name = "id_inventario")
    private Integer id_inventario;

    @Column(name="codigo_inventario")
    private String cinventario;
    
    
     @Column(name="nombre_inventario")
    private String ninventario;
     
     
     public Integer getid_inventario() {
        return id_inventario;
    }
     
     public void setid_inventario(Integer id_inventario) {
        this.id_inventario = id_inventario;
    }
     
      public String getc_inventario() {
        return cinventario;
    }
     
     public void setc_inventario(String cinventario) {
        this.cinventario = cinventario;
    }
     
      public String getninventario() {
        return ninventario;
    }
     
     public void setninventario(String ninventario) {
        this.ninventario = ninventario;
    }
     
     
     
     
     
    
}
