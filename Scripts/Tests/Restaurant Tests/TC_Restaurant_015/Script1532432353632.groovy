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

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/div_total_res_cells'), 10)

WebUI.click(findTestObject('Pages/Restaurant Page/btn_plus_restaurant'))

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_display_name'), 'Automation Test3')

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/textarea_description'), 'This is a test restaurant being added by automation script.')

WebUI.uploadFile(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_upload_image'), 'C:\\Users\\Arpit Jain\\Katalon Studio\\DigiValet_CMS_Tests\\Images\\Restaurant Image.jpg')

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/Crop Image/btn_zoom_in'), 5)

WebUI.click(findTestObject('Pages/Restaurant Page/Crop Image/btn_zoom_in'))

WebUI.click(findTestObject('Pages/Restaurant Page/Crop Image/btn_zoom_in'))

WebUI.click(findTestObject('Pages/Restaurant Page/Crop Image/btn_zoom_out'))

WebUI.click(findTestObject('Pages/Restaurant Page/Crop Image/btn_zoom_out'))

WebUI.click(findTestObject('Pages/Restaurant Page/Crop Image/btn_crop_image_done'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/Add Restaurant/heading_add_restaurant'), 5)

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/radio_reservation_allowed_no'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/radio_openinghours_settime'))

WebUI.verifyElementVisible(findTestObject('Pages/Restaurant Page/Add Restaurant/Text_from-to_settime'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/opening_hours_start_time'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/pick_hours'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/hour_09'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/pick_minutes'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/minute_00'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/btn_AM_PM'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/opening_hours_end_time'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/pick_hours'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/hour_11'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/pick_minutes'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/minute_00'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/checkbox_smoking_yes'))

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_restaurant_location'), 'Top Floor')

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_title_default'), 'Menu')

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_value_default'), 'Menu')

WebUI.uploadFile(findTestObject('Pages/Restaurant Page/Add Restaurant/upload_file_add_menu'), 'C:\\Users\\Arpit Jain\\Katalon Studio\\DigiValet_CMS_Tests\\Resources\\Res_menu_PDF.pdf')

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_add_restaurant_detail'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/dropdown_add_menu1'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/value_add_dress_code'))

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_res_details_title1'), 'Dress Code')

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_res_details_value1'), 'Western Attire')

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_add_restaurant_detail'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/dropdown_add_menu2'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/value_add_video'))

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_res_details_title2'), 'Restaurant Video')

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_res_details_value2'), 'Restaurant Introduction')

WebUI.uploadFile(findTestObject('Pages/Restaurant Page/Add Restaurant/upload_file_add_video'), 'C:\\Users\\Arpit Jain\\Katalon Studio\\DigiValet_CMS_Tests\\Resources\\Res_video.flv')

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_add_restaurant_detail'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/dropdown_add_menu3'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/value_res_detail_add_URL'))

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_res_details_title3'), 'Order Online')

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_res_details_value3'), 'Order Portal')

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_add_URL'), 'https://test.com')

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_add_restaurant_detail'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/dropdown_add_menu4'))

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/value_add_custom'))

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_res_details_title4'), 'Custom Title')

WebUI.setText(findTestObject('Pages/Restaurant Page/Add Restaurant/input_text_res_details_value4'), 'Custom Value')

WebUI.click(findTestObject('Pages/Restaurant Page/Add Restaurant/btn_next'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/Apply Filters/heading_apply_filters'), 5)

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/Apply Filters/div_filters'), 10)

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/input_open_status'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/option_allTime'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/input_cuisine'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/option_all'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/input_meal_type'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/option_breakfast'))

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

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/btn_save'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/msg_add_restaurant_success'), 10)

WebUI.click(findTestObject('Pages/Dashboard/a_Restaurants'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/div_total_res_cells'), 20)

