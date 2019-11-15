package primerprueba;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navegador {
	public static WebDriver driver; // Se declara variable "driver" como elemento WebDriver y static

	public void abrirCrhome() {
		System.setProperty("Webdriver.crhome.driver", "chromedriver.exe"); // define el driver correspodiente al
																			// navegador y la ruta
		driver = new ChromeDriver(); // se define la variable del driver como un driver especifico
		driver.manage().window().maximize();// Maximiza la pantalla del navegador.
		driver.get("https://www.google.com.co");// establece la pagina en la que inicia el navegador
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); // tIEMPO DE ESPERA
	}

	public void time() {
		WebDriverWait espera = new WebDriverWait(driver, 20);// instancia de driver con tiempo de espera
		WebElement enviarinfo;
		enviarinfo = espera.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type= 'search']")));
		enviarinfo.sendKeys("Esto es una prueba");
		// suspende el hilo actual por la cantidad de tiempo que se especifique
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		enviarinfo.clear();
	}

	public void cerrarChrome() {
		driver.close();
	}
}
