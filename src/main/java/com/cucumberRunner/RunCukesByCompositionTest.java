
package com.cucumberRunner;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class RunCukesByCompositionTest extends RunCukes{
	
    @Test
    public void run_cukes (ITestContext istx) throws Throwable  {
		super.RunningOfCukes(OptionsSpecification(istx));
	}
	public String[] OptionsSpecification(ITestContext istx)
	{
		String[] Options_Runtime = new String[7];
//		Options_Runtime[0] = "src/test/java/org/features/"+istx.getCurrentXmlTest().getParameter("FeatureName");
		Options_Runtime[0] = "src/test/java/com/features";
		Options_Runtime[1] = "--glue";
		Options_Runtime[2] = "com/stepDefs";
		Options_Runtime[3] = "--glue";
		Options_Runtime[4] = "src/main/java/com/cucumberRunner";
		Options_Runtime[5] = "--tags";
		Options_Runtime[6] = istx.getCurrentXmlTest().getParameter("Tags"); //@Ignore,@smoke
		return Options_Runtime;
	}
}
