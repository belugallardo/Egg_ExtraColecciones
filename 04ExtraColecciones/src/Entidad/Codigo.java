/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Objects;

/**
 *
 * @author belugallardo
 */
public class Codigo {
    private String ciudad;
    private Integer codigoPostal;

    public Codigo() {
    }

    public Codigo(String ciudad, Integer codigoPostal) {
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.ciudad);
        hash = 79 * hash + Objects.hashCode(this.codigoPostal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Codigo other = (Codigo) obj;
        if (!Objects.equals(this.ciudad, other.ciudad)) {
            return false;
        }
         return Objects.equals(this.codigoPostal, other.codigoPostal); 
            
        
    }

    @Override
    public String toString() {
        return  "Ciudad:" + ciudad + ", Codigo Postal:" + codigoPostal;
    }
    
    
}
