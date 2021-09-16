package garage;

import java.util.HashMap;
import java.util.Map;

import exception.GarageException;
import model.Veicolo;
import service.GarageService;

public class Garage {

	Map<Integer, Veicolo> mappaVeicoli = new HashMap<>();
	GarageService garageService = new GarageService();

	public void addVeicolo(Veicolo veicolo, Integer posizione) {

		
		//controllo se la posizione è valida
		if (posizione != null && garageService.checkPosizoneValida(posizione)==false) {
			System.out.println("Veicolo non inserito. Posizione " + posizione + " non valida");
			return;
		}

		if (garageService.checkTipo(veicolo.getTipo())==false) {
			System.out.println("Veicolo non inserito. Tipo " + veicolo.getTipo() + " non valido");
			return;
		}

		try {
			boolean disponibilitaPostiGarage= garageService.checkDisponibilità(mappaVeicoli);
			boolean posizioneLibera = garageService.checkPosizoneLibera(posizione, mappaVeicoli);
			
			//aggiungo il veicolo solo se ci sono posti diponibili e la posizione richieste è libera
			if (disponibilitaPostiGarage && posizioneLibera) {
				garageService.addVeicolo(posizione, mappaVeicoli, veicolo);
			}
		} catch (GarageException ex) {
			System.out.println(ex.getMessage());
		}
	}

}