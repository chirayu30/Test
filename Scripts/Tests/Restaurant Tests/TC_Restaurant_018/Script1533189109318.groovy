import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After

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

WebUI.click(findTestObject('Pages/Restaurant Page/btn_plus_restaurant'))

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_display_name'), 'Automation Test3')

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/textarea_description'), 'This is a test restaurant being added by automation script.')

WebUI.uploadFile(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_upload_image'), '/Users/apple/git/pbsl_digivalet_cms_tests/Images/Restaurant Image.jpg')

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/Crop Image/btn_zoom_in'), 5)

WebUI.click(findTestObject('Pages/Restaurant Page/Crop Image/btn_zoom_in'))

WebUI.click(findTestObject('Pages/Restaurant Page/Crop Image/btn_zoom_in'))

WebUI.click(findTestObject('Pages/Restaurant Page/Crop Image/btn_zoom_out'))

WebUI.click(findTestObject('Pages/Restaurant Page/Crop Image/btn_zoom_out'))

WebUI.delay(2)

WebUI.click(findTestObject('Pages/Restaurant Page/Crop Image/btn_crop_image_done'))

WebUI.delay(2)

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_next'))

WebUI.delay(2)

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/input_open_status'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/option_allTime'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/input_cuisine'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/option_north_indian'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/input_cuisine'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/option_all'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/input_cuisine'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/option_fast_food'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/input_meal_type'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/option_breakfast'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/btn_add_meal_type_time'))

WebUI.verifyElementVisible(findTestObject('Pages/Restaurant Page/Apply Filters/msg_error_meal_type_time'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/meal_type_start_time'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/pick_hours'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/hour_09'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/pick_minutes'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/minute_00'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/btn_AM_PM'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/meal_type_end_time'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/pick_hours'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/hour_11'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/pick_minutes'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/minute_00'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/btn_AM_PM'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/btn_add_meal_type_time'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/input_meal_type_2'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/option_lunch'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/meal_type_start_time_2'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/pick_hours'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/hour_09'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/pick_minutes'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/minute_00'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/btn_AM_PM'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/meal_type_end_time_2'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/pick_hours'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/hour_11'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/pick_minutes'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/minute_00'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/btn_AM_PM'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/btn_add_meal_type_time'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/input_meal_type_3'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/option_dinner'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/meal_type_start_time_3'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/pick_hours'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/hour_09'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/pick_minutes'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/minute_00'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/meal_type_end_time_3'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/pick_hours'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/hour_11'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/pick_minutes'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/minute_00'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/btn_save'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/msg_add_restaurant_success'), 30)

WebUI.click(findTestObject('Pages/Dashboard/a_Restaurants'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/res_cell_first'), 20)

WebUI.click(findTestObject('Pages/Restaurant Page/menu_3_dot_rest3'))

WebUI.click(findTestObject('Pages/Restaurant Page/Delete Restaurant/btn_delete_res3_3_dot_menu'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/Delete Restaurant/delete_res_confirmation_dialog'), 5)

WebUI.click(findTestObject('Pages/Restaurant Page/Delete Restaurant/Btn_yes_delete_res'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/Delete Restaurant/msg_delete_restaurant_success'), 15, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()





