import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Tests/Log In Tests/TC001_Log in_valid_user'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pages/Dashboard/a_Restaurants'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/res_cell_first'), 20)

def res_name9 = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/res_cell_9'), 'data-catname')

def res_name4 = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/res_cell_4'), 'data-catname')

WebUI.dragAndDropToObject(findTestObject('Pages/Restaurant Page/res_cell_9'), findTestObject('Pages/Restaurant Page/res_cell_1'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/msg_res_rearranged_success'), 30)

WebUI.dragAndDropToObject(findTestObject('Pages/Restaurant Page/res_cell_4'), findTestObject('Pages/Restaurant Page/res_cell_2'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/msg_res_rearranged_success'), 30)

WebUI.click(findTestObject('Pages/Dashboard/a_Restaurants'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/res_cell_first'), 20)

def res_name1 = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/res_cell_1'), 'data-catname')

def res_name2 = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/res_cell_2'), 'data-catname')

WebUI.verifyEqual(res_name9, res_name1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(res_name9, res_name1, FailureHandling.STOP_ON_FAILURE)

