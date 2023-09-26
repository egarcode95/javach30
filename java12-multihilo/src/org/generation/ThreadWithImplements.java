package org.generation;

class MyThreadRunnable implements Runnable  {
	private String name;
	
	public MyThreadRunnable(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public long getId() {
		return Thread.currentThread().getId();
	}
	
	
	public void run() {
		for (int i = 0; i < 5; i++) {			
			System.out.println("id:"+ getId() + " Name: " + getName()  
				+ ", iteration: " + i );			
			try {
				Thread.sleep(1000); // suspender el hilo
			} catch (InterruptedException e) { 
				e.printStackTrace();
			} 
		}
	}
	
}



public class ThreadWithImplements {
	
	public static void main(String[] args) {
		System.out.println("Inicio de mi programa");
		
		MyThreadRunnable myThread01 = new MyThreadRunnable("hilo01");
		
		Thread hilo01 = new Thread( myThread01 );
		Thread hilo02 = new Thread( new MyThreadRunnable("hilo02") );
		Thread hilo03 = new Thread( new MyThreadRunnable("Hilo03") );
		
		hilo01.start();
		hilo02.start();
		hilo03.start();
		
		try {
			hilo01.join();
			hilo02.join();
			hilo03.join();
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
		
		System.out.println("Fin de mi programa");
		
	}

}
