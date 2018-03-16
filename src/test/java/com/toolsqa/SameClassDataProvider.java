package com.toolsqa;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SameClassDataProvider {

	@DataProvider(name = "data-provider1")
    public Object[][] dataProviderMethod() {
        return new Object[][] { 
        	{ "username1","Password1"}, 
        	{ "username2","Password2"},
        	{"username3","Password3"} 
        	};
    }
 
    @Test(dataProvider = "data-provider1")
    public void testMethod(String userName,String Password) {
        System.out.println("UserName: " + userName+" , Password"+ Password);
    }
}
