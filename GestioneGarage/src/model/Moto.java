package model;

public class Moto extends Veicolo {

	
	   private String targa;

	    public Moto(String targa) {
	        this.targa = targa;
	    }

	    @Override
	    public String getTipo() {
	        return Veicolo.TIPO_MOTO;
	    }

	    @Override
	    public  String getTarga() {
	        return targa;
	    }

	    @Override
	    public String toString() {
	        return getTipo() + " - Targa:" + getTarga();
	    }

	

}
