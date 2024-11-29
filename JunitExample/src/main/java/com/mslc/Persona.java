package com.mslc;

import java.util.ArrayList;

public class Persona {

private ArrayList sintomas;
private boolean contactoCorona;
private boolean pasadoCorona;
private boolean vacunaCorona;

    public Persona(ArrayList sintomas, boolean contactoCorona, boolean pasadoCorona, boolean vacunaCorona) {
        try{
            this.setSintomas(sintomas);
            this.setContactoCorona(contactoCorona);
            this.setPasadoCorona(pasadoCorona);
            this.setVacunaCorona(vacunaCorona);
        } finally {

        }
    }

    public boolean sintomas(){
        return this.sintomas.isEmpty();
    }

    public ArrayList getSintomas() {
        return sintomas;
    }

    public void setSintomas(ArrayList sintomas) {
        this.sintomas = sintomas;
    }

    public boolean isContactoCorona() {
        return contactoCorona;
    }

    public void setContactoCorona(boolean contactoCorona) {
        this.contactoCorona = contactoCorona;
    }

    public boolean isPasadoCorona() {
        return pasadoCorona;
    }

    public void setPasadoCorona(boolean pasadoCorona) {
        this.pasadoCorona = pasadoCorona;
    }

    public boolean isVacunaCorona() {
        return vacunaCorona;
    }

    public void setVacunaCorona(boolean vacunaCorona) {
        this.vacunaCorona = vacunaCorona;
    }

    
    
}
