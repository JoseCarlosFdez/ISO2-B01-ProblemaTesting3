package com.mslc;

public class Clima {

    private int temperatura;
    private int humedad;
    private boolean llueve;
    private boolean nublado;
    
    public Clima(int temperatura, int humedad, boolean llueve, boolean nublado) {
        try{
            this.setTemperatura(temperatura);
            this.setHumedad(humedad);
            this.setLlueve(llueve);
            this.setNublado(nublado);
        } finally {

        }
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) throws HumedadNegativaException{
        if(humedad < 0)
            throw new HumedadNegativaException();
        this.humedad = humedad;
    }

    public boolean isLlueve() {
        return llueve;
    }

    public void setLlueve(boolean llueve) {
        this.llueve = llueve;
    }

    public boolean isNublado() {
        return nublado;
    }

    public void setNublado(boolean nublado) {
        this.nublado = nublado;
    }

    

}
