package tutorialJava.capitulo04.ejercicios.practica_cartas;

public class Carta {
		String valor2;
		String valor;
		String palo;
		String id;

	public Carta() {
		// TODO Auto-generated constructor stub
	}

	public Carta(int valor, String palo, int id) {
		super();

		this.valor = Integer.toString(valor);
		this.valor2 = Integer.toString(valor);
		this.palo = palo;
		this.id = Integer.toString(id);
		
		if (this.valor.length() < 2) {
			this.valor = (valor + " ");
		}
		
		if (this.valor2.length() < 2) {
			this.valor2 = ("_" + valor);
		}
		
		if (this.id.length() < 2) {
			this.id = (" " + id);
		}
	}

	@Override
	public String toString() {
//		el código que funciona:
//		return "Carta [valor=" + valor + ", palo=" + palo + ", id=" + id + "]";
		return "  _______ \n"
			 + " |"  + valor + "     |⸜\n"
			 + " |"  + palo + "      |·⸌⸜\n"
			 + " |   "  +  "    |"+id+ "/\n"
			 + " |   "    +     "    |·/\n"
			 + " |      "  + palo + "|/\n"
			 + " |_____" + valor2 + "!\n"
			 + "              ⸌⸜·/   \n"
			 ;
		
/*	
 * 		el código que funciona:
 * 	
		return "  _________  \n"
		 	 + " |         | \n"
		   	 + " |         |"
		   	 ;
*/	
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	
}
