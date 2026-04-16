package com.library.system;

import java.util.List;

public class SalaLectura {
    private int idSala;
    private String numeSala;
    private int capacitateMaxima;
    private boolean esteDisponibila;
    private List<DotariCamera> dotari;

    public SalaLectura(int idSala, String numeSala, int capacitateMaxima, boolean esteDisponibila, List<DotariCamera> dotari) {
        this.idSala = idSala;
        this.numeSala = numeSala;
        this.capacitateMaxima = capacitateMaxima;
        this.esteDisponibila = esteDisponibila;
        this.dotari = dotari;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getNumeSala() {
        return numeSala;
    }

    public void setNumeSala(String numeSala) {
        this.numeSala = numeSala;
    }

    public int getCapacitateMaxima() {
        return capacitateMaxima;
    }

    public void setCapacitateMaxima(int capacitateMaxima) {
        this.capacitateMaxima = capacitateMaxima;
    }

    public boolean isEsteDisponibila() {
        return esteDisponibila;
    }

    public void setEsteDisponibila(boolean esteDisponibila) {
        this.esteDisponibila = esteDisponibila;
    }

    public List<DotariCamera> getDotari() {
        return dotari;
    }

    public void setDotari(List<DotariCamera> dotari) {
        this.dotari = dotari;
    }

    @Override
    public String toString() {
        return "SalaLectura{" +
                "idSala=" + idSala +
                ", numeSala='" + numeSala + '\'' +
                ", capacitateMaxima=" + capacitateMaxima +
                ", esteDisponibila=" + esteDisponibila +
                ", dotari=" + dotari +
                '}';
    }
}
