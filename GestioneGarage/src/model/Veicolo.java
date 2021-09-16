package model;

public abstract class Veicolo {
	
	public final static String TIPO_AUTO = "AUTO";
	public final static String TIPO_MOTO = "MOTO";
	public final static String TIPO_FURGONE = "FURGONE";

	public abstract String getTipo();

	public abstract String getTarga();

}