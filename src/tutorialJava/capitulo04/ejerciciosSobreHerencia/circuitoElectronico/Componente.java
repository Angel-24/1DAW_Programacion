package tutorialJava.capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class Componente {

	protected String nombre;
	protected String a;
	protected String b;
	
	public Componente(String nombre, String a, String b) {
		super();
		this.nombre = nombre;
		this.nombre = a;
		this.nombre = a;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Componente [nombre=" + nombre + ", a=" + a + ", b=" + b + ", getNombre()=" + getNombre() + ", getA()="
				+ getA() + ", getB()=" + getB() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
