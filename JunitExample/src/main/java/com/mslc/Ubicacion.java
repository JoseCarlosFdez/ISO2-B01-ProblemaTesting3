package com.mslc;

public class Ubicacion extends Exception{

    private boolean restricciones;
    private int aforo;
    private int aforoMaximo;

    public Ubicacion(boolean restricciones, int aforo, int aforoMaximo) {
        try{
            this.setRestricciones(restricciones);
            this.setAforo(aforoMaximo);
            this.setAforoMaximo(aforoMaximo);
        } finally {

        }
    }

    public boolean aforoCompleto() {
        return this.getAforo() >= this.getAforoMaximo();
    }

    public boolean isRestricciones() {
        return restricciones;
    }

    public void setRestricciones(boolean restricciones) {
        this.restricciones = restricciones;
    }

    public int getAforo(){
        return aforo;
    }

    public void setAforo(int aforo) throws AforoNegativoException{
        if (this.aforo < 0)
            throw new AforoNegativoException();
        this.aforo = aforo;
    }

    public int getAforoMaximo() {
        return aforoMaximo;
    }

    public void setAforoMaximo(int aforoMaximo) throws AforoNegativoException{
        if(aforoMaximo < 0)
            throw new AforoNegativoException();
        this.aforoMaximo = aforoMaximo;
    }

    



}
