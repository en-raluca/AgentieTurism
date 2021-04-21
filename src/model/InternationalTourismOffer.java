package model;

import java.util.Date;

public class InternationalTourismOffer extends TourismOffer{
        private String transportType;
        private String departureCity;
        private double transportCost;

        public InternationalTourismOffer(int offerId, Type type, String destinationCity, Date departureDate, Date arrivalDate,
                                         double pricePerPerson, boolean isAvailable, String accomodationAddress,
                                         String accomodationName, AccomodationType accomodationType, String transportType,
                                         String departureCity, double transportCost){
            super(offerId, type, destinationCity, departureDate, arrivalDate, pricePerPerson, isAvailable, accomodationAddress,
                    accomodationName, accomodationType);
            this.transportType = transportType;
            this.departureCity = departureCity;
            this.transportCost = transportCost;
        }
        public String getTransportType(){
            return transportType;
        }
        public void setTransportType(String transportType){
            this.transportType = transportType;
        }
        public String getDepartureCity(){
            return departureCity;
        }
        public void setDepartureCity(String departureCity){
            this.departureCity = departureCity;
        }
        public double getTransportCost(){
            return transportCost;
        }
        public void setTransportCost(double transportCost){
            this.transportCost = transportCost;
        }
        @Override
        public String toString(){
            return "Offer ID: " + getOfferId() + ", Type: " + getType() + ", Destination City: " + getDestinationCity() +
                    ", Departure Date: " + getDepartureDate() + ", Arrival Date: " + getArrivalDate() + ", Price Per Person: " +
                    getPricePerPerson() + ", Availability: " + getIsAvailable() + ", Accomodation Address: " + getAccomodationAddress() +
                    ", Accomodation Name: " + getAccomodationName() + ", Accomodation: " + getAccomodation() + ", Transport Type: " +
                    transportType + ", Departure City: " + departureCity + ", Transport Cost: " + transportCost;
        }
}
