package data;

import model.Reservation;
import model.Tourist;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateReservation {
    public void generateReservationFile(Reservation reservation, Tourist tourist){
            String directoryName = "./reservations";
            String fileName = "/Reservation.txt";

            File dir = new File(directoryName);
            //we use ! for negation - if the directory doesn't exist then create it
            if(!dir.exists()){
                dir.mkdir();
            }
            File file = new File(dir, fileName);
            if(!file.exists()){
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.out.println("The file failed to create.");
                    //e.printStackTrace();
                }
            }
            //"Reservation ID: " + reservationId + ", Offer ID: " + offerId + ", Reservation Date: " +
        //                reservationDate + ", Is Paid: " + isPaid + ", Final Price: " + finalPrice + ",
        //                Tourist List: " +
        //                touristList;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try{
                fw = new FileWriter(file);
                bw = new BufferedWriter(fw);
                bw.write("Hello " + tourist.getFirstName() + tourist.getLastName());
                bw.newLine();
                bw.write("Your reservation was created successfully in " + reservation.getReservationDate());
                bw.newLine();
                bw.write("having the reservation ID " + reservation.getReservationId());
                bw.newLine();
                bw.write("and the offer ID " + reservation.getOfferId());
                bw.newLine();
                bw.write("The payment of the reservation was successfully: " + reservation.getIsPaid());
                bw.newLine();
                bw.write("and the final price is: " + reservation.getFinalPrice());
                bw.newLine();
                bw.write("The following tourist successfully created a reservation: " + reservation.getTouristList());

                bw.flush();
            }
            catch(IOException e){
                System.out.println("The writing in the file failed.");
            }
            finally {
                try {
                    if(fw != null){
                        fw.close();
                    }
                    if(bw != null) {
                        bw.close();
                    }
                }
                catch(IOException e){

                }
            }

        }
}

