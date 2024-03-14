package es.iesjandula.coches;

public class Motor {
	
	private String tipo;
	private int caballos;
		
	// constructor
	public Motor(String tipo, int caballos) {
		this.tipo = tipo;
		this.caballos = caballos;
	}
	
	// getters setters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCaballos() {
		return this.caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	
	// to string
	@Override
	public String toString() {
		return "Motor [tipo=" + this.tipo + ", Caballos=" + this.caballos + "]";
	}
		
}
