import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

/*
 * Start the application
 */
Mobile.startApplication('/Users/sjvijay/Downloads/Ace Scanner OCR Translator_v2.13.0_apkpure.com.apk', true)

Mobile.tap(findTestObject('aceScanner/android.view.View0 - '), 10)

Mobile.tap(findTestObject('aceScanner/android.widget.ImageView0 (1)'), 10)


Mobile.comment("Wait for 10 seconds the app to process the image")

Mobile.delay(10)

Mobile.comment("Extract the processed text")

String capturedText = Mobile.getText(findTestObject('aceScanner/android.widget.EditText0 - Bank Name1234 5678 9876 5432 (1)'), 10)

Mobile.comment(capturedText)

Mobile.comment("Extract the Bank name to a variable and remove spaces")
String bankName = capturedText.replaceAll("[^a-zA-Z]", "").trim()

Mobile.comment(bankName)

Mobile.verifyEqual(bankName, "BankName")

Mobile.comment("Extract the Account Number to a variable and remove spaces")
String accountNumber = capturedText.replaceAll("[^\\d.]", "").trim()

Mobile.comment(accountNumber)

Mobile.verifyEqual(accountNumber, "1234567898765432")


Mobile.closeApplication()

