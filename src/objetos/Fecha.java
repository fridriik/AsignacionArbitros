package objetos;

import java.util.ArrayList;


public class Fecha {
	
	private ArrayList<Partido> partidos;
	private int numeroDeFecha;
	
	
	/**
	 * Constructor de una fecha del Torneo
	 * @param partidos Lista de partidos de esa fecha
	 * @param numeroDeFecha numero de fecha
	 */
	public Fecha(ArrayList<Partido> partidos, int numeroDeFecha) {
		this.partidos = partidos;
		this.numeroDeFecha = numeroDeFecha;
	}

	
	//Getter de numero de fecha
	public int numeroDeFecha() {
		return numeroDeFecha;
	}
	
	
	/**
	 * Clonacion de la lista de partidos
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Partido> getPartidos() {
		return (ArrayList<Partido>) partidos.clone();
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nFecha: " + numeroDeFecha + "\n");
		for (Partido p: this.partidos) {
			if(p.getArbitro() == null) {
				sb.append("------------------------------------------\n");
				sb.append(p.getLocal() + " vs " + p.getVisitante() + "\n");
				
			}
			else {
				sb.append("------------------------------------------\n");
				sb.append(p.getLocal() + " vs " + p.getVisitante() + "\n");
				sb.append("Arbitro: " + p.getArbitro().getCodigo() + " - " + p.getArbitro().getNombre() +  "\n");
			}
		}
		return sb.toString().toUpperCase();
	}
	
}
