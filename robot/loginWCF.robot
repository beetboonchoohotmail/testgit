*** Settings ***
Library  SeleniumLibrary

*** Variables ***
${URL}   https://google.com
${BROWSERS}  Chrome
${USERNAME}    bo.suttawat
${PASSWORD}    xxxxx    

*** Keywords ***
Open The Best Website
    [Arguments]  ${url}  ${browsers}
    Open Browser  ${url}  ${browsers}
Add User Pass
    Input Text    id=username    ${username}
    Input Text    id=password    ${password}

*** Test Cases ***
TS_: เปิดหน้าเว็บ
        Open The Best Website    ${URL}    ${BROWSERS}
TS_: กรอกข้อมูล u/p
        Add User Pass    
          
        ##Maximize Browser Window