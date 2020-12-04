/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto5Equipo10G1M3.Reto5;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author JessidEscobar
 */
@Entity
@Table(name="peliculas")
public class peliculas implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name="id_pelicula")   
    private int peliId;
    
    @Column(name="titulo")   
    private String peliTitulo;
    
    @Column(name="resumen")   
    private String peliResumen;
    
    @Column(name="año")   
    private int peliAnio;
    
    @Column(name="director_pelicula")
    private String peliDirector;

    //Creación de GETTERS
    
    public int getPeliId() {
        return peliId;
    }

    public String getPeliTitulo() {
        return peliTitulo;
    }

    public String getPeliResumen() {
        return peliResumen;
    }

    public int getPeliAnio() {
        return peliAnio;
    }

    public String getPeliDirector() {
        return peliDirector;
    }
    
    //Creación de SETTERS
    public void setPeliId(int peliId) {
        this.peliId = peliId;
    }
    
    public void setPeliTitulo(String peliTitulo) {
        this.peliTitulo = peliTitulo;
    }

    public void setPeliResumen(String peliResumen) {
        this.peliResumen = peliResumen;
    }

    public void setPeliAnio(int peliAnio) {
        this.peliAnio = peliAnio;
    }

    public void setPeliDirector(String peliDirector) {
        this.peliDirector = peliDirector;
    }


       
}
