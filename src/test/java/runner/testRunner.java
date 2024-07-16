package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\BDD\\OMaven\\src\\test\\java\\feature", glue="stepDefination",
tags ="@negative",plugin={"pretty","json:D:\\BDD\\OMaven\\src\\test\\java\\reports\\index.json","junit:\\BDD\\OMaven\\src\\test\\java\\reports\\index.xml"})
public class testRunner {

}
