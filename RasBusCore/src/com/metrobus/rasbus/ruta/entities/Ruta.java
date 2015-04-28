/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metrobus.rasbus.ruta.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aula Movil
 */
public class Ruta {
    //Por defecto las entidades no tienen ID a no ser que el negocio lo requiera
    private String id;
    private String nombre;
    
    private List<Tramo> recorrido;//Debe ser una lista ordenada
    
    
    //Una ruta no puede existir sin tramos
    public Ruta(Tramo inicial){
        recorrido = new ArrayList<Tramo>();
        recorrido.add(inicial);
    }
    
    //Historia de usuario de adicionar tramo
    private  boolean adicionarTramo(Tramo nuevoTramo ){
        
        boolean adicionado = true;
        
        //VAlida que los tramos sean adyacentes
        boolean adyacentes = validarTramosAdyacentes( nuevoTramo );
        
        if( adyacentes ){
            recorrido.add( nuevoTramo );
        }else{
            adicionado = false;
        }
        
        return adicionado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tramo> getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(List<Tramo> recorrido) {
        this.recorrido = recorrido;
    }

    private boolean validarTramosAdyacentes(Tramo nuevoTramo) {
        Tramo ultimo = recorrido.get( recorrido.size() );
        
        return ultimo.getDestino().equals( nuevoTramo.getInicio() );
    }
}
