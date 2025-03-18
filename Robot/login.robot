*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${URL}          www.google.co.th
${BROWSER}     Chrome
${Email}    test@gmail.com
${PASSWORD}    123@Provexitdyo

*** Keywords ***
Login To The System
    Go To  ${URL}
    Maximize Browser Window
    Input Text    xpath=//input[@placeholder='Email']  ${Email}
    Input Text    xpath=//input[@placeholder='Password']  ${PASSWORD}
    Sleep  2s
    Click Element    xpath=//label[@for='customCheckLogin']
    Click Element    xpath=//button[@class='my-4 btn btn-primary']
Click Check Login
   Scroll Element Into View    css=button.btn.btn-outline-secondary.btn.btn-primary
   Click Element    css=p.mr-2[style="color: green;"]
   Click Element    css=button.btn.btn-outline-secondary.btn.btn-primary
   Sleep  5s

*** Test Cases ***
01_User Can Login Successfully เข้าสู่ระบบ
    [Setup]  Open Browser  ${URL}  ${BROWSER}    options=add_experimental_option("detach",True)
    Login To The System
    
02_Scorr View Check True
    Click Check Login
    [Teardown]  Close Browser

