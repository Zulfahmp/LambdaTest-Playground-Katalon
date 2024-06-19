
import internal.GlobalVariable;

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint;
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase;
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData;
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject;
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject;

import java.util.Random;

import com.kms.katalon.core.annotation.Keyword;
import com.kms.katalon.core.checkpoint.Checkpoint;
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords;
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords;
import com.kms.katalon.core.model.FailureHandling;
import com.kms.katalon.core.testcase.TestCase;
import com.kms.katalon.core.testdata.TestData;
import com.kms.katalon.core.testobject.TestObject;
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords;
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandom {
	
	public static String generateName(int Length) {
		return RandomStringUtils.randomAlphabetic(Length);
	}
	
	public static String generateEmail(int Length) {
		return RandomStringUtils.randomAlphabetic(Length);
	}
	
	public static String generatePhoneNumber(int Length) {
		Random random = new Random();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < Length; i++) {
        	sb.append(random.nextInt(10)); // Angka 0-9
        }
        
        return sb.toString();
	}
	
}