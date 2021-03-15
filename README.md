# Web-automation-demoqa

## 1. Requirements
### 1.1 Mandatory
1. Java 8
2. maven
3. Google Chrome - Web browser

### 1.2. Optional/Nice to have/Your choice
* IntelliJ IDEA
* Visual Studio Code + Terminal (bash, etc..)
* Any source-code editor of your choice that you feel comfortable with writing Java.

## 3. How to execute
### 3.1. On macOS/Linux:
1. cd into: `web-automation-demoqa`
2. run: `mvn clean verify`
### 3.2. IntelliJ
1.  Open `web-automation-demoqa` as maven project
2.  Set Java 8 for project:
  1. File -> Project structure
      * Platform settings -> Make sure you have Java - 1.8/8
      * Project settings -> Project:
        * Project SDK: 1.8
        * Project language level: 1.8/8

3.  Install plugins - Preferences -> Plugins: `Cucumber for Java`, `Gherkin`
4.  Add configuration - Command line: `clean verify`
### 3.3. The execution should result in `https://demoqa.com/` being opened in a new Google Chrome Web browser and scenario failing due to:
```
[ERROR] Failures: 
[ERROR]   On page: TextBoxPage, the given element is undefined: EMAIL_FIELD
```
## 4. FYI
* Add `@run` tag to scenarios you want to run.<br>
* Add `@exclude` tag to scenarios you want to exclude.<br>
