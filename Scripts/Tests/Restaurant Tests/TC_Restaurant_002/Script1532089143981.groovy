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

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/res_cell_first'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pages/Restaurant Page/btn_plus_restaurant'))

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Edit Restaurant/input_edit_display_name'), 3)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Add Restaurant/textarea_description'), 3)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_upload_image'), 3)

WebUI.uploadFile(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_upload_image'), '/Users/apple/git/pbsl_digivalet_cms_tests/Images/Restaurant Image.jpg')

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/Crop Image/btn_zoom_in'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pages/Restaurant Page/Crop Image/btn_zoom_in'))

WebUI.click(findTestObject('Pages/Restaurant Page/Crop Image/btn_zoom_out'))

WebUI.delay(2)

WebUI.click(findTestObject('Pages/Restaurant Page/Crop Image/btn_crop_image_done'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/Add Restaurant/heading_add_restaurant'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Add Restaurant/text_restaurant_allowed'), 3)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Add Restaurant/text_opening_hours'), 3)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Add Restaurant/text_smoking'), 3)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Add Restaurant/input_restaurant_location'), 3)

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/dropdown_add_menu_default'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Add Restaurant/value_add_menu'), 3)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Add Restaurant/value_add_dress_code'), 3)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Add Restaurant/value_add_URL'), 3)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Add Restaurant/value_add_video'), 3)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Add Restaurant/value_add_custom'), 3)

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_next'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Apply Filters/input_open_status'), 3)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Apply Filters/input_cuisine'), 3)

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/Apply Filters/input_cuisine'), 3)

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/btn_dismiss_modal_step2'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

