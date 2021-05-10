package manager;

import model.Reservation;
import model.TourismOffer;
import model.Tourist;

import java.util.*;

public class RezervationManager {
    public void updateIsPaidRezervation(List<Reservation> reservationList, int reservationId, boolean isPaid) {
        for (Reservation r : reservationList) {
            if (r.getReservationId() == reservationId) {
                r.setIsPaid(isPaid);
            }
        }
    }

    public Reservation findReservationById(List<Reservation> reservationList, int reservationId) {
        Reservation reservation = null;
        for (Reservation r : reservationList) {
            if (r.getReservationId() == reservationId) {
                reservation = r;
            }
        }
        return reservation;
    }

    public boolean findReservationByOfferId(List<Reservation> reservationList, int offerId) {
        boolean reservation = false;
        for (Reservation r : reservationList) {
            if (r.getOfferId() == offerId) {
                reservation = true;
            }
        }
        return reservation;
    }

    public boolean findReservationByDestinationCity(List<Reservation> reservationList, String
            destinationCity) {
        boolean reservation = false;
        for (Reservation r : reservationList) {
            if (r.getTouristList().equals(destinationCity)) {
                reservation = true;
            }
        }
        return reservation;
    }

    public List<Reservation> filterReservationByDestinationCity(List<Reservation> reservationList, String
            destinationCity) {
        List<Reservation> resultReservationList = new ArrayList<>();
        for (Reservation r : reservationList) {
            if (r.getTouristList().equals(destinationCity)) {
                resultReservationList.add(r);
            }
        }
        return resultReservationList;
    }

    public List<Reservation> filterReservationByXOfferId(List<Reservation> reservationList, int offerId) {
        List<Reservation> resultReservationList = new ArrayList<>();
        for (Reservation r : reservationList) {
            if (r.getOfferId() == offerId) {
                resultReservationList.add(r);
            }
        }
        return resultReservationList;
    }

    public List<Reservation> filterReservationCheaperThanXPrice(List<Reservation> reservationList, double
            finalPrice) {
        List<Reservation> resultReservationList = new ArrayList<>();
        for (Reservation r : reservationList) {
            if (r.getFinalPrice() >= finalPrice) {
                resultReservationList.add(r);
            }
        }
        return resultReservationList;
    }

    public List<Reservation> filterReservationByDate(List<Reservation> reservationList, Date reservationDate) {
        List<Reservation> resultReservationList = new ArrayList<>();
        for (Reservation r : reservationList) {
            if (r.getReservationDate() == reservationDate) {
                resultReservationList.add(r);
            }
        }
        return resultReservationList;
    }

    public Map<String, List<Integer>> extractListOfReservationsPerTourist(List<Tourist> touristList,
                                                                          List<Reservation> reservationList) {
        Map<String, List<Integer>> resultMap = new HashMap<>();
        for (Tourist t : touristList) {
            List<Integer> reservationIdList = new ArrayList<>();
            for (Reservation r : reservationList) {
                if (t.getNationalIdNumber().equals(r.getReservationId())) {
                    reservationIdList.add(r.getReservationId());
                }
            }
            resultMap.put(t.getNationalIdNumber(), reservationIdList);
        }
        return resultMap;
    }

    public Map<String, List<Integer>> extractListOfReservationsByDestCity(List<TourismOffer> tourismOffers,
                                                                          List<Reservation> reservationList) {
        Map<String, List<Integer>> resultMap = new HashMap<>();
        Set<String> destinationCitySet = new HashSet<>();
        for (TourismOffer t : tourismOffers) {
            destinationCitySet.add(t.getDestinationCity());
        }
        for (String destinationCity : destinationCitySet) {
            List<Integer> reservationIdList = new ArrayList<>();
            for (TourismOffer to : tourismOffers) {
                if (to.getDestinationCity().equals(destinationCity)) {
                    for (Reservation r : reservationList) {
                        if (r.getOfferId() == to.getOfferId()) {
                            reservationIdList.add(r.getReservationId());
                        }
                    }
                }
            }
            resultMap.put(destinationCity, reservationIdList);

        }
        return resultMap;

    }
}
    //un Map cu rezultatul cheie DestinationCity si valoarea nr de rezervari
    //fac un for pe ofertele turistice pentru a obtine un set cu orasele

    //fac un for pe orasele obtinute si pe urma
        //facem un for pe toate ofertele turistice, pe urma un
            // for pe rezervari. Daca id-urile coincid atunci
    //fac un counter



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


