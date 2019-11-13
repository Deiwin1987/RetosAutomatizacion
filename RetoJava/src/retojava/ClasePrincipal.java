package retojava;


public class ClasePrincipal {
public static void main(String[] args) {
    Validacion validacion = new Validacion();
    int numero = validacion.validationNumber();
    PiramideAstericos piramide = new PiramideAstericos();
    piramide.mostrar(numero);
    }
}

