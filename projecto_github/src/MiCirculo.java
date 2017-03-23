

import java.util.Scanner;

public class MiCirculo {

	
  public static void main(String[] args) {
	int x,y; 
	double radio, diametro, circunferencia, area;
	
  	Scanner sc = new Scanner(System.in);
  	System.out.println("Punto dfsdfsfsdfsfsdsfx: ");
	x= sc.nextInt();
	System.out.println("Punto y: ");
	y = sc.nextInt();
	System.out.println("Radio: ");
	radio = sc.nextInt();
	diametro = 2 * Diametro(radio);
	circunferencia= Diametro(diametro) * 3.1416;
	area= 3.1416 * Diametro(radio) * Diametro(radio);
	System.out.println("Los datos de mi círculo son Centro:" + x + "," + y + ", Radio: "+ Diametro(radio) + ", Diámetro: " + Diametro(diametro) 
			+ ", Circunferencia: " + Diametro(circunferencia) + ", Area: "+ Diametro(area));
	sc.close();
  }

private static double Diametro(double diametro) {
	return diametro;
}
}