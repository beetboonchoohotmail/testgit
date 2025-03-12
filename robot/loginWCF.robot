*** Settings ***
Library  SeleniumLibrary

*** Variables ***
${URL}   https://google.com
${BROWSERS}  Chrome
#${USERNAME}    bo.suttawat
#${PASSWORD}    xxxxx    

*** Keywords ***
Open The Best Website
    [Arguments]  ${url}  ${browsers}
    Open Browser  ${url}  ${browsers}    options= add_experimental_option("detach",True)

*** Test Cases ***
TS_: เปิดหน้าเว็บ
        Open The Best Website    ${URL}    ${BROWSERS}  