/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.kinal.tickets;

import gt.com.kinal.tickets.model.Tecnico;
import gt.com.kinal.tickets.model.Ticket;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author programacion
 */
public class PruebaTickets {
    public static void main(String args[]){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("ticketsPU");//TicketsPU ver en persistence.xml
        EntityManager em=emf.createEntityManager();/*obtener una configuracion basada en persistence*/
        EntityTransaction tx= em.getTransaction();
        
      Ticket ticket= new Ticket("Aplicacion","No se puede ingresar",new Date(),"C");  
      tx.begin();//Inicializa la transaccion
      
      //Todo lo que esta dentro, pertenece a la transacción
      em.persist(ticket);
      //Asigna ticket a un tecnico
      /*ticket.setTecnicoId(1L);
      ticket.setEstado("A");*/
      
      //Elimina ticket de la base de datos
      //em.remove(ticket);
      Tecnico tecnico=new Tecnico("Jorge P","jp@kinal.org");
      em.persist(tecnico);
      ticket.setTecnico(tecnico);
      ticket.setEstado("A");
      tx.commit();
        System.out.println("Transaccion ejecutada");
        em.close();
        emf.close();
        
    }
}
