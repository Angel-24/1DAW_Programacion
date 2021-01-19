package tutorialJava.capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class Circuito {

	public Circuito() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ComponenteBateria bateria = new ComponenteBateria("Batería", 1);
		ComponenteResistencia resistencia = new ComponenteResistencia("Resistencia", 1);
		ComponenteInterruptor interruptor = new ComponenteInterruptor("Interruptor", true);
		ComponenteLed led = new ComponenteLed("Led", 1);
		
		bateria.setA(interruptor); bateria.setB(resistencia);
		resistencia.setA(bateria); resistencia.setB(led);
		interruptor.setA(led); interruptor.setB(bateria);
		led.setA(interruptor); led.setB(resistencia);
		
		System.out.println(bateria +"\n"+ resistencia +"\n"+ interruptor +"\n"+ led);
	}

}
