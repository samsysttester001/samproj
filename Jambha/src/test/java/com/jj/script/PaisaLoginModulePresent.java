package com.jj.script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.jj.help.SupportScript;
import com.jj.page.Login;

public class PaisaLoginModulePresent extends SupportScript
{
	@Test(priority=2)
	public void testPaisaLoginButtonPresent()
	{
		Login lg = new Login();
		
		try
		{
			Assert.assertTrue(lg.checkLoginButtonIsPresent());
			Reporter.log("PaisaLoginModulePresent is pass",true);
		}
		catch(Exception e)
		{
			
		}
	}
}
