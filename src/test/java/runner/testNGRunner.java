package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="D:\\BDD\\OMaven\\src\\test\\java\\feature", glue="stepDefination",
tags ="@positive",plugin={"pretty","json:D:\\BDD\\OMaven\\src\\test\\java\\reports\\index.json","junit:\\BDD\\OMaven\\src\\test\\java\\reports\\index.xml"})
public class testNGRunner extends AbstractTestNGCucumberTests
{
	

}
