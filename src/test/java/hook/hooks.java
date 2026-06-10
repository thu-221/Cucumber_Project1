package hook;

import base.baseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends baseTest{
	
	@Before
	public void start()
	{
		setup();
	}
	
	@After
	public void end()
	{
		tearDown();
	}

}
