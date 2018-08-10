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

WebUI.click(findTestObject('Pages/Restaurant Page/test3_restaurant_cell'))

WebUI.waitForElementHasAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/input_edit_display_name'), 'value', 
    10)

WebUI.uploadFile(findTestObject('Pages/Restaurant Page/Edit Restaurant/btn_edit_upload_image'), '/Users/apple/git/pbsl_digivalet_cms_tests/Images/Restaurant Image.jpg')

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/Crop Image/btn_zoom_in'), 10)

WebUI.click(findTestObject('Pages/Restaurant Page/Edit Restaurant/btn_zoom_in'))

WebUI.click(findTestObject('Pages/Restaurant Page/Edit Restaurant/btn_zoom_in'))

WebUI.click(findTestObject('Pages/Restaurant Page/Edit Restaurant/btn_zoom_out'))

WebUI.click(findTestObject('Pages/Restaurant Page/Edit Restaurant/btn_zoom_out'))

WebUI.delay(2)

WebUI.click(findTestObject('Pages/Restaurant Page/Edit Restaurant/btn_crop_image_done'))

WebUI.waitForElementClickable(findTestObject('Pages/Restaurant Page/Edit Restaurant/btn_next_step1'), 10)

WebUI.click(findTestObject('Pages/Restaurant Page/Edit Restaurant/btn_next_step1'))

WebUI.delay(2)

WebUI.click(findTestObject('Pages/Restaurant Page/Edit Restaurant/btn_save_step2'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Edit Restaurant/msg_update_restaurant_success'), 5)

WebUI.click(findTestObject('Pages/Dashboard/a_Restaurants'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/res_cell_first'), 20)

WebUI.click(findTestObject('Pages/Restaurant Page/menu_3_dot_rest3'))

WebUI.click(findTestObject('Pages/Restaurant Page/Delete Restaurant/btn_delete_res3_3_dot_menu'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/Delete Restaurant/delete_res_confirmation_dialog'), 5)

WebUI.click(findTestObject('Pages/Restaurant Page/Delete Restaurant/Btn_yes_delete_res'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/Delete Restaurant/msg_delete_restaurant_success'), 15,
	FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

