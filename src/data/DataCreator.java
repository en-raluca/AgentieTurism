package data;

import model.Tourist;

import java.util.ArrayList;
import java.util.List;

//creare de ob turisti (list)
public class DataCreator {

        public List<Tourist> createTouristList() {
            Tourist tourist1 = new Tourist("Ana", "Pop", 32, "anapop@gmail.com",
                    "Cluj-Napoca", "Romania", "0755786984",
                    "2890415126778");
            Tourist tourist2 = new Tourist("Carmen", "Enescu", 35,
                    "carmenenescu@gmail.com", "Bucuresti", "Romania",
                    "0756900788", "2860318124998");
            Tourist tourist3 = new Tourist("Florin", "Ghenea", 26,
                    "floring@yahoo.com", "Suceava", "Romania",
                    "0788910455", "1930830124667");
            Tourist tourist4 = new Tourist("Andrei", "Neag", 40, "andrein@gmail.com",
                    "Timisoara", "Romania", "0788934678",
                    "1820912125776");
            Tourist tourist5 = new Tourist("Vasile", "Corujan", 55, "vasile55@yahoo.com",
                    "Arad", "Romania", "0753123777",
                    "1650428125667");
            Tourist tourist6 = new Tourist("John", "Snow", 37, "johnsnow@gmail.com",
                    "Cluj-Napoca", "Romania", "0765899899",
                    "1840123124566");
            Tourist tourist7 = new Tourist("Emma", "Krauss", 34, "emmaK@gmail.com",
                    "Cluj-Napoca", "Romania", "0754571833",
                    "2870328124777");
            Tourist tourist8 = new Tourist("Cristina", "Vasilescu", 60, "crisv@gmail.com",
                    "Constanta", "Romania", "0767889256",
                    "2600629123777");
            Tourist tourist9 = new Tourist("Mihai", "Pop", 35, "mihaip@yahoo.com",
                    "Brasov", "Romania", "0788455267",
                    "1861212124667");
            Tourist tourist10 = new Tourist("Elena", "Chereches", 33, "elenach@gmail.com",
                    "Bucuresti", "Romania", "0788435999",
                    "2880305124778");

            List<Tourist> touristList = new ArrayList<>();
            touristList.add(tourist1);
            touristList.add(tourist2);
            touristList.add(tourist3);
            touristList.add(tourist4);
            touristList.add(tourist5);
            touristList.add(tourist6);
            touristList.add(tourist7);
            touristList.add(tourist8);
            touristList.add(tourist9);
            touristList.add(tourist10);
            return touristList;
        }
}
