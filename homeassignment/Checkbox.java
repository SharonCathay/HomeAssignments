package week2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/checkbox.xhtml");
	driver.manage().window().maximize();
	driver.findElement(By.id("j_idt87:j_idt89")).click();
	driver.findElement(By.id("j_idt87:j_idt91")).click();
	driver.findElement(By.xpath("//label[text()='Java']")).click();
	String txt = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
	System.out.println("Above checkboxes checked? "+txt);
	driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']/div)[2]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	String txta = driver.findElement(By.xpath("//p[contains(text(),'State')]")).getText();
	System.out.println("Tri-state option is " + txta);
	driver.findElement(By.xpath("(//div[@class='card']/div)[5]")).click();
	String txtb = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
	System.out.println("Toggle ON? "+txtb);
	boolean disabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isSelected();
	System.out.println("Checkbox is disabled? " + disabled);
	driver.findElement(By.xpath("//h5[text()='Select Multiple']/following-sibling::div")).click();
	driver.findElement(By.xpath("(//label[text()='Istanbul'])[2]/preceding-sibling::div")).click();
	driver.findElement(By.xpath("(//label[text()='Berlin'])[2]/preceding-sibling::div")).click();
	driver.findElement(By.xpath("//a[@aria-label='Close']")).click();
	Thread.sleep(3000);
	driver.close();
	}
}
