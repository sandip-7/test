import unittest
from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.chrome.service import Service
from page.LoginPage import login

class MyTestCase(unittest.TestCase):

    def setUp(self) -> None:
        self.driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
        self.driver.maximize_window()
        self.driver.get("https://demoblaze.com")

    def test_something(self):
        driver = self.driver
        lp = login(driver)
        lp.loginpage("testmorning","test123")



if __name__ == '__main__':
    unittest.main()
