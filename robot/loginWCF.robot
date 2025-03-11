*** Settings ***
Library  SeleniumLibrary

*** Variables ***
${URL}   http://172.16.19.59:9080/wcf
${BROWSERS}  Chrome
${USERNAME}    bo.suttawat
${PASSWORD}    xxxxx    

*** Keywords ***
Open The Best Website
    [Arguments]  ${url}  ${browsers}
    Open Browser  ${url}  ${browsers}

*** Test Cases ***
TS_: เปิดหน้าเว็บ
        Open The Best Website    ${URL}    ${BROWSERS}
TS_: กรอกข้อมูล
        Add User Pass
            Input Text    id=username    ${USERNAME}
            Input Text    id=password    ${PASSWORD}
        ##Maximize Browser Window