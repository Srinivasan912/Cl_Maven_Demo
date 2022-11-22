package org.excelfiles;

import java.io.IOException;

import org.pages.LoginPage;
import org.utility.BaseClass;

public class GetExcel extends BaseClass {
 public static void main(String[] args) throws IOException {
	 launchBrowser("chrome");
		maximize();
		implicitwait(10);
		urlLaunch("https://www.facebook.com/");
		
		LoginPage l=new LoginPage();
		sendkeys(l.getTxtUsername(), getExcel("Excel", "Page1", 2, 0) );
		sendkeys(l.getTxtPassword(), getExcel("Excel", "Page1", 2, 1));
}
}
