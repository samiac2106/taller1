package com.example.aguadascaldas;

import java.io.Serializable;

public class ActividadTuristica implements Serializable {

    String nombreSitioTuristico, antiguedadSitioTuristico, descripcionSitioTuristico;
    int fotoSitioTuristico, fotoSitioTuristico2, fotoSitioTuristico3;

    public ActividadTuristica(String nombreSitioTuristico, String antiguedadSitioTuristico, String descripcionSitioTuristico, int fotoSitioTuristico, int fotoSitioTuristico2, int fotoSitioTuristico3) {
        this.nombreSitioTuristico = nombreSitioTuristico;
        this.antiguedadSitioTuristico = antiguedadSitioTuristico;
        this.descripcionSitioTuristico = descripcionSitioTuristico;
        this.fotoSitioTuristico = fotoSitioTuristico;
        this.fotoSitioTuristico2 = fotoSitioTuristico2;
        this.fotoSitioTuristico3 = fotoSitioTuristico3;
    }

    public String getNombreSitioTuristico() {
        return nombreSitioTuristico;
    }

    public void setNombreSitioTuristico(String nombreSitioTuristico) {
        this.nombreSitioTuristico = nombreSitioTuristico;
    }

    public String getAntiguedadSitioTuristico() {
        return antiguedadSitioTuristico;
    }

    public void setAntiguedadSitioTuristico(String antiguedadSitioTuristico) {
        this.antiguedadSitioTuristico = antiguedadSitioTuristico;
    }

    public String getDescripcionSitioTuristico() {
        return descripcionSitioTuristico;
    }

    public void setDescripcionSitioTuristico(String descripcionSitioTuristico) {
        this.descripcionSitioTuristico = descripcionSitioTuristico;
    }

    public int getFotoSitioTuristico() {
        return fotoSitioTuristico;
    }

    public void setFotoSitioTuristico(int fotoSitioTuristico) {
        this.fotoSitioTuristico = fotoSitioTuristico;
    }

    public int getFotoSitioTuristico2() {
        return fotoSitioTuristico2;
    }

    public void setFotoSitioTuristico2(int fotoSitioTuristico2) {
        this.fotoSitioTuristico2 = fotoSitioTuristico2;
    }

    public int getFotoSitioTuristico3() {
        return fotoSitioTuristico3;
    }

    public void setFotoSitioTuristico3(int fotoSitioTuristico3) {
        this.fotoSitioTuristico3 = fotoSitioTuristico3;
    }
}





