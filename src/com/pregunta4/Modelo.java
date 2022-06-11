package com.pregunta4;

public class Modelo {

    public String marca;
    public int año;
    public String modelo;

    public Modelo(String marca, int año, String modelo) {
        this.marca = marca;
        this.año = año;
        this.modelo = modelo;
    }

    public void amarca(String mejor){marca += mejor;}
    public void atiempo(int nuevo){año -= nuevo;}
    public void tipo(String tip){modelo += tip;}

    public String toString(){
        return "Auto : "+marca+" \nAño: "+año+"\nModelo: "+modelo;
    }
}
