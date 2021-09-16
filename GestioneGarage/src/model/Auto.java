package model;

public class Auto extends Veicolo {

    private String targa;

    public Auto(String targa) {
        this.targa = targa;
    }

    @Override
	public String getTipo() {
        return Veicolo.TIPO_AUTO;
    }

    @Override
    public String getTarga() {
        return targa;
    }

    @Override
    public String toString() {
        return getTipo() + " - Targa:" + getTarga();
    }

}