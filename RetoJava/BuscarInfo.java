package primerprueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BuscarInfo extends Navegador {
	public void buscar() {
		WebElement buscar; // escribiendo en google y buscando
		buscar = driver.findElement(By.xpath("//input[@class= 'gLFyf gsfi']"));
		buscar.sendKeys("Medellín\n");
	}
	public void entrandoWiki() {
		WebElement Wiki;// entrando a Wikipedia
		Wiki = driver.findElement(By.xpath("//cite[@class= 'iUh30 bc']"));
		Wiki.click();

	}
}