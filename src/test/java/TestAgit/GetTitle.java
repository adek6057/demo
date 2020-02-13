package TestAgit;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Agit.Agithub.GitBase;

public class GetTitle extends GitBase{
	
	@Test
	
	public void pageTitle() throws IOException{
		GitBase.main(null);
		String page = driver.getTitle();
		Assert.assertTrue(false, "page");
	}

}
