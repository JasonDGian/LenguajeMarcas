package es.iesjandula.coches;

public class AppCoches {

	public static void main(String[] args) {

		Motor gasolina = new Motor ("Gasolina" , 180);
		
		Coche Fiat126 = new Coche("126","Fiat",gasolina,126000);
		
		System.out.println(Fiat126.getMarca());
		System.out.println(Fiat126.getModelo());
		System.out.println(Fiat126.getRodaje());
		System.out.println(Fiat126.getMotor().getCaballos());
		System.out.println(Fiat126.getMotor().getTipo());
		
		System.out.println(Fiat126);
		System.out.println(gasolina);
		
	}

}
