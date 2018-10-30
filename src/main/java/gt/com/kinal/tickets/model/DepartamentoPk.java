/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.kinal.tickets.model;

import javax.persistence.Embeddable;

/**
 *
 * @author programacion
 */
@Embeddable
public class DepartamentoPk {
    Long empresaId;  
    Long departamentoId;

    public DepartamentoPk() {
    }

    public Long getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Long empresaId) {
        this.empresaId = empresaId;
    }

    public Long getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(Long departamentoId) {
        this.departamentoId = departamentoId;
    }
    
    
    
}
