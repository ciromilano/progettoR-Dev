package service;

import java.util.Map;

import exception.GarageException;
import model.Veicolo;

public class GarageService {

	public boolean checkDisponibilit�(Map<Integer, Veicolo> mappaVeicoli) throws GarageException {
		if (mappaVeicoli.size() == 15) {
			throw new GarageException("ERRORE: GARAGE PIENO"); // Eccezione GARAGE PIENO
		}
		return true;
	}

	public boolean checkPosizoneValida(Integer posizione) {
		if (posizione >= 15 || posizione < 0) {
			return false;
		}
		return true;
	}

	// dato un indice verifica se la posizionce richiesta � occupato nella mappa
	public boolean checkPosizoneLibera(Integer posizione, Map<Integer, Veicolo> mappaVeicoli) throws GarageException {
		if (posizione == null) {
			return true;
		}

		// se il veicolo � nulla la posizione � libera
		// se diverso da null la posizione � occupata
		Veicolo veicolo = mappaVeicoli.get(posizione);
		if (veicolo != null) {
			throw new GarageException("ERRORE: POSTO OCCUPATO"); // Eccezione POSTO OCCUPATO
		}
		return true;
	}

	public boolean checkTipo(String tipo) {
		if (tipo.equals(Veicolo.TIPO_AUTO) || tipo.equals(Veicolo.TIPO_MOTO) || tipo.equals(Veicolo.TIPO_FURGONE)) {
			return true;
		} else {
			return false;
		}
	}

	public void addVeicolo(Integer posizione, Map<Integer, Veicolo> mappaVeicoli, Veicolo veicolo) {
		if (posizione != null) {
			mappaVeicoli.put(posizione, veicolo);
			System.out.println("Veicolo aggiunto alla posizione " + posizione + " " + veicolo.toString());
		} else {
			for (int i = 0; i < 15; i++) {
				if (mappaVeicoli.get(i) == null) {
					mappaVeicoli.put(i, veicolo);
					System.out.println("Veicolo aggiunto alla posizione " + i + " " + veicolo.toString());
					break;
				}
			}
			//
		}

		// System.out.println(mappaVeicoli);

	}
}