// Copyright 2015 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
 
@TestOn('vm')
library webdriver.web_element_test;
 
import 'dart:io';


import 'package:test/test.dart';
import 'package:webdriver/async_core.dart';

import 'configs/async_io_config.dart' as config;
 
void main() {
group('WebElement', () {
late WebDriver driver;
late WebElement button;
late WebElement textUserInput;
late WebElement textPwdInput;
late WebElement loginButton;
late WebElement rfqLink;
late WebElement createrfqButton;
late WebElement  selectProductCateDD;
 late WebElement  selectProductEBDD;
late WebElement selectProducttypeDD;

setUp(() async {
driver = await config.createTestDriver();
await config.createTestServerAndGoToTestPage(driver);
});
 
test('click', () async {
print('Start sleeping');
sleep(const Duration(seconds: 10));
//enable accessibility
await driver.execute(
"document.querySelector('flt-glass-pane').shadowRoot.querySelector('flt-semantics-placeholder').click({force: true});",
['text']);
//login button - home page
button = await driver.findElement(
const By.cssSelector("flt-semantics[aria-label='LOGIN']"));
expect(await button.displayed, isTrue);
await button.click();
sleep(const Duration(seconds: 3));
//User input
textUserInput = await driver
.findElement(const By.cssSelector("input[aria-label='Enter Email Id']"));
expect(await textUserInput.displayed, isTrue);
await textUserInput.sendKeys('admin@ojas-it.com');
//Password input
 
textPwdInput = await driver.findElement(
const By.cssSelector("input[aria-label='Enter Password']"));
expect(await textPwdInput.displayed, isTrue);
await driver.mouse.moveTo(element: textPwdInput);
await driver.mouse.doubleClick();
await textPwdInput.sendKeys('Admin@123');
sleep(const Duration(seconds: 3));
 
//login button - credentials
loginButton = await driver.findElement(
const By.cssSelector("flt-semantics[aria-label='Login']"));
expect(await loginButton.displayed, isTrue);
await loginButton.click();
sleep(const Duration(seconds: 5));

//Maximize window
//ui.window.size = ui.window.physicalSize / ui.window.devicePixelRatio;
//ui.window.windowMode = ui.windowMode.maximized;

//RFQ link - landing page
rfqLink = await driver
.findElement(const By.cssSelector("flt-semantics[aria-label='RFQ']"));

expect(await rfqLink.displayed, isTrue);
await rfqLink.click();
//Create Rfq - RFQ page
createrfqButton = await driver.findElement(
const By.cssSelector("flt-semantics[aria-label='RFQ']"));
//Verify Create RFQ button
expect(await createrfqButton.displayed, isTrue);
sleep(const Duration(seconds: 5));
//Click Create RFQ button
await createrfqButton.click();



//Select ProductCategory DD
selectProductCateDD = await driver.findElement(
const By.cssSelector("flt-semantics[aria-label='------Select Product Category------']"));
sleep(const Duration(seconds: 5));

//Verify Create RFQ button
expect(await selectProductCateDD.displayed, isTrue);
await selectProductCateDD.click();
sleep(const Duration(seconds: 3));
selectProductEBDD = await driver.findElement(
const By.cssSelector("flt-semantics[aria-label='EB']"));

 //Verify Create RFQ button
 expect(await selectProductEBDD.displayed, isTrue);
 //await selectProductCateDD.click();
await driver.mouse.moveTo(element: selectProductEBDD);
await driver.mouse.doubleClick();
sleep(const Duration(seconds: 5));
//Select ProductType DD
selectProducttypeDD = await driver.findElement(
const By.cssSelector('flt-semantics[aria-label="----Select Product type-----"]'));
sleep(const Duration(seconds: 5));

//Verify ProductType DD
 expect(await selectProducttypeDD.displayed, isTrue);
 await selectProductCateDD.click();


});
}, timeout: const Timeout(Duration(minutes: 2)));

}