/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metrobus.rasbus.ruta.entities;

/**
 * Comentarios sin valor ingresados en a clase para probar como se ve el commit en otra rama
 * @author Aula Movil
 */
public class Bus {
    private String codigo;
    
    private String placa;
    
    private Posicion posicion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    
}
