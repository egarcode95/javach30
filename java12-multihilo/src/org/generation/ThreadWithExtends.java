package org.generation;

class Iteration {
	private String name;
	
	public Iteration(String name) {
		this.name = name;
	}
	
	public void numberOfIteration( int number) {
		
		for (int i = 0; i < number; i++) {
			System.out.println("Obj: " + this.name  + ", iteration: " + i );			
		}
	}
	
}

class MyThread extends Thread{
	
	public MyThread( String name ) {
		super(name);
	}
	
	// método que será concurrente
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {			
			System.out.println("id:"+ super.getId() + " Name: " + super.getName()  
				+ ", iteration: " + i );			
			try {
				Thread.sleep(1000); // suspender el hilo
			} catch (InterruptedException e) { 
				e.printStackTrace();
			} 
		}
		
	}	
}


public class ThreadWithExtends {
	
	public static void main(String[] args) {
		// ----------- programación secuencial---------
		Iteration it01 = new Iteration("iteración 01");
		Iteration it02 = new Iteration("iteración 02");
		Iteration it03 = new Iteration("iteración 03");
		
		it01.numberOfIteration(5);
		it02.numberOfIteration(5);
		it03.numberOfIteration(5);
		
		//--------- Realizar concurrencias -------------
		System.out.println("<---- Concurrencias ------>");
		MyThread hilo01 = new MyThread("hilo01");
		MyThread hilo02 = new MyThread("hilo02");
		MyThread hilo03 = new MyThread("hilo03");
		
		// ejecutar las concurrencias.
		hilo01.start();
		hilo02.start();
		hilo03.start();
		
		System.out.println("Hilo 01 isAlive: " + hilo01.isAlive() );
		System.out.println("Hilo 02 isAlive: " + hilo02.isAlive() );
		System.out.println("Hilo 03 isAlive: " + hilo03.isAlive() );
		
		
		try {
			hilo01.join();
			hilo02.join();
			hilo03.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Hilo 01 isAlive: " + hilo01.isAlive() );
		System.out.println("Hilo 02 isAlive: " + hilo02.isAlive() );
		System.out.println("Hilo 03 isAlive: " + hilo03.isAlive() );
		System.out.println("Fin de mi programa");
	}


}
