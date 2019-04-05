package CommandLineArguments;

import java.lang.Math;

public class FillingTime {

	public static void main(String[] args) {

		Double areaTotal = 0.0;
		Double volumenCilindro = 0.0;
		Double l = Double.parseDouble(args[0]);
		Double a = Double.parseDouble(args[1]);
		Double b = Double.parseDouble(args[2]);
		Double alfa = Double.parseDouble(args[3]);
		Double h = Double.parseDouble(args[4]);
		Double r = Double.parseDouble(args[5]);
		Double x = Double.parseDouble(args[6]);
		Double pi = Math.PI;
		Double volumenLluvia = 0.0;
		Double time = 0.0;

		// se halla el area total del techo + la canal + circunferencia del cubo
		areaTotal = (((a * Math.cos(alfa)) * l) + (b * l) + (pi * Math.pow(r, 2)));
		// se halla el volumen de la lluvia y se pasa de dm cuadrados a ml
		volumenLluvia = ((areaTotal * 100) * x);
		// se halla el volumen del cilindro
		volumenCilindro = ((pi * Math.pow(r, 2) * h) * Math.pow(10, 6));
		// se halla el tiempo de llenado en horas
		time = (volumenCilindro / volumenLluvia);
		// se redondea con dos decimales el tiempo de llenado
		time = Math.rint(time * 1000) / 1000;
		System.out.println("El tiempo de llenado es de = " + time + " horas");

	}
}