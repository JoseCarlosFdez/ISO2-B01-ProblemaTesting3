package com.mslc;

public class HumedadNegativaException extends RuntimeException{

    public HumedadNegativaException(){
        super("No se puede tener humedad negativa");
    }
}
