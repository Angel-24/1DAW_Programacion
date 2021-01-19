package tutorialJava.capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class ComponenteLed extends Componente{

	protected double luminosidad;

	@Override
	public String toString() {
		return a.nombre +" ...[    "+ nombre +"      | "+ luminosidad +" lux ]... "+ b.nombre;
	}
	
	/**
	 * @param a
	 * @param nombre
	 * @param luminosidad
	 * @param b
	 */
	
	public ComponenteLed(String nombre, double luminosidad) {
		super(nombre);
		this.luminosidad = luminosidad;
	}
}

