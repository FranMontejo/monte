package died.guia03.problema02;

public class Temperatura {
	private Double grados;
	Escala escala;
	
	public Temperatura() {
		grados = 0.00;
		escala = Escala.CELCIUS;
	}
	
	public Temperatura(double temp, Escala esc) {
		grados = temp;
		escala = esc;
	}
	
	@Override
	public String toString() {
		String a;
		if(Escala.CELCIUS == escala) {
			a = " C°";
		}
		else {
			a = " F°";
		}
		return grados.toString()+ a;
	}
	
	public double asCelcius() {
		if(Escala.CELCIUS == this.escala)
			return this.grados;
		return ((this.grados-32)*5/9);
	}
	
	public double asFahrenheit() {
		if(Escala.FAHRENHEIT == this.escala)
			return this.grados;
		return ((this.grados)*9/5)+32;
	}
	
	public void cambiarTemperatura(Temperatura temp) {
		
			if(temp.escala == this.escala) {
				this.grados+=temp.grados;
			}
			else {
				if(this.escala == Escala.CELCIUS) {
					this.grados+=temp.asCelcius();
				}
				else {
					this.grados+=temp.asFahrenheit();
				}
			}
	}
	
	
	
	
}
