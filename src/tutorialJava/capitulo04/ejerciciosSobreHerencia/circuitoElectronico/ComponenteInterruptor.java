package tutorialJava.capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class ComponenteInterruptor extends Componente{

	protected static boolean cerrado;

	@Override
	public String toString() {
		
		if (cerrado == true) {
			return a.nombre +"         ...[ "+ nombre +" | Cerrado ]... "+ b.nombre;
		} //else if (cerrado != true) {
			return a.nombre +"         ...[ "+ nombre +" | Abierto ]... "+ b.nombre;

	}
	
	/**
	 * @param a
	 * @param nombre
	 * @param cerrado
	 * @param b
	 */
	
	public ComponenteInterruptor(String nombre, boolean cerrado) {
		super(nombre);
//		this.cerrado = cerrado;
	}
}
