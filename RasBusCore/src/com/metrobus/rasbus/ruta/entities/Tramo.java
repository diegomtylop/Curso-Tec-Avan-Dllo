/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metrobus.rasbus.ruta.entities;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Aula Movil
 */
class Tramo {
    private String id;//PAra hacer mas facil la comparación
    private Posicion inicio;
    private Posicion destino;
    private double distancia;
    //private List<Parada> paradas;
    
    //No se puede instanciar
    private Tramo(){}
    
    public Tramo(Posicion inicio, Posicion destino, double distancia) throws TramoInvalidoException{
        if( distancia == 0 ){
            //Excepción porque en el constructor no puedo retornar nada
            throw new TramoInvalidoException();
        }
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    //Validaciones generales de un tramo, que se podrían usar desde cualquier parte de la aplicación
    public boolean validarTramo(){
        boolean valido = true;
        
        //El punto de inicio debe ser diferente al punto de destino
        if ( inicio.equals( destino )){
            valido = false;
        }
        
        return valido;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Posicion getInicio() {
        return inicio;
    }

    public void setInicio(Posicion inicio) {
        this.inicio = inicio;
    }

    public Posicion getDestino() {
        return destino;
    }

    public void setDestino(Posicion destino) {
        this.destino = destino;
    }

   /* public List<Parada> getParadas() {
        return paradas;
    }

    public void setParadas(List<Parada> paradas) {
        this.paradas = paradas;
    }*/

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tramo other = (Tramo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
     @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }
}
