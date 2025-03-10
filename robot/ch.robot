*** Settings ***
Library  SeleniumLibrary


*** Variables ***
${URL}   https://www.kbtg.tech/
${BROSER}  Chrome

*** Keywords ***
Open The Best Website
    [Arguments]  ${url}  ${browser}
    Open Browser  ${url}  ${browser}

*** Test Cases ***
TS_: เปิดหน้าเว็บ
    Open The Best Website  ${URL}  ${BROSER}
    Maximize Browser Window