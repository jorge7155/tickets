/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.kinal.tickets.model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author programacion
 */
@Entity  //CREANDO UNA ENTIDAD
@Table(name="AT_TICKET")//modificar nombre de tabla
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TICKET_ID")//las palabras compuestas se separam por guion bajo
    private Long ticketid;//ATRIBUTO QUE IDENTIFICA LOS TICKETS
    @NotNull
    @Size(max=50)//TAMAÑO DEL VARCHAR
    @Column(nullable = false, length=50)
    private String titulo;
    
    @Size(max=500)//TAMAÑO DEL VARCHAR
    @Column(nullable = false, length=500)    
    private String descripcion;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA_CREACION", nullable=false)//las palabras compuestas se separam por guion bajo
    private Date fechaCreacion;
    @Temporal(TemporalType.TIMESTAMP)//PARA INDICAR LA FECHA
    @Column(name="FECHA_SOLUCION")//las palabras compuestas se separam por guion bajo
    private Date fechaSolucion;
    @NotNull
    @Size(max=1)//TAMAÑO DEL VARCHAR
    @Column(nullable = false, length=1)
    private String estado;
    @ManyToOne(cascade=CascadeType.PERSIST)
    //private Long tecnicoId;
    @JoinColumn(name  = "TECNICO_ID")
    private Tecnico tecnico;//CREAANDO REALACIO DE MUCHOS A UNO

    public Ticket() {
    }

    public Ticket(String titulo, String descripcion, Date fechaCreacion, String estado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
    }

    
    
    

    public Long getTicketid() {
        return ticketid;
    }

    public void setTicketid(Long ticketid) {
        this.ticketid = ticketid;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaSolucion() {
        return fechaSolucion;
    }

    public void setFechaSolucion(Date fechaSolucion) {
        this.fechaSolucion = fechaSolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /*public Long getTecnicoId() {
        return tecnicoId;
    }

    public void setTecnicoId(Long tecnicoId) {
        this.tecnicoId = tecnicoId;
    }*/

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

   
    
    
    
    
    
}
