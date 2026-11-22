/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.academia.model;

/**
 *
 * @author predo
 */
public class Aluno {
    private int codigo;               
    private String nome;
    private String cpf;               
    private String telefone;
    private Plano plano;              
    private boolean mensalidadeEmDia;

    public Aluno(int c, String n, String cpf, String t, Plano p, boolean m){
        this.codigo = c;
        this.nome = n;
        this.cpf = cpf;
        this.telefone = t;
        this.plano = p;
        this.mensalidadeEmDia = m;
    }

    public void setNome( String valor ){
        this.nome = valor;
    }

    public void setCpf( String valor ){
        this.cpf = valor;
    }

    public void setTelefone( String valor ){
        this.telefone = valor;
    }

    public void setPlano( Plano valor ){
        this.plano = valor;
    }

    public void setMensalidadeEmDia( boolean valor ){
        this.mensalidadeEmDia = valor;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public Plano getPlano(){
        return this.plano;
    }

    public boolean isMensalidadeEmDia(){
        return this.mensalidadeEmDia;
    }

    @Override // Sobrescrita do método toString herdado de Object
    public String toString(){
        return this.nome;
    }
}