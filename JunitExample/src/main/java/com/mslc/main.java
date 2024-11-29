package com.mslc;

import java.util.ArrayList;

public class main {
    public static void main(String args[]){

        Persona persona = new Persona (new ArrayList<String>(), false, true, true);
        Clima clima = new Clima(15,15,false,false);

        if(!persona.sintomas() && persona.isContactoCorona() && !persona.isPasadoCorona() && !persona.isVacunaCorona()){
            System.out.println("No puede realizar ninguna actividad");
        }
        else{
            //Si la temperatura meteorológica está por debajo de 0 grados, la humedad relativa es menor que 15%, y hay precipitaciones de nieve o de agua, entonces lo mejor es quedarse en casa.
            if(clima.getTemperatura() < 0 && clima.getHumedad() < 15 && clima.isLlueve())
                System.out.println("La recomendación es quedarse en casa");
            //Si la temperatura meteorológica está por debajo de 0 grados, la humedad relativa es menor que 15%, y no hay precipitaciones de nieve o de agua, se puede ir a esquiar, si no se supera el aforo permitido por la legislación pertinente.
            if(clima.getTemperatura() < 0 && clima.getHumedad() < 15 && !clima.isLlueve())
                System.out.println("Se puede ir a esquiar, si no se supera el aforo permitido por la legislación pertinente.");
            //Si la temperatura meteorológica está entre 0 y 15 grados, y no hay precipitaciones de agua, entonces es posible ir a hacer senderismo, si no se supera aforo del espacio previsto.
            if(clima.getTemperatura() > 0 && clima.getHumedad() < 15 && !clima.isLlueve())
                System.out.println("La recomendación es ir a hacer senderismo, si no se supera aforo del espacio previsto.se puede ir a esquiar, si no se supera el aforo permitido por la legislación pertinente.");
            //Si la temperatura meteorológica está entre 15 y 25 grados, no llueve, y no está nublado y no hay una humedad relativa superior al 60%, entonces se puede ir a hacer turismo al aire libre, si la ciudad no tiene restricciones de confinamiento.
            if(clima.getTemperatura() > 15 && clima.getTemperatura() < 25 && clima.getHumedad() < 60 && !clima.isLlueve() && !clima.isNublado())
                System.out.println("La recomendación es ir a hacer turismo al aire libre, si la ciudad no tiene restricciones de confinamiento.");
            //Si la temperatura meteorológica está entre 25 y 35 grados, y no llueve, la recomendación es irse de cañas, si el establecimiento no tiene problemas de aforo.
            if(clima.getTemperatura() > 25 && clima.getTemperatura() < 35 && !clima.isLlueve())
                System.out.println("La recomendación es irse de cañas");
            //Si la temperatura meteorológica es mayor que 30 grados, y no llueve, la recomendación es irse a la playa o a la piscina. La piscina no puede superar el aforo permitido.
            if(clima.getTemperatura() > 30 && !clima.isLlueve())
                System.out.println("La recomendación es irse a la playa o a la piscina.");
        }
    }
}