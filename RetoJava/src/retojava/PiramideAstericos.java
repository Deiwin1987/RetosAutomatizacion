package retojava;


public class PiramideAstericos {
	    
	public void mostrar(int numero) {
        if (numero%2==0) {
            buildPar(numero);
        } else {
            buildImpar(numero);
        }

 

    }
	    private void buildPar(int pisos) {
	        int piso =1;
	        int longitudDeLinea = 1;
	        int espacios = pisos-1;
	        while (piso <= pisos) {
	            for (int i = 1; i <= espacios; i++) {
	              System.out.print(" ");
	            }
	            for (int i = 1; i <= longitudDeLinea; i++) {
	              System.out.print("*");
	            }

	 

	            System.out.println();

	 

	            piso++;
	            espacios--;
	            longitudDeLinea += 2;
	          }
	    }
	    
	    private void buildImpar(int pisos) {
	        int piso =1;
	        int longitudDeLinea = (2*pisos)-1;
	        int espacios = 1;
	        while (piso <= pisos) {
	            for (int i = 1; i <= espacios; i++) {
	              System.out.print(" ");
	            }
	            for (int i = 1; i <= longitudDeLinea; i++) {
	              System.out.print("*");
	            }

	 

	            System.out.println();

	 

	            piso++;
	            espacios++;
	            longitudDeLinea -= 2;
	          }
	    }

	 

	}