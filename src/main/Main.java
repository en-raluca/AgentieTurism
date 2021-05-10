package main;

import data.DataCreator;
import data.DataReader;
import data.GenerateReservation;
import manager.OfferManager;
import model.Reservation;
import model.TourismOffer;
import model.Tourist;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static model.AccomodationType.HOTEL;
import static model.TransportType.PLANE;
import static model.Type.SEA;

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


        OfferManager offerManager = new OfferManager();
        Date specificDate = new Date();
        offerManager.updateDepartureDateOfOfferById(tourismOffers, 3, specificDate);
        System.out.println();
        offerManager.updatePricePerPersonByOfferId(tourismOffers, 7, 300);
        System.out.println();
        offerManager.updateAvailabilityOfOfferById(tourismOffers, 2, true);
        System.out.println();
        offerManager.updateTransportCostOfOfferById(tourismOffers, 1, 200);
        System.out.println();
        offerManager.updateAccomodationTypeOfOfferById(tourismOffers, 5, HOTEL);
        System.out.println();
        boolean findOffer = offerManager.findTouristicOfferByCity(tourismOffers, "Marbella");
        System.out.println(findOffer);
        boolean searchForXPrice = offerManager.searchForXPricePerPerson(tourismOffers, 600);
        System.out.println(searchForXPrice);
        Date departureDate = new Date();
        Date arrivalDate = new Date();
        boolean findTouristicOffer = offerManager.findTouristicOfferByDate(tourismOffers, departureDate, arrivalDate);
        System.out.println(findTouristicOffer);
        List<TourismOffer> filterOffers = offerManager.filterOffersByTransportationType(tourismOffers, PLANE);
        System.out.println(filterOffers);
        List<TourismOffer> filterOffers2 = offerManager.filterOffersByType(tourismOffers, SEA);
        System.out.println(filterOffers2);

    }
}

