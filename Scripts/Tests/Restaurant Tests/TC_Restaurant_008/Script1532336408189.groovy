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

WebUI.callTestCase(findTestCase('Tests/Log In Tests/TC001_Log in_valid_user'), [:])

WebUI.click(findTestObject('Pages/Dashboard/a_Restaurants'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/res_cell_first'), 20)

WebUI.click(findTestObject('Pages/Restaurant Page/btn_plus_restaurant'))

WebUI.uploadFile(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_upload_image'), 'C:\\Users\\Arpit Jain\\Katalon Studio\\DigiValet_CMS_Tests\\Images\\Restaurant Image.jpg')

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/Crop Image/btn_zoom_in'), 5)

WebUI.click(findTestObject('Pages/Restaurant Page/Crop Image/btn_zoom_in'))

WebUI.click(findTestObject('Pages/Restaurant Page/Crop Image/btn_zoom_out'))

WebUI.click(findTestObject('Pages/Restaurant Page/Crop Image/btn_crop_image_done'))

WebUI.verifyElementText(findTestObject('Pages/Restaurant Page/Add Restaurant/text_displayname_step1'), 'Display Name')

WebUI.verifyElementText(findTestObject('Pages/Restaurant Page/Add Restaurant/text_description_step1'), 'Description')

WebUI.verifyElementText(findTestObject('Pages/Restaurant Page/Add Restaurant/text_image_step1'), 'Image*')

WebUI.verifyElementText(findTestObject('Pages/Restaurant Page/Add Restaurant/text_reservation_allowed_step1'), 'Reservation Allowed')

WebUI.verifyElementText(findTestObject('Pages/Restaurant Page/Add Restaurant/text_opening_hours'), 'Opening hours')

WebUI.verifyElementText(findTestObject('Pages/Restaurant Page/Add Restaurant/text_smoking'), 'Smoking')

WebUI.verifyElementText(findTestObject('Pages/Restaurant Page/Add Restaurant/text_location_step1'), 'Location')

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/dropdown_add_menu_default'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Add Restaurant/value_add_menu'), 3)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Add Restaurant/value_add_dress_code'), 3)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Add Restaurant/value_add_URL'), 3)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Add Restaurant/value_add_video'), 3)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Add Restaurant/value_add_custom'), 3)

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_next'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Pages/Restaurant Page/Add Restaurant/text_open_status_step2'), 'Open status')

WebUI.verifyElementText(findTestObject('Pages/Restaurant Page/Add Restaurant/text_cuisine_step2'), 'Cuisine')

WebUI.verifyElementText(findTestObject('Pages/Restaurant Page/Add Restaurant/text_meal_type_step2'), 'Meal Type')

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/btn_dismiss_modal_step2'))

