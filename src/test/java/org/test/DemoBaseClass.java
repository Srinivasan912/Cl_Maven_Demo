package org.test;

import java.awt.AWTException;

import org.pages.LoginPage;
import org.utility.BaseClass;

public class DemoBaseClass extends BaseClass {
	public static void main(String[] args) throws AWTException {
		launchBrowser("chrome");
		maximize();
		implicitwait(10);
		urlLaunch("https://www.facebook.com/");
		
		LoginPage l=new LoginPage();
		sendkeys(l.getTxtUsername(), "Srinivasan");
		sendkeys(l.getTxtPassword(), "12345678");
		
		driver.navigate().refresh();
		sendkeys(l.getTxtUsername(), "Vasan");
		tabKey();
		sendkeys(l.getTxtPassword(), "12345");
		tabKey();
		click(l.getBtnLogin());
	
	}
}
