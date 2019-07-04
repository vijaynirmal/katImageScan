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
import com.kms.katalon.core.testobject.ConditionType


Mobile.startApplication('/Users/sjvijay/Downloads/Text Scanner_5.3.3.apk', true)

Mobile.tap(findTestObject('textScanner/android.widget.ImageButton0'), 0)

//Mobile.tap(findTestObject('textScanner/android.widget.TextView0 - Jio LTE1 48024Thursday July 4'), 0)

TestObject myNewObject = new TestObject("TextView")
myNewObject.addProperty("xpath", ConditionType.EQUALS, "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")

Mobile.delay(10)

def scannedText = Mobile.getText(myNewObject, 0)

println(scannedText)

Mobile.closeApplication()

