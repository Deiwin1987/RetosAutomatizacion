package retojava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validacion {
       
        public int validationNumber(){
            boolean entradaNumerico = true;
            int numero=0;
            while(entradaNumerico ){
            	System.out.println("---------------------");
            	System.out.println("Piramide de Astericos");
            	System.out.println("---------------------");
            	System.out.print("Indique cuantos pisos deseas que tenga la piramide (Maximo 40):");
                try {
                    Scanner entrada = new Scanner(System.in);
                    numero = entrada.nextInt();
                    
                    if (numero<0){
                        System.out.println("El numero debe ser positivo");
                        entradaNumerico = true;
                    } else if(numero%2==0){
                        System.out.println("El numero de pisos es par");
                        entradaNumerico = false;
                    } else {
                        System.out.println("El numero de pisos es impar");
                        entradaNumerico = false;
                    }
                    
                    
                } catch (InputMismatchException e) {
                    System.out.println("No está permitido ingresar letras");
            }
            
        }
            
			return numero;
			
			
    }
}