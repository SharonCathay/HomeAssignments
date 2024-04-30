package week2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		WebElement rb = driver.findElement(By.xpath("//label[text()='Chennai']"));
		rb.click();
		boolean selected = rb.isSelected();
		System.out.println("Is radio button selected?" + selected);
		WebElement db = driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
		boolean enabled = db.isEnabled();
		if (enabled == true) {
			System.out.println(db.getText());
		}
		WebElement agegroup = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
		boolean enabled2 = agegroup.isEnabled();
		if (enabled2 == true) {
			System.out.println("21-40 years age group is selected");
		}
		else {
			agegroup.click();			
		}
		driver.close();
	}

}
