package week9.day1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FbSignup extends ProjectSpecificMethod  {
	
	@Test(dataProvider="signup")
	public void signUp(String fname,String lname,String email,String pwd,String day,String month, String year,String gender) {
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys(email);
		driver.findElement(By.id("password_step_input")).sendKeys(pwd);
		driver.findElement(By.id("day")).sendKeys(day);
		driver.findElement(By.name("birthday_month")).sendKeys(month);
		driver.findElement(By.id("year")).sendKeys(year);
		driver.findElement(By.linkText("Female")).click();
	    }
	
	@DataProvider(name="signup")
	public String[][] setUp() {
		String[][] data=new String[1][7];
		data[0][0]="Abi";
		data[0][1]="shri";
	    data[0][2]="9500507089";
	    data[0][3]="796578@jeeva";
		data[0][4]="31";
		data[0][5]="March";
		data[0][6]="1995";
		
		
		return data;
	}

	
}
