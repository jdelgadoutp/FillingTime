package CommandLineArguments;

import java.lang.Math;
import CommandLineArguments.Cylinder;

public class FillingTime {

	public static void main(String[] args) {

		Cylinder myCylinder = new Cylinder(args);
		
		myCylinder.FillingTime(args);

	}
}