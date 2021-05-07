package manager;

import model.*;

import java.util.Date;
import java.util.List;

public class OfferManager {
    /*public void updateTouristicOffer(List<TourismOffer> tourismOfferList, int offerId, Date departureDate,
                                     double pricePerPerson, boolean isAvailable, double transportCost,
                                     List<Tourist> touristList, String nationalIdNumber,
                                     String emailAddress){
            for(TourismOffer toff: tourismOfferList){
                if(toff.getOfferId() == offerId){
                    toff.setDepartureDate(departureDate);
                    toff.setPricePerPerson(pricePerPerson);
                    toff.setIsAvailable(isAvailable);
                    toff.
                }
                for(Tourist t: touristList){
                    if(t.getNationalIdNumber() == nationalIdNumber){
                        t.setEmailAddress(emailAddress);
                    }
                }
            }
    } */
    public void updateAccomodationType(List<TourismOffer> offerList, int offerId, AccomodationType
                                       accomodationType){
        for(TourismOffer t: offerList){
            if(t.getOfferId() == offerId){
                t.setAccomodationType(accomodationType);
            }
        }

    }
    public boolean findTouristicOfferByCity(List<TourismOffer> tourismOfferList, String destinationCity){
        boolean touristicOffer = false;
        for(TourismOffer t: tourismOfferList){
            if(t.getDestinationCity() == destinationCity){
                touristicOffer = true;
            }
        }
        return touristicOffer;
    }

    public boolean searchForXPricePerPerson(List<TourismOffer> tourismOffers, double pricePerPerson){
        boolean xPricePerPerson = false;
        for(TourismOffer t: tourismOffers){
            if(t.getPricePerPerson() == pricePerPerson){
                xPricePerPerson = true;
            }
        }
        return xPricePerPerson;
    }

    public boolean findTouristicOfferByDate(List<TourismOffer> tourismOffers, Date departureDate, Date
                                         arrivalDate){
        boolean touristicOfferByDate = false;
        for(TourismOffer t: tourismOffers){
            if((t.getDepartureDate() == departureDate) && (t.getArrivalDate() == arrivalDate)){
                touristicOfferByDate = true;
            }
        }
        return touristicOfferByDate;
    }



    ////UPDATE -> METODA VOID IN CARE MODIFICAM CEVA LA UN OBIECT -> APELAM MET setter
    //    //
    //    //void updateDateOfFlight (List<Flight> flifhtLost, int flightId, Date date){
    //    //for (Flight f : flightList){
    //    //if (f.getXXXXX() == flightId){
    //    //f.setXXXXX(date);
    //    //}
    //    //
    //    //
    //    //}
    //    //
    //    //
    //    //
    //    //}
    //    //void updateColorOfProdus(List<Produs> producyList, int prodId, Color color){
    //    //
    //    //}
    //    //
    //    //
    //    //FIND -> METODA CARE RETURNEAZA UN OBIECT CAUTAT (null daca nu gaseste)
    //    //Car findCarWithNrUsi(List<Car> carList, int nrUsi){
    //    //Car car = null; //intializez rez cu null indiferent c obiuect aveti in rezultat
    //    //for (Car c : carList){
    //    //if (c.getNrUsi() == nrUsi){
    //    //car = c;
    //    //}
    //    //
    //    //
    //    //}
    //    //
    //    //return car;
    //    //}
    //    //
    //    //
    //    //SEARCH -> METODA CARE RETURNEAZA UN BOOLEAN (true sau false, daca a gasit sau nu obiectul cautat)
    //    //boolean searchCarWithNrUsi(List<Car> carList, int nrUsi, int nrLocuri)
    //    //boolean found = false; //intializez rez cu false
    //    //for (Car c : carList){
    //    //if (c.getNrUsi() == nrUsi){
    //    //found = true; //am gasit obiectul cautat
    //    //}
    //    //
    //    //
    //    //}
    //    //
    //    //return found;
    //    //boolean searchCarWithColor(List<Car> carList, String color)
    //    //
    //    //
    //    //FILTER -> METODA CARE ARE PARAM LISTA TUTUROR OBIECTELOR, SI RETURNEAZA O LISTA MICUTA CU OBIECTE CARE INDEPLINESC O CONDITIE (BAZATA PE UN PARAMETRU)
    //    //List<Offer> filterOfferteleByPrice(List<Offer> offerList, int minPrice, int maxPrice ){
    //    //List<Offer> resultList = new ArrayList(); // tot timpu la toate metodele ilter creati o lista emopty
    //    //for (Car c : carList){
    //    //if (c.getNrUsi() == nrUsi && c.getLocuti = nrlocuri){
    //    //resultList.add(c); // adaug in lista rewz obiectul
    //    //}
    //    //
    //    //return resultLis;
    //    //
    //    //}
    //    //
    //    //List<Produs> filterProdByPrice(List<Produs> prodList, int minPrice )
    //    //filterCarsByColor(List<Car> carList, String color ){
}
