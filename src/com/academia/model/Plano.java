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
    private String nome;
    private double valor;
    private int duracao;
    
    public Plano(int c, String n, double v, int d){
        this.codigo = c;
        this.nome = n;
        this.valor = v;
        this.duracao = d;
    }
    
    public void setNome( String valor ){
        this.nome = valor;
    }
    
    public void setValor( double valor ){
        this.valor = valor;
    }
     
    public void setDuracao( int valor ){
        this.duracao = valor;
    }
     
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public int getDuracao(){
        return this.duracao;
    }
    
    
    @Override // Sobrescrita do metodo default toString;
    public String toString(){
        return this.nome;
    }
}
