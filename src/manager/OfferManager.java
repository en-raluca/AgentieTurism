package manager;

import model.*;

import java.time.LocalDateTime;
import java.util.*;

public class OfferManager {
    public void updateDepartureDateOfOfferById(List<TourismOffer> offerList, int offerID,
                                                    Date departureDate){
        for(TourismOffer t: offerList){
            if(t.getOfferId() == offerID){
                t.setDepartureDate(departureDate);
            }
        }
    }
    public void updatePricePerPersonByOfferId(List<TourismOffer> offerList, int offerId, double
            pricePerPerson){
        for(TourismOffer t: offerList){
            if(t.getOfferId() == offerId){
                t.setPricePerPerson(pricePerPerson);
            }
        }
    }
    public void updateAvailabilityOfOfferById(List<TourismOffer> offerList, int offerId, boolean
                                                   isAvailable){
        for(TourismOffer t: offerList){
            if(t.getOfferId() == offerId){
                t.setIsAvailable(isAvailable);
            }
        }
    }
    public void updateTransportCostOfOfferById(List<TourismOffer> offerList, int offerId,
                                                    double transportCost){
        for(TourismOffer t: offerList){
            if(t.getOfferId() == offerId){
                if(t instanceof InternationalTourismOffer){
                    InternationalTourismOffer internationalTourismOffer = (InternationalTourismOffer) t;
                    internationalTourismOffer.setTransportCost(transportCost);
                }
            }
        }
    }
    public void updateAccomodationTypeOfOfferById(List<TourismOffer> offerList, int offerId, AccomodationType
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
    public List<TourismOffer> filterOffersByTransportationType(List<TourismOffer> offerList, TransportType
                                                               transportType){
        List<TourismOffer> resultTourismOfferList = new ArrayList<>();
        for(TourismOffer t: offerList){
            if(t instanceof InternationalTourismOffer){
                InternationalTourismOffer internationalTourismOffer = (InternationalTourismOffer) t;
                internationalTourismOffer.setTransportType(transportType);
                resultTourismOfferList.add(t);
            }
        }
        return resultTourismOfferList;
    }

    public List<TourismOffer> filterOffersByType(List<TourismOffer> offerList, Type type){
        List<TourismOffer> resultTourismOfferList = new ArrayList<>();
        for(TourismOffer t: offerList){
            if(t.getType() == type){
                resultTourismOfferList.add(t);
            }
        }
        return resultTourismOfferList;
    }
    public List<TourismOffer> filterOffersByAccomodationType(List<TourismOffer> offerList,
                                                             AccomodationType accomodationType){
        List<TourismOffer> resultTourismOfferList = new ArrayList<>();
        for(TourismOffer t: offerList){
            if(t.getAccomodationType() == accomodationType){
                resultTourismOfferList.add(t);
            }
        }
        return resultTourismOfferList;
    }
    public List<TourismOffer> filterOffersByFutureDepartureDate(List<TourismOffer> offerList){
        List<TourismOffer> resultTourismOfferList = new ArrayList<>();
        Date currentDate = new Date();
        for(TourismOffer t: offerList){
            if(t.getDepartureDate().after(currentDate)){
                resultTourismOfferList.add(t);
            }
        }
        return resultTourismOfferList;
    }
    public List<TourismOffer> filterOffersByAvailability(List<TourismOffer> offerList, boolean isAvailable){
        List<TourismOffer> resultTourismOfferList = new ArrayList<>();
        for(TourismOffer t: offerList){
            if(t.getIsAvailable() == isAvailable){
                resultTourismOfferList.add(t);
            }
        }
        return resultTourismOfferList;
    }

    //un Map cu rez cheie destinationCity si valoarea nr de oferte disponibile
    //extrag setul de orase
    //parcurg setul de orase
    //imi declar un counter (un numar rezultat initializat cu 0)
    //parcurg lista de oferte
    //daca coincide orasul cu orasul din oferta atunci intram in if si verificam availability
    //daca este available atunci counter++


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
