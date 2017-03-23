

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class PruebaCirculo {

	public static void main(String[] args) {

		Circulo circulo = new Circulo(37, 43, 2.5);
		String salida = "La coorddfgdfgdffffffffffffffffffffffffdenada X es " + micirculito(circulo).obtenerX() +
		"\nLa coordenada Y es " + micirculito(circulo).obtenerY() +
		"\nEl radio es " + micirculito(circulo).obtenerRadio();
		micirculito(circulo).establecerX(35);
		micirculito(circulo).establecerY(20);
		micirculito(circulo).establecerRadio(4.25);
		salida += "\n\nLa nueva ubicación y el radio del círculo son\n" +
		micirculito(circulo).toString();
		DecimalFormat dosDigitos = new DecimalFormat("0.00");
		salida += "\nEl diámetro es " +
		dosDigitos.format(micirculito(circulo).obtenerDiametro());
		salida += "\nLa circunferencia es " +
		dosDigitos.format(micirculito(circulo).obtenerCircunferencia());
		salida += "\nEl área es " + dosDigitos.format(micirculito(circulo).obtenerArea());
		JOptionPane.showMessageDialog(null, salida);
		System.exit(0);

	}

	private static Circulo micirculito(Circulo circulo) {
		return circulo;
	} 

} 

