package com.library.system;

import java.time.LocalDateTime;

public class ContClient {
    private String username;
    private String statusCont;
    private LocalDateTime dataCreare;

    public ContClient(String username, String statusCont, LocalDateTime dataCreare) {
        this.username = username;
        this.statusCont = statusCont;
        this.dataCreare = dataCreare;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatusCont() {
        return statusCont;
    }

    public void setStatusCont(String statusCont) {
        this.statusCont = statusCont;
    }

    public LocalDateTime getDataCreare() {
        return dataCreare;
    }

    public void setDataCreare(LocalDateTime dataCreare) {
        this.dataCreare = dataCreare;
    }

    @Override
    public String toString() {
        return "ContClient{" +
                "username='" + username + '\'' +
                ", statusCont='" + statusCont + '\'' +
                ", dataCreare=" + dataCreare +
                '}';
    }
}
