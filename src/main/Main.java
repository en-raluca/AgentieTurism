package main;

import data.DataCreator;
import data.DataReader;
import model.Reservation;
import model.TourismOffer;
import model.Tourist;

import java.util.List;

public class Main {
    public static void main(String[] args){
        DataCreator dataCreator = new DataCreator();
        List<Tourist> touristList = dataCreator.createTouristList();
        List<Reservation> reservationList = dataCreator.createReservationList();

        DataReader dataReader = new DataReader();
        List<TourismOffer> tourismOffers = dataReader.readOffersFromFile();

    }
}
