package com.mslc;

import java.util.ArrayList;

public class main {

    static Persona persona;
    static Clima clima;
    static Ubicacion piscina;
    static Ubicacion esqui;
    static Ubicacion montaña;
    static Ubicacion bar;
    static Ubicacion ciudad;

    public static void main(String args[]){

        persona = new Persona (new ArrayList<String>(), false, true, true);
        clima = new Clima(15,15,false,false);
        piscina = new Ubicacion(false , 20, 80);
        esqui = new Ubicacion(false, 100, 1000);
        montaña = new Ubicacion(false, 100, 1000);
        bar = new Ubicacion(false, 20, 5);
        ciudad = new Ubicacion(true, 0, 10000);

        String recomen = "";

        if(persona.infectadoCorona()){
            recomen = "no realizar ninguna actividad";
        }
        else{
            if(quedarseCasa())
                recomen = "quedarse en casa";
        
            if(esquiar())
                recomen = "ir a esquiar";
            
            if(senderismo())
                recomen = "ir a hacer senderismo";
            
            if(turismo())
                recomen = "ir a hacer turismo al aire libre";
            
            if(cañas())
                recomen = "irse de cañas";
            
            if(bañoPiscina()){
                recomen = "irse a la playa";
                if(piscina.aforoCompleto())
                    recomen += " o a la piscina";
            }
                
        }

        recomendacion(recomen);
    }

    //Si la temperatura meteorológica está por debajo de 0 grados, la humedad relativa es menor que 15%, y hay precipitaciones de nieve o de agua, entonces lo mejor es quedarse en casa.
    public static boolean quedarseCasa(){
        return temperaturaFria() && clima.isLlueve();
    }

    //Si la temperatura meteorológica está por debajo de 0 grados, la humedad relativa es menor que 15%, y no hay precipitaciones de nieve o de agua, se puede ir a esquiar, si no se supera el aforo permitido por la legislación pertinente.
    public static boolean esquiar(){
        return temperaturaFria() && !clima.isLlueve() && !esqui.aforoCompleto();
    }

    //Si la temperatura meteorológica está entre 0 y 15 grados, y no hay precipitaciones de agua, entonces es posible ir a hacer senderismo, si no se supera aforo del espacio previsto.
    public static boolean senderismo(){
        return temperaturaFresca() && !clima.isLlueve() && !montaña.aforoCompleto();
    }

    //Si la temperatura meteorológica está entre 15 y 25 grados, no llueve, y no está nublado y no hay una humedad relativa superior al 60%, entonces se puede ir a hacer turismo al aire libre, si la ciudad no tiene restricciones de confinamiento.
    public static boolean turismo(){
        return temperaturaTemplada() && clima.getHumedad() < 60 && !clima.isLlueve() && !clima.isNublado() && !ciudad.isRestricciones();
    }

    //Si la temperatura meteorológica está entre 25 y 35 grados, y no llueve, la recomendación es irse de cañas, si el establecimiento no tiene problemas de aforo.
    public static boolean cañas(){
        return temperaturaCalida() && !clima.isLlueve() && !bar.aforoCompleto();
    }

    //Si la temperatura meteorológica es mayor que 30 grados, y no llueve, la recomendación es irse a la playa o a la piscina. La piscina no puede superar el aforo permitido.
    public static boolean bañoPiscina(){
        return clima.getTemperatura() > 30 && !clima.isLlueve() && !piscina.aforoCompleto();
    }

    public static boolean temperaturaFria(){
        return clima.getTemperatura() < 0 && clima.getHumedad() < 15;
    }

    public static boolean temperaturaFresca(){
        return clima.getTemperatura() > 0 && clima.getTemperatura() < 15;
    }

    public static boolean temperaturaTemplada(){
        return clima.getTemperatura() > 15 && clima.getTemperatura() < 25;
    }

    public static boolean temperaturaCalida(){
        return  clima.getTemperatura() > 25 && clima.getTemperatura() < 35;
    }

    public static void recomendacion(String recomen){
        System.out.println("La recomendación es "+recomen);
    }
}