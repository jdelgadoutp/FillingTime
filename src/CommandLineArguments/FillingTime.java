package CommandLineArguments;

import java.lang.Math;

public class FillingTime {

	public static void main(String[] args) {

	    Double areaTotal;

		areaTotal = ((Double.parseDouble(args[0]) * Math.cos(Double.parseDouble(args[3]))* Double.parseDouble(args[0])));
		Math.round(areaTotal);
		System.out.println(areaTotal);

	}
}