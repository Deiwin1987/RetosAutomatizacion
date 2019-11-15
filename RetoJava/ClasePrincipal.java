package primerprueba;

public class ClasePrincipal {

	public static void main(String args[]) {
		System.out.println("WebDriver se esta inicializando, Por favor espere..."); // Imprimir en pantalla
		Navegador entrar = new Navegador();// abriendo navegador
		entrar.abrirCrhome();// mapear
		
		BuscarInfo entrada = new BuscarInfo();
		entrada.buscar();
		entrada.entrandoWiki();
		
		ValidarNombre validar = new ValidarNombre();
		validar.validacion();
		entrar.time();
		entrar.cerrarChrome();

		System.out.println("*******************");
		System.out.println("!Prueba Finalizada!");
		System.out.println("*******************");

	}

}
