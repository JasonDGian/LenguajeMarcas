package es.iesjandula.coches;

public class Coche 
{

	private String modelo;
	private String marca;
	private int rodaje;
	private Motor motor;
	
	
	// constructor vacío
	public Coche() {}
	
	// Constructor con objeto motor de parámetro.
	public Coche(String modelo, String marca, Motor motor, int rodaje) {
		this.modelo = modelo;
		this.marca = marca;
		this.rodaje = rodaje;	
		this.motor = motor;
	}
	
	// Constructor que instancia nuevo motor
	public Coche(String modelo, String marca, String tipo, int caballos, int rodaje) {
		this.modelo = modelo;
		this.marca = marca;
		this.rodaje = rodaje;	
		this.motor = new Motor(tipo, caballos);
	}
	
	// getters setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getRodaje() {
		return rodaje;
	}

	public void setRodaje(int rodaje) {
		this.rodaje = rodaje;
	}

	public Motor getMotor() {
		return this.motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	// To string
	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", marca=" + marca + ", rodaje=" + rodaje + ", motor=" + motor + "]";
	}

	
	
	
	
	
	
	
} // Cierra coches
