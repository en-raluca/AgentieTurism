package manager;

import model.Reservation;

import java.util.ArrayList;
import java.util.List;

public class RezervationManager {
    public void updateIsPaidRezervation(List<Reservation> reservationList, int reservationId, boolean isPaid){
        for(Reservation r : reservationList){
            if(r.getReservationId() == reservationId){
                r.setIsPaid(isPaid);
            }
        }
    }
    public Reservation findReservationById(List<Reservation> reservationList, int reservationId){
        Reservation reservation = null;
        for(Reservation r : reservationList){
            if(r.getReservationId() == reservationId){
                reservation = r;
            }
        }
        return reservation;
    }

    public boolean findReservationByOfferId(List<Reservation> reservationList, int offerId){
        boolean reservation = false;
        for(Reservation r : reservationList){
            if(r.getOfferId() == offerId){
                reservation = true;
            }
        }
        return reservation;
    }
    //Filtreaza toate rezervarile care au avut un oras de destinatie dat ca parametru
    //Toate rezervarile care l-au avut ca result pe X dat ca parametru
    //Toate rezervarile mai ieftine decat un pret X dat ca parametru
    //Toate rezervarile de dinainte de o data data ca parametru
    public List<Reservation> findReservationByDestinationCity(List<Reservation> reservationList, String
                                                              destinationCity){
        List<Reservation> resultReservationList = new ArrayList<>();
        for(Reservation r: reservationList){
            if(r.getTouristList().equals(destinationCity)){
                resultReservationList.add(r);
            }
        }
        return resultReservationList;
    }

    //UPDATE -> METODA VOID IN CARE MODIFICAM CEVA LA UN OBIECT -> APELAM MET setter
    //
    //void updateDateOfFlight (List<Flight> flifhtLost, int flightId, Date date){
    //for (Flight f : flightList){
    //if (f.getXXXXX() == flightId){
    //f.setXXXXX(date);
    //}
    //
    //
    //}
    //
    //
    //
    //}
    //void updateColorOfProdus(List<Produs> producyList, int prodId, Color color){
    //
    //}
    //
    //
    //FIND -> METODA CARE RETURNEAZA UN OBIECT CAUTAT (null daca nu gaseste)
    //Car findCarWithNrUsi(List<Car> carList, int nrUsi){
    //Car car = null; //intializez rez cu null indiferent c obiuect aveti in rezultat
    //for (Car c : carList){
    //if (c.getNrUsi() == nrUsi){
    //car = c;
    //}
    //
    //
    //}
    //
    //return car;
    //}
    //
    //
    //SEARCH -> METODA CARE RETURNEAZA UN BOOLEAN (true sau false, daca a gasit sau nu obiectul cautat)
    //boolean searchCarWithNrUsi(List<Car> carList, int nrUsi, int nrLocuri)
    //boolean found = false; //intializez rez cu false
    //for (Car c : carList){
    //if (c.getNrUsi() == nrUsi){
    //found = true; //am gasit obiectul cautat
    //}
    //
    //
    //}
    //
    //return found;
    //boolean searchCarWithColor(List<Car> carList, String color)
    //
    //
    //FILTER -> METODA CARE ARE PARAM LISTA TUTUROR OBIECTELOR, SI RETURNEAZA O LISTA MICUTA CU OBIECTE CARE INDEPLINESC O CONDITIE (BAZATA PE UN PARAMETRU)
    //List<Offer> filterOfferteleByPrice(List<Offer> offerList, int minPrice, int maxPrice ){
    //List<Offer> resultList = new ArrayList(); // tot timpu la toate metodele ilter creati o lista emopty
    //for (Car c : carList){
    //if (c.getNrUsi() == nrUsi && c.getLocuti = nrlocuri){
    //resultList.add(c); // adaug in lista rewz obiectul
    //}
    //
    //return resultLis;
    //
    //}
    //
    //List<Produs> filterProdByPrice(List<Produs> prodList, int minPrice )
    //filterCarsByColor(List<Car> carList, String color ){

}
