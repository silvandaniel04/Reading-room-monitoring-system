package com.library.system;

public class Administrator extends Utilizator {
    private String codAngajat;

    public Administrator(int id, String nume, String email, String parola, String codAngajat) {
        super(id, nume, email, parola);
        this.codAngajat = codAngajat;
    }

    public void roomConfiguration() {
        // Implementation for room configuration
    }

    public void roomAvailabilityManagement() {
        // Implementation for room availability management
    }

    public void generateReports() {
        // Implementation for generating reports
    }

    @Override
    public void login() {
        // Implementation for administrator login
    }

    @Override
    public void logout() {
        // Implementation for administrator logout
    }

    public String getCodAngajat() {
        return codAngajat;
    }

    public void setCodAngajat(String codAngajat) {
        this.codAngajat = codAngajat;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "id=" + getId() +
                ", nume='" + getNume() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", codAngajat='" + codAngajat + '\'' +
                '}';
    }
}
