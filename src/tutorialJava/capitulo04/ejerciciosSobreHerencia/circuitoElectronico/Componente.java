package tutorialJava.capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class Componente {

	protected Componente a;
	protected String nombre;
	protected Componente b;
	
	public Componente(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
	
	/**
	 * @return the a
	 */
	public Componente getA() {
		return a;
	}


	/**
	 * @param a the a to set
	 */
	public void setA(Componente a) {
		this.a = a;
	}


	/**
	 * @return the b
	 */
	public Componente getB() {
		return b;
	}


	/**
	 * @param b the b to set
	 */
	public void setB(Componente b) {
		this.b = b;
	}


	@Override
	public String toString() {
		
/*		return "Componente [nombre=" + nombre + ", a=" + a + ", b=" + b + ", getNombre()=" + getNombre() + ", getA()="
				+ getA() + ", getB()=" + getB() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
*/		
//		return "[Anterior: "+ a + nombre + "Siguiente: " + b + " ]";
		return a.nombre +" "+ b.nombre;
		
	}
	
	
	
}
