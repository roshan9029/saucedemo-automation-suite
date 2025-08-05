# 🧪 SauceDemo Automation Suite

An end-to-end automation framework built for [SauceDemo](https://www.saucedemo.com) using **Java**, **Selenium WebDriver**, **TestNG**, and **ExtentReports**. This project demonstrates automation best practices with Page Object Model, retry mechanism, and detailed HTML reporting.

---

## 🚀 Tech Stack

| Tool / Framework | Purpose                          |
|------------------|----------------------------------|
| Java             | Programming language             |
| Selenium WebDriver | UI automation                  |
| TestNG           | Test orchestration and execution |
| Maven            | Dependency management            |
| ExtentReports    | HTML reporting                   |
| Git + GitHub     | Version control                  |

---

## ✅ Features

- Login, Add to Cart, Checkout flow automation
- Page Object Model (POM) design
- Retry mechanism for flaky test cases
- Extent HTML reports with step-by-step logging
- Clean test assertions and validations
- Easily extendable for future test cases

---

## 📂 Project Structure

```
SauceDemoAutomation/
├── src/
│   └── test/
│       ├── java/
│       │   ├── com.saucedemo.tests/           # Test classes
│       │   ├── com.saucedemo.pages/           # POM classes
│       │   └── com.saucedemo.utils/           # Utilities (DriverManager, ExtentManager, RetryAnalyzer)
│       └── resources/
│           └── locators.properties            # Page locators (optional)
├── pom.xml                                     # Maven dependencies
└── test-output/                                # ExtentReport.html will be generated here
```

---

## 🛠️ How to Run

### 1. Clone the repository
```bash
git clone https://github.com/roshan9029/saucedemo-automation-suite.git
cd saucedemo-automation-suite
```

### 2. Run tests using Maven
```bash
mvn clean test
```

### 3. View the test report
Open the generated report in your browser:

```
test-output/ExtentReport.html
```

---

## 📸 Sample Report Screenshot

> *Add a screenshot of your ExtentReport.html here once you run the tests and take a screenshot*

---

## ⚙️ Future Enhancements

- Add cross-browser support with WebDriverManager or Grid
- Integrate with CI tools like GitHub Actions or Jenkins
- Add API testing layer using RestAssured
- Integrate Allure Reports or Email Report Sharing

---

## 👨‍💻 Author

**Roshan Shaikh**  
[SDET | Automation Engineer | QA Enthusiast]

---

## 📎 License

This project is for educational and demonstration purposes.
