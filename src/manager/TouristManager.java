package manager;

import model.TourismOffer;
import model.Tourist;

import java.util.ArrayList;
import java.util.List;

public class TouristManager {
    public Tourist findTouristByNationalID(List<Tourist> touristList, String nationalIdNumber){
        Tourist tourist = null;
        for(Tourist t: touristList){
            if(t.getNationalIdNumber() == nationalIdNumber){
                tourist = t;
            }
        }
        return tourist;
    }
    public List<Tourist> findTouristByCountry(List<Tourist> touristList, String countryOfResidence){
        List<Tourist> resultTouristList = new ArrayList<>();
        for(Tourist t: touristList){
            if(t.getCountryOfResidence() == countryOfResidence){
                resultTouristList.add(t);
            }
        }
        return resultTouristList;
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
