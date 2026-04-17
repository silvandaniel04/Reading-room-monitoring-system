package com.library.system;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Create Dotari for a SalaLectura
        List<DotariCamera> dotariSala1 = new ArrayList<>();
        dotariSala1.add(DotariCamera.WI_FI);
        dotariSala1.add(DotariCamera.PRIZA);
        dotariSala1.add(DotariCamera.MONITOR);

        // 2. Create a SalaLectura
        SalaLectura sala1 = new SalaLectura(101, "Sala de Lectura 'Mihai Eminescu'", 50, true, dotariSala1);
        System.out.println("Sala de Lectura creata: " + sala1);

        // 3. Create a ContClient
        ContClient contClient1 = new ContClient("ion.popescu", "ACTIV", LocalDateTime.now());
        System.out.println("Cont client creat: " + contClient1);

        // 4. Create a Client
        Client client1 = new Client(1, "Ion Popescu", "ion.popescu@email.com", "parola123", "0722123456", new ArrayList<>(), contClient1);
        System.out.println("Client creat: " + client1);
        client1.login(); // Demonstrate calling a method

        // 5. Create a Rezervare for the Client and SalaLectura
        Rezervare rezervare1 = new Rezervare(5001, client1, sala1, "14:00-16:00", "CONFIRMATA", "QR_CODE_DATA_HERE");
        System.out.println("Rezervare creata: " + rezervare1);

        // 6. Add the reservation to the client's history
        client1.getIstoric().add(rezervare1);
        System.out.println("Istoric rezervari client: " + client1.getIstoric());

        // Demonstrate client methods
        client1.makeReservation();
        client1.checkIn();
        client1.cancelReservation();
        client1.logout();

        System.out.println("\n--------------------------------------\n");

        // 7. Create an Administrator
        Administrator admin1 = new Administrator(99, "Admin Vasile", "admin.vasile@library.com", "adminpass", "ADM001");
        System.out.println("Administrator creat: " + admin1);
        admin1.login(); // Demonstrate calling a method

        // 8. Administrator generates a report
        ReportajAdministrator report = new ReportajAdministrator(1, LocalDateTime.now(), "Raport Ocupare Sali", "Sala 101 a fost ocupata 80% din timp.");
        System.out.println("Raport generat: " + report);

        // Demonstrate administrator methods
        admin1.roomConfiguration();
        admin1.roomAvailabilityManagement();
        admin1.generateReports();
        admin1.logout();
    }
}
