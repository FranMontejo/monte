package died.guia03.problema01;

public class Recta {

	private Punto p1;
	private Punto p2;
	private Double pendiente;
	
	public Recta(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
		pendiente = p2.pendiente(p1);
	}
	
	public Recta() {
		p1 = new Punto(0,0);
		p2 = new Punto(0,0);
		pendiente = 1.00;
	}
	
	public boolean paralelas(Recta otraRecta) {
		if(this.pendiente == otraRecta.pendiente) {
			return true;
		}
		return false;
	}
	
	public double pendiente() {
		return this.pendiente;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recta other = (Recta) obj;
		if (p1 == null) {
			if (other.p1 != null)
				return false;
		} else if (!p1.equals(other.p1))
			return false;
		if (p2 == null) {
			if (other.p2 != null)
				return false;
		} else if (!p2.equals(other.p2))
			return false;
		if (pendiente == null) {
			if (other.pendiente != null)
				return false;
		} else if (!pendiente.equals(other.pendiente))
			return false;
		if(this.pendiente != this.p2.pendiente(other.p1))
			return false;
		
		return true;
	}
	
	
	
	
}
