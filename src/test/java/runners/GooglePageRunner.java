package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src\\test\\resources\\features\\GooglePageTest.feature",
		glue= {"stepDefs"},
		monochrome=true,
		//dryRun=true,
		plugin={"pretty", 
//				"usage:target/reports/usageReport",
				"usage:target/reports/HtmlReport.html",
//				"usage:target/reports/testNGReport.xml",
//				"usage:target/reports/JSONReport.json",
				//"rerun:target/reports/failedScenarios.txt"
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				
		}
		
		)
public class GooglePageRunner extends AbstractTestNGCucumberTests{

	
	
}