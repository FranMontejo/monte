package died.guia03.problema03;

import died.guia03.problema02.Temperatura;

public class Registro {
	private String nombre;
	private Temperatura[] historico;
	private int cantElem;
	private int max = 50;
	
	public Registro() {
		this.historico = new Temperatura[max];
		this.nombre = "";
		this.cantElem = 0;
	}
	
	public Registro(String ciudad) {
		this.nombre = ciudad;
		this.cantElem = 0;
		this.historico = new Temperatura[max];
	}
	
	public String getCiudad() {
		return this.nombre;
	}
	
	public void imprimir() {
		System.out.println("Temperaturas registradas en "+this.nombre);
		for(int i = 0; i < cantElem; i++){
			System.out.println((i+1)+" "+historico[i].toString());
		}
	}
	
	public void agregarTemperatura(Temperatura t) {
		if(this.cantElem != this.max) {
		this.historico[this.cantElem] = t;
		this.cantElem++;
		}
	}
	
	public double mediaAsCelcius() {
		if(this.cantElem == 0) {
			return 0.00;
		}
			double prom = 0; 
			for(int i = 0; i < cantElem; i++) {
				prom+=this.historico[i].asCelcius();
		}
			return prom;
	}
	
	public double mediaAsFahrenheit() {
		if(this.cantElem == 0) {
			return 0.00;
		}
			double prom = 0; 
			for(int i = 0; i < cantElem; i++) {
				prom+=this.historico[i].asFahrenheit();
		}
			return prom;
	}
	
	public Temperatura maximo() {
		return tempmax(this.historico[0],0);
		
	}
	
	public Temperatura tempmax(Temperatura t, int cont) {
		if(cont == cantElem) {
			return t;
		}
		if(this.historico[cont].getGrados() < t.getGrados()) {
			return tempmax(t,cont+1);
		}
		return tempmax(historico[cont],cont+1);
		
	}
}
