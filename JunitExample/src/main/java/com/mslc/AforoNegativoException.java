package com.mslc;

public class AforoNegativoException extends RuntimeException{
    public AforoNegativoException(){
        super("El aforo no puede ser negativo");
    }
}
