package com.library.system;

import java.time.LocalDateTime;

public class ReportajAdministrator {
    private int idRaport;
    private LocalDateTime dataGenerare;
    private String tipRaport;
    private String continut;

    public ReportajAdministrator(int idRaport, LocalDateTime dataGenerare, String tipRaport, String continut) {
        this.idRaport = idRaport;
        this.dataGenerare = dataGenerare;
        this.tipRaport = tipRaport;
        this.continut = continut;
    }

    public int getIdRaport() {
        return idRaport;
    }

    public void setIdRaport(int idRaport) {
        this.idRaport = idRaport;
    }

    public LocalDateTime getDataGenerare() {
        return dataGenerare;
    }

    public void setDataGenerare(LocalDateTime dataGenerare) {
        this.dataGenerare = dataGenerare;
    }

    public String getTipRaport() {
        return tipRaport;
    }

    public void setTipRaport(String tipRaport) {
        this.tipRaport = tipRaport;
    }

    public String getContinut() {
        return continut;
    }

    public void setContinut(String continut) {
        this.continut = continut;
    }

    @Override
    public String toString() {
        return "ReportajAdministrator{" +
                "idRaport=" + idRaport +
                ", dataGenerare=" + dataGenerare +
                ", tipRaport='" + tipRaport + '\'' +
                '}';
    }
}
