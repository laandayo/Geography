package Controller;

import java.util.ArrayList;
import java.util.Collections;

public class Manager {

    Validation validz = new Validation();
    ArrayList<Country> lc = new ArrayList();
    public void inputCountry() {
        System.out.print("Enter code of contry: ");
        String countryCode = validz.checkInputString();
        if (!validz.checkCountryExist(lc, countryCode)) {
            System.err.println("Country exist.");
            return;
        }
        System.out.print("Enter name of contry: ");
        String countryName = validz.checkInputString();
        System.out.print("Enter total area: ");
        double countryArea = validz.checkInputDouble();
        System.out.print("Enter terrain of contry: ");
        String countryTerrain = validz.checkInputString();
        lc.add(new Country(countryTerrain, countryCode, countryName, countryArea));
        System.err.println("Add successful.");
    }
     public void printCountry() {
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }
      public void printCountrySorted() {
            Collections.sort(lc);
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }
      public void searchByName() {
        System.out.print("Enter the name you want to search for: ");
        String countryName = validz.checkInputString();
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            if (country.getCountryName().equalsIgnoreCase(countryName)) {
                country.display();
            }
        }
    }
}