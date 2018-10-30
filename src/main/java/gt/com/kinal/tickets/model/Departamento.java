/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.kinal.tickets.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author programacion
 */
@Entity
@Table(name="AT_DEPARTAMENTO")
public class Departamento {
    @EmbeddedId
    DepartamentoPk id;
    String nombre;
    String telefono;

    public Departamento() {
    }

    public DepartamentoPk getId() {
        return id;
    }

    public void setId(DepartamentoPk id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}
