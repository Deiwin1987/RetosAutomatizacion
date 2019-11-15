package primerprueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ValidarNombre extends Navegador {
	public void validacion() {
		WebElement llamar;// validacion para saber si el nombre es el correcto
		llamar = driver.findElement(By.xpath("//h1[@class= 'firstHeading']"));
		System.out.println(llamar.getText());
		// Condicional para mostrar en consola
		if (llamar.getText().equalsIgnoreCase("Medell�n")) {
			System.out.println("Es igual a Medell�n");
		} else {
			System.out.println("No es igual a Medell�n");
		}
	}

}
