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

WebUI.uploadFile(findTestObject('Pages/Restaurant Page/Add Restaurant/upload_file_add_menu'), '/Users/apple/git/pbsl_digivalet_cms_tests/Resources/Res_menu_PDF.pdf')

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

WebUI.uploadFile(findTestObject('Pages/Restaurant Page/Add Restaurant/upload_file_add_video'), '/Users/apple/git/pbsl_digivalet_cms_tests/Resources/Res_video.flv')

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

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/input_open_status'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/option_Morning'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/input_open_status'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/option_after_noon'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/input_cuisine'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/option_north_indian'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/input_cuisine'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/option_all'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/input_cuisine'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/option_italian'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/input_meal_type'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/option_breakfast'))

WebUI.click(findTestObject('Pages/Restaurant Page/Apply Filters/input_meal_type_enter'))

WebUI.verifyElementVisible(findTestObject('Pages/Restaurant Page/Apply Filters/message_error_only_select_1'), FailureHandling.STOP_ON_FAILURE)

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

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/res_cell_first'), 20)

WebUI.click(findTestObject('Pages/Restaurant Page/test1_restaurant_cell'))

WebUI.waitForElementVisible(findTestObject('Pages/Restaurant Page/Edit Restaurant/input_edit_display_name'), 10)

def resName = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/input_edit_display_name'), 'value')

WebUI.verifyEqual(resName, 'Automation Test3', FailureHandling.STOP_ON_FAILURE)

def resDesc = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_desc_box'), 'value')

WebUI.verifyEqual(resDesc, 'This is a test restaurant being added by automation script.', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementChecked(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_reservation_allowed_no'), 5)

WebUI.verifyElementChecked(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_set-available_time'), 5)

def startTime = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_openinghour_start_time'), 
    'value')

def endTime = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_openinghour_end_time'), 'value')

WebUI.verifyEqual(startTime, '9:00 AM', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(endTime, '11:00 PM', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementChecked(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit-smoking_checkbox_yes'), 5)

def resLocation = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_location'), 'value')

WebUI.verifyEqual(resLocation, 'Top Floor', FailureHandling.STOP_ON_FAILURE)

def resDetailsTitle1 = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_res_details_title1'), 
    'value')

def resDetailsValue1 = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_res-details_value1'), 
    'value')

WebUI.verifyEqual(resDetailsTitle1, 'Menu', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(resDetailsValue1, 'Menu', FailureHandling.STOP_ON_FAILURE)

def resDetailsTitle2 = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_res_details_title2'), 
    'value')

def resDetailsValue2 = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_res-details_value2'), 
    'value')

WebUI.verifyEqual(resDetailsTitle2, 'Dress Code', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(resDetailsValue2, 'Western Attire', FailureHandling.STOP_ON_FAILURE)

def resDetailsTitle3 = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_res_details_title3'), 
    'value')

def resDetailsValue3 = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_res-details_value3'), 
    'value')

WebUI.verifyEqual(resDetailsTitle3, 'Restaurant Video', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(resDetailsValue3, 'Restaurant Introduction', FailureHandling.STOP_ON_FAILURE)

def resDetailsTitle4 = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_res_details_title4'), 
    'value')

def resDetailsValue4 = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_res-details_value4'), 
    'value')

def resDetailsUrl = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_url'), 'value')

WebUI.verifyEqual(resDetailsTitle4, 'Order Online', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(resDetailsValue4, 'Order Portal', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(resDetailsUrl, 'https://test.com', FailureHandling.STOP_ON_FAILURE)

def resDetailsTitle5 = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_res_details_title5'), 
    'value')

def resDetailsValue5 = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_res-details_value5'), 
    'value')

WebUI.verifyEqual(resDetailsTitle5, 'Custom Title', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(resDetailsValue5, 'Custom Value', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pages/Restaurant Page/Edit Restaurant/btn_next_step1'))

def resFiltersOpenStatus = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_filters_openstatus'), 
    'title')

WebUI.verifyEqual(resFiltersOpenStatus, 'All Time', FailureHandling.STOP_ON_FAILURE)

def resFiltersCuisine = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_filters_cuisine'), 
    'title')

WebUI.verifyEqual(resFiltersCuisine, 'All', FailureHandling.STOP_ON_FAILURE)

def resFiltersMealType = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_filters_meal_type'), 
    'title')

WebUI.verifyEqual(resFiltersMealType, 'Breakfast', FailureHandling.STOP_ON_FAILURE)

def mealTypeStartTime = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_res_filters_meal_type_start_time'), 
    'value')

def mealTypeEndTime = WebUI.getAttribute(findTestObject('Pages/Restaurant Page/Edit Restaurant/edit_res_filters_meal_type_end_time'), 
    'value')

WebUI.verifyEqual(mealTypeStartTime, '9:00 AM', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(mealTypeEndTime, '11:00 AM', FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

