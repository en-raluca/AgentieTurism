package main;

import data.DataCreator;
import data.DataReader;
import data.GenerateReservation;
import model.Reservation;
import model.TourismOffer;
import model.Tourist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        DataCreator dataCreator = new DataCreator();
        List<Tourist> touristList = dataCreator.createTouristList();
        List<Reservation> reservationList = dataCreator.createReservationList();
        System.out.println("Tourist list is: " + touristList);
        System.out.println("Reservation list is: " + reservationList);

        DataReader dataReader = new DataReader();
        List<TourismOffer> tourismOffers = dataReader.readOffersFromFile();

        GenerateReservation generateReservationFile = new GenerateReservation();
        Reservation r = reservationList.get(0);
        Tourist t = touristList.get(0);
        Tourist t2 = touristList.get(1);
        List<Tourist> listTourist2 = new ArrayList<>();
        listTourist2.add(t);
        listTourist2.add(t2);
        generateReservationFile.generateReservationFile(r, listTourist2);

    }
}

