package com.myproject.practise;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\User\\eclipse-workspace\\Zoey\\src\\test\\java\\com\\myproject\\practise\\login.feature",glue="stepdefinition",dryRun=false,monochrome=true,publish=true)

public class Runner {

}
