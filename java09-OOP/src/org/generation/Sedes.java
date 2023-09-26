package org.generation;

import java.util.ArrayList;

public class Sedes {
	String nombreSede;
	String pais;
	ArrayList< Participante > participantes;
	
	Sedes ( String nombre, String pais){
		this.nombreSede = nombre;
		this.pais = pais;
		this.participantes = new ArrayList<>();
	}
	
	void agregarParticipante(Participante persona  ) {
		participantes.add( persona  );
	}
	
	String mostrarParticipantes() {	
		String textoCompleto = "";
		for (Participante participante : participantes) {
			textoCompleto += this.nombreSede+ " " + participante.detalles() + "\n";
		}
		return textoCompleto;		
	}

}
