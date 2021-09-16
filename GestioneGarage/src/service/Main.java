package service;

import garage.Garage;
import model.Auto;
import model.Bici;
import model.Furgone;
import model.Moto;

public class Main {


    public static void main(String[] args) {

        Auto auto = new Auto("BY537ST");
        Auto auto2 = new Auto("AS765DF");
        Moto moto = new Moto("dp997gg");
        Moto moto2 = new Moto("LL88DS");
        Furgone furgone = new Furgone("ASKDI9");
        
        Bici bici = new Bici();
        Garage garage = new Garage();

        garage.addVeicolo(auto, null);
        garage.addVeicolo(moto, 1 );
        garage.addVeicolo(furgone, 16 );
        garage.addVeicolo(furgone, 3); 
        garage.addVeicolo(auto2, null);
        garage.addVeicolo(bici, 3);
        garage.addVeicolo(moto2, 3);
        
        
        

       
    }
}
