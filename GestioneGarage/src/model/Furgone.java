package model;

public class Furgone extends Veicolo {

	  private String targa;

	    public Furgone(String targa) {
	        this.targa = targa;
	    }

	    @Override
	    public   String getTipo() {
	        return Veicolo.TIPO_FURGONE;
	    }

	    @Override
	    public   String getTarga() {
	        return targa;
	    }

	    @Override
	    public String toString() {
	        return getTipo() + " - Targa:" + getTarga();
	    }

	
	
	
}
