package CommandLineArguments;

import java.lang.Math;

public class FillingTime {

	public static void main(String[] args) {

		Double totalArea = 0.0;
		Double cylinderVolume = 0.0;
		Double l = Double.parseDouble(args[0]);
		Double a = Double.parseDouble(args[1]);
		Double b = Double.parseDouble(args[2]);
		Double alpha = Double.parseDouble(args[3]);
		Double h = Double.parseDouble(args[4]);
		Double r = Double.parseDouble(args[5]);
		Double x = Double.parseDouble(args[6]);
		Double pi = Math.PI;
		Double rainVolume = 0.0;
		Double time = 0.0;

		// se halla el area total del techo + la canal + circunferencia del cubo
		totalArea = (((a * Math.cos(alpha)) * l) + (b * l) + (pi * Math.pow(r, 2)));
		// se halla el volumen de la lluvia y se pasa de dm cuadrados a ml
		rainVolume = ((totalArea * 100) * x);
		// se halla el volumen del cilindro
		cylinderVolume = ((pi * Math.pow(r, 2) * h) * Math.pow(10, 6));
		// se halla el tiempo de llenado en horas
		time = (cylinderVolume / rainVolume);
		// se redondea con dos decimales el tiempo de llenado
		time = Math.rint(time * 1000) / 1000;
		System.out.println("El tiempo de llenado es de = " + time + " horas");

	}
}