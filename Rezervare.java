package com.library.system;

public class Rezervare {
    private int idRezervare;
    private Client client;
    private SalaLectura sala;
    private String intervalOrar;
    private String status;
    private String codQR;

    public Rezervare(int idRezervare, Client client, SalaLectura sala, String intervalOrar, String status, String codQR) {
        this.idRezervare = idRezervare;
        this.client = client;
        this.sala = sala;
        this.intervalOrar = intervalOrar;
        this.status = status;
        this.codQR = codQR;
    }

    public int getIdRezervare() {
        return idRezervare;
    }

    public void setIdRezervare(int idRezervare) {
        this.idRezervare = idRezervare;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public SalaLectura getSala() {
        return sala;
    }

    public void setSala(SalaLectura sala) {
        this.sala = sala;
    }

    public String getIntervalOrar() {
        return intervalOrar;
    }

    public void setIntervalOrar(String intervalOrar) {
        this.intervalOrar = intervalOrar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCodQR() {
        return codQR;
    }

    public void setCodQR(String codQR) {
        this.codQR = codQR;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "idRezervare=" + idRezervare +
                ", client=" + client.getNume() +
                ", sala=" + sala.getNumeSala() +
                ", intervalOrar='" + intervalOrar + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
