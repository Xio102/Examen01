package com.pregunta4;

public class Capacidad extends Modelo {

    public int capacidad;

    public Capacidad(String marca, int año, String modelo, int capacidad ){
        super(marca,año,modelo);
        this.capacidad = capacidad;
    }

    public void setCapacidad(int newValue){
        capacidad= newValue;
    }

    @Override
    public String toString(){
        return(super.toString() + "\nCapacidad: "+capacidad);
    }

}
