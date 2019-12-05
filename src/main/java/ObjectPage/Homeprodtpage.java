package ObjectPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Homeprodtpage extends Basepage {
	
			@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
		private WebElement tabDresses;
			
		@FindBy(xpath = "//*[@id=\"search_query_top\"]")
		private WebElement searchbox;
		
		@FindBy (xpath = "//*[@id=\"searchbox\"]/button")
		private WebElement clickbtn;
		
		@FindBys (@FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[2]"))
		private List<WebElement> Searchresult;
		
		public Homeprodtpage() {
			PageFactory.initElements(driver,this);
		}
		
		public void gettabDresses() {
			tabDresses.click();
			
		}
			
			public WebElement getsearchbox() {
				return searchbox;
			}
				
			public WebElement getclickbtn() {
				return clickbtn;
				
			}
			
			public int getSearchresult() {
				return Searchresult.size();
			}
			}
			
			
		
		
	



