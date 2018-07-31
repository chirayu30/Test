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

WebUI.click(findTestObject('Pages/Restaurant Page/btn_plus_restaurant'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_add_restaurant_detail'))

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/msg_error_title_value_empty'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('Pages/Restaurant Page/msg_error_title_value_empty'), 7)

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_title_default'), 'Menu')

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_add_restaurant_detail'))

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/msg_error_title_value_empty'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('Pages/Restaurant Page/msg_error_title_value_empty'), 7)

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_value_default'), 'Menu')

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_add_restaurant_detail'))

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/msg_error_title_value_empty'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('Pages/Restaurant Page/msg_error_title_value_empty'), 7)

WebUI.uploadFile(findTestObject('Pages/Restaurant Page/Add Restaurant/upload_file_add_menu'), '/Users/apple/git/pbsl_digivalet_cms_tests/Resources/Res_menu_PDF.pdf')

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_add_restaurant_detail'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/dropdown_add_menu1'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/value_add_dress_code'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_add_restaurant_detail'))

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/msg_error_title_value_empty'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('Pages/Restaurant Page/msg_error_title_value_empty'), 7)

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_res_details_title1'), 'Dress Code')

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_res_details_value1'), 'Western Attire')

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_add_restaurant_detail'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/dropdown_add_menu2'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/value_add_video'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_add_restaurant_detail'))

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/msg_error_title_value_empty'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('Pages/Restaurant Page/msg_error_title_value_empty'), 7)

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_res_details_title2'), 'Restaurant Video')

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_res_details_value2'), 'Restaurant Introduction')

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_add_restaurant_detail'))

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/msg_error_title_value_empty'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('Pages/Restaurant Page/msg_error_title_value_empty'), 7)

WebUI.uploadFile(findTestObject('Pages/Restaurant Page/Add Restaurant/upload_file_add_video'), '/Users/apple/git/pbsl_digivalet_cms_tests/Resources/Res_video.flv')

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_add_restaurant_detail'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/dropdown_add_menu3'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/value_res_detail_add_URL'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_add_restaurant_detail'))

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/msg_error_title_value_empty'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('Pages/Restaurant Page/msg_error_title_value_empty'), 7)

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_res_details_title3'), 'Order Online')

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_res_details_value3'), 'Order Portal')

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_add_restaurant_detail'))

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_add_URL'), 'https://test.com')

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_add_restaurant_detail'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/dropdown_add_menu4'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/value_add_custom'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_add_restaurant_detail'))

WebUI.verifyElementPresent(findTestObject('Pages/Restaurant Page/msg_error_title_value_empty'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

