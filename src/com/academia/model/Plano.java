/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.academia.model;

/**
 *
 * @author predo
 */
public class Plano {
    private int codigo;
    private String titulo;
    private double mensalidade;
    
    public Plano(int c, String n, double v){
        this.codigo = c;
        this.titulo = n;
        this.mensalidade = v;
    }
    
    public void setTitulo( String valor ){
        this.titulo = valor;
    }
    
    public void setMensalidade( double valor ){
        this.mensalidade = valor;
    }
     
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public double getMensalidade(){
        return this.mensalidade;
    }
    
    
    @Override // Sobrescrita do metodo default toString;
    public String toString(){
        return this.titulo;
    }
}
