package CommandLineArguments;

public class Cylinder {

	private Double totalArea;
	private Double cylinderVolume;
	private Double l;
	private Double a;
	private Double b;
	private Double alpha;
	private Double h;
	private Double r;
	private Double x;
	private Double pi;
	private Double rainVolume;
	private Double time;

	public Cylinder(String[] args) {
		this.totalArea = 0.0;
		this.cylinderVolume = 0.0;
		this.l = Double.parseDouble(args[0]);
		this.a = Double.parseDouble(args[1]);
		this.b = Double.parseDouble(args[2]);
		this.alpha = Double.parseDouble(args[3]);
		this.h = Double.parseDouble(args[4]);
		this.r = Double.parseDouble(args[5]);
		this.x = Double.parseDouble(args[6]);
		this.pi = Math.PI;
		this.rainVolume = 0.0;
		this.time = 0.0;
	}

	public Double getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(Double totalArea) {
		this.totalArea = totalArea;
	}

	public Double getCylinderVolume() {
		return cylinderVolume;
	}

	public void setCylinderVolume(Double cylinderVolume) {
		this.cylinderVolume = cylinderVolume;
	}

	public Double getL() {
		return l;
	}

	public void setL(Double l) {
		this.l = l;
	}

	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public Double getAlpha() {
		return alpha;
	}

	public void setAlpha(Double alpha) {
		this.alpha = alpha;
	}

	public Double getH() {
		return h;
	}

	public void setH(Double h) {
		this.h = h;
	}

	public Double getR() {
		return r;
	}

	public void setR(Double r) {
		this.r = r;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getPi() {
		return pi;
	}

	public void setPi(Double pi) {
		this.pi = pi;
	}

	public Double getRainVolume() {
		return rainVolume;
	}

	public void setRainVolume(Double rainVolume) {
		this.rainVolume = rainVolume;
	}

	public Double getTime() {
		return time;
	}

	public void setTime(Double time) {
		this.time = time;
	}

	public void FillingTime(String[] args) {

		// se halla el area total del techo + la canal + circunferencia del cubo
		setTotalArea((((a * Math.cos(alpha)) * l) + (b * l) + (pi * Math.pow(r, 2))));
		// se halla el volumen de la lluvia y se pasa de dm cuadrados a ml
		setRainVolume(((totalArea * 100) * x));
		// se halla el volumen del cilindro
		setCylinderVolume(((pi * Math.pow(r, 2) * h) * Math.pow(10, 6)));
		// se halla el tiempo de llenado en horas
		setTime((cylinderVolume / rainVolume));
		// se redondea con dos decimales el tiempo de llenado
		setTime(Math.rint(time * 1000) / 1000);
		System.out.println("El tiempo de llenado es de = " + getTime() + " horas");

	}

}
