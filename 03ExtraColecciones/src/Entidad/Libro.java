/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Objects;

/*
Para ello, se debe crear una clase llamada Libro que guarde la información de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
*/
/**
 *
 * @author belugallardo
 */
public class Libro {
    private String titulo;
    private String autor;
    private Integer numEjemplares;
    private Integer numEjemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer numEjemplares, Integer numEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(Integer numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public Integer getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(Integer numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    /*@Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.titulo);
        hash = 89 * hash + Objects.hashCode(this.autor);
        hash = 89 * hash + Objects.hashCode(this.numEjemplares);
        hash = 89 * hash + Objects.hashCode(this.numEjemplaresPrestados);
        return hash;
    }*/

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
   /* @Override
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
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return true;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.numEjemplares, other.numEjemplares)) {
            return false;
        }
        if (!Objects.equals(this.numEjemplaresPrestados, other.numEjemplaresPrestados)) {
            return false;
        }
        return true;
    }
*/
    
    @Override
    public String toString() {
        return "Libro: Titulo:" + titulo + ", Autor=" + autor + ",  Numero de Ejemplares:" + numEjemplares + ", Numero de Ejemplares Prestados=" + numEjemplaresPrestados ;
    }
    
    
    
    
}
