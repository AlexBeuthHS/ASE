# Rock Paper Scissor Console Game 

##  1.UML
The Diagrams have been created with [Gliffy](https://www.gliffy.com/) or exported from IntelliJ IDE, both use UML.

### 1.1 Use Case Diagram
![Use Case Diagram](https://github.com/AlexBeuthHS/ASE/blob/master/src/main/resources/UseCase.png)

### 1.2 Activity Diagram
![Use Case Diagram](https://github.com/AlexBeuthHS/ASE/blob/master/src/main/resources/activity.png)

### 1.3 Class Diagram
![Use Case Diagram](https://github.com/AlexBeuthHS/ASE/blob/master/src/main/resources/classDiagram.png)

### 1.4 Dependency Diagram
![Dependency Diagram](https://github.com/AlexBeuthHS/ASE/blob/master/src/main/resources/RPS.jpg)

## 2. Metrics
### SonarCloud:
I connected my GitHub project to SonarCloud. I also had to add sonar-project properties and configure my .travis.yml configuration file.
Click this [Link](https://sonarcloud.io/dashboard?id=ASE-RPS%3ARPS)
###Maven
As im using Maven for my project it has a built in Metrics that is compareable to JDEPEND. (Dependency Diagram) 

## 3. Clean Code
1. Unit Tests (kept readable and simple)
2. log4j logging instead of System.out.println()
3. meaningful names for variable and functions
4. Minimal dependencies 
5. No redundancy (f.e. constants for Strings)

## 4. Continuous Delivery
### Travis CI
I decided to use Travis CI because they offer a cloud solution. I connected my GitHub account to Travis Ci and created a .travis,yml with a basic configuration.
Click this [Link](https://travis-ci.org/AlexBeuthHS/ASE) to view my build history.

## 5. AOP
If i had any real logging i would set jointpoints before and after my startGame() method of the class RockPaperScissor to divide the cross-cutting concerns from my core concerns.

## 6. DSL
Under resources i added the file JenkinsfileContinuousDeployment.groovy  which is not related to this project. It is a groovy file for continuous delivery that i wrote for another project.
It deploys the application on sandbox and two production servers and also runs a basic smoke test.
