package com.library.system;

import java.util.List;

public class Client extends Utilizator {
    private String numarTelefon;
    private List<Rezervare> istoric;
    private ContClient contClient;

    public Client(int id, String nume, String email, String parola, String numarTelefon, List<Rezervare> istoric, ContClient contClient) {
        super(id, nume, email, parola);
        this.numarTelefon = numarTelefon;
        this.istoric = istoric;
        this.contClient = contClient;
    }

    public void makeReservation() {
        // Implementation for making a reservation
    }

    public void cancelReservation() {
        // Implementation for canceling a reservation
    }

    public void checkIn() {
        // Implementation for checking in
    }

    @Override
    public void login() {
        // Implementation for client login
    }

    @Override
    public void logout() {
        // Implementation for client logout
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public List<Rezervare> getIstoric() {
        return istoric;
    }

    public void setIstoric(List<Rezervare> istoric) {
        this.istoric = istoric;
    }

    public ContClient getContClient() {
        return contClient;
    }

    public void setContClient(ContClient contClient) {
        this.contClient = contClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + getId() +
                ", nume='" + getNume() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", numarTelefon='" + numarTelefon + '\'' +
                '}';
    }
}
