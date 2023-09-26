package animales.zoologico;

public class Felino {

   String tipo;
   int edad;
   double peso;
   int id;

   static String zoologico;
   static int contador;
   static int jaula;

   static {
       zoologico = "Zoologico de guadalajara";
       jaula = 1;
   }
   // se inicializan non-static
   {
       
       this.peso = 30.00;
   }

   Felino(String tipo, int edad) {
       this.tipo = tipo;
       this.edad = edad;
       this.id = contador++;
   
   }

   Felino(String tipo, int edad, double peso) {
       this(tipo, edad);
       this.peso = peso;
   }

   String informacion() {
       return this.id + " " + this.tipo + " con " + this.edad + " pesa un total " + this.peso;
   }

   static String folio() {
       return zoologico + " tiene la cantidad de " + contador++ + " Felinos en la jaula numero " + jaula;
   }
}
