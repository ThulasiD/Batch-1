package TestObject;

import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectPage.Dressespage;
import ObjectPage.Homeprodtpage;

public class Homeprodttest {
	
	Homeprodtpage hp;
	Dressespage dp;
	
	public Homeprodttest() {
		hp = new Homeprodtpage();
		dp = new Dressespage();
	}
	
	@Test
	public void verifyProductHeaderCount() {
		hp.gettabDresses();
		
		Assert.assertTrue(dp.getProductNumberFromHeader()== dp.getProductCount() , "Failed");
		
	}
	
	@Test
	public void verifySearchresult() {
		hp.getsearchbox().sendKeys("dresses");
		hp.getclickbtn().click();
		Assert.assertTrue(hp.getSearchresult()>0, "Fail");
		
	}
		
	}

