package org.generation;

public class ParticipanteTest {

	public static void main(String[] args) {
		
		Participante lalo = new Participante("Lalo", "García");
		Participante jess = new Participante("Jess", "Rdgz");
		Participante david = new Participante("David", "Olea");
		Participante maria = new Participante("Maria", "Gomez", 29);
		
		System.out.println( lalo.detalles());
		System.out.println( jess.detalles());
		System.out.println( david.detalles());
		System.out.println( maria.detalles());
		
		System.out.println( Participante.detallesEmpresa() );
		
		Sedes genMx = new Sedes("Generation MX", "México");
		genMx.agregarParticipante(lalo);
		genMx.agregarParticipante(jess);
		genMx.agregarParticipante(david);
		genMx.agregarParticipante(maria);
		genMx.agregarParticipante( new Participante("Esteban", "Castro", 27));
		genMx.agregarParticipante( new Participante("MaryLuz", "García"));
		
		System.out.println( genMx.mostrarParticipantes() );

	}

}
