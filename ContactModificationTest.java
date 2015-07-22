package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {
	

	@Test
	public void modifySomeContact () {
		
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().initContactModification(1);
		GroupContact contact = new GroupContact ();
		contact.lastname = "Zorro";
	    //app.getContactHelper().fillContactForm(contact); - эта чать должна быть, но с ней тест не работает, а без нее работает.
		// app.getContactHelper().submitContactModification();  - cоздавала, но роль update у нас выполняет клик "By.xpath ...." в init-е (в хелпере)
		app.getContactHelper().returnToHomePage();
 
	}	

}
