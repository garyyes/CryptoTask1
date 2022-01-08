xcopy /y /e /k allure-report\html\history\*.* allure-results\history\
libs/allure-2.17.2/bin/allure generate allure-results/ -o allure-report/html --clean
libs/allure-2.17.2/bin/allure open allure-report/html