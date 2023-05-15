import dao.*;
import entity.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------");
        /* CREATING LOCATION INSTANCES */

        LocationDAO locationDAO = new LocationDAO();
        Location location1 = new Location(234454.505, 343434.5454, 34345);
        Location location2 = new Location(299994.505, 388888.5454, 34345);
        Location location3 = new Location(200054.505, 342222.5454, 34345);
        locationDAO.saveLocation(location1);
        locationDAO.saveLocation(location2);
        locationDAO.saveLocation(location3);

        System.out.println("-------------------------------------------------------------------------");
        /* CREATING PERSON INSTANCES */

        PersonDAO personDAO = new PersonDAO();
        Person person1 = new Person("Raul Thompson", "British", "Engineer");
        Person person2 = new Person("Ling Xim Ping", "Chinese", "Communication Specialist");
        Person person3 = new Person("Artyom Vladimirovici Alexev", "Russian", "Medic");
        Person person4 = new Person("Arthur Luther", "American", "Engineer");
        Person person5 = new Person("Ian Puzowski", "Polish", "Communication Specialist");
        Person person6 = new Person("Ion Popescu", "Romanian", "Medic");
        Person person7 = new Person("Masashi Mitarashi", "Japanese", "Engineer");
        Person person8 = new Person("Wolfgang Creutzfeldt", "German", "Communication Specialist");
        Person person9 = new Person("Artyom Vladimirovici Alexev", "Russian", "Medic");
        personDAO.savePerson(person1);
        personDAO.savePerson(person2);
        personDAO.savePerson(person3);
        personDAO.savePerson(person4);
        personDAO.savePerson(person5);
        personDAO.savePerson(person6);
        personDAO.savePerson(person7);
        personDAO.savePerson(person8);
        personDAO.savePerson(person9);

        System.out.println("-------------------------------------------------------------------------");
        /* CREATING CREWS */

        CrewDAO crewDAO = new CrewDAO();
        List<Person> persons1 = new ArrayList<>();
        persons1.add(person1);
        persons1.add(person2);
        persons1.add(person3);
        Crew crew1 = new Crew();
        crew1.setPersons(persons1);
        crewDAO.saveCrew(persons1);

        System.out.println("-------------------------------------------------------------------------");
        /* CREATING TIMESTAMP INSTANCES */

        TimestampDAO timestampDAO = new TimestampDAO();
        Timestamp timestamp1 = new Timestamp(28.000, LocalDate.of(2023, 5, 5));
        Timestamp timestamp2 = new Timestamp(28.000, LocalDate.of(2022, 7, 2));
        Timestamp timestamp3 = new Timestamp(28.000, LocalDate.of(2023, 3, 10));
        timestamp1.setLocation(location1);
        timestamp2.setLocation(location2);
        timestamp3.setLocation(location3);
        timestampDAO.saveTimestamp(timestamp1);
        timestampDAO.saveTimestamp(timestamp2);
        timestampDAO.saveTimestamp(timestamp3);

        System.out.println("-------------------------------------------------------------------------");
        /* CREATING STATUS INSTANCES */

        StatusDAO statusDAO = new StatusDAO();
        Status status1 = new Status();
        status1.setLocation(location1);
        status1.setTimestamp(timestamp1);
        status1.setCrew(crew1);
        statusDAO.saveStatus(status1);

    }

}
