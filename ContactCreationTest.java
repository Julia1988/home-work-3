package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {
	
  @Test
  public void testNonEmptyContactCreation() throws Exception {    
    GroupContact contact = new GroupContact();
    	contact.firstname = "FName";
		contact.lastname = "LName";
		contact.address = "Address";
		contact.home = "Home";
		contact.mobile = "Mobile";
		contact.work = "Work";
		contact.email1 = "E-mail:";
		contact.email2 = "E-mail:";
		contact.day = "1";
		contact.month = "January";
		contact.year = "2015";
		contact.secondaryaddress = "Secondary Address";
		contact.secondaryhome = "Secondary Home";
		
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().gotoContactPage();
		app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(contact);    
        app.getContactHelper().submitContactCreation();    
        app.getContactHelper().returnToHomePage();
  }     

  @Test
  public void testEmptyContactCreation() throws Exception {
	  
	app.getNavigationHelper().openMainPage();
	app.getNavigationHelper().gotoContactPage();
	app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new GroupContact("", "", "", "", "", "", "", "", "-", "-", "", "", ""));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }
}
