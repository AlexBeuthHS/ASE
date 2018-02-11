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
### Maven
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
## 7. and 9.
### As i could not cover the functional programming part completely (but i tried some functional programming aspects with lambdas in my Java version) i decided to rewrite my console game as well in clojure which should cover both tasks (7. and 9.).
### The file can be found under resources.

### Brief explaination:

The first function "getPlayersHand" takes no arguments and returns "r" for rock, "p" for paper and "s" for scissors
It iss a get function with a map of each of the valued Strings as keys. Each is associated with the value true. When the String of "hand" is looked up in this map, and the users entered String is not one of these Strings, it will return nil. That is because that key is not found in the map
Which means it returns nil for invalid input.
It contains a let form that binds the value of readline to "hand".
In this case readline is a standard libary function that takes the console input and blocks the program.
In the let body  there is an if with the condition wether or not the "hand" is one of the three strings.
If the condition of the if is true the let form will return "hand" and also the function will return "hand", otherwise both return nil.

The computeWinner function takes the "hand" from the two players and returns 1 when the first player wins and two for the second, and 0 if it is a tie (both players same hand)
The guesses are passed to the function in a form of a string of a lowercase character r, p or s.
The first this the function computeWinner does is a let form binding to the symbol playerVsComputer ( a vector of both, "Hand" one and "hand" two)
In the body of the let form there is a "cond" form, a condition form.
The first condition checks if both guesses are equal, if so returns 0 and other conditions depend on what guess beats the other.

The function startGame starts with a let form in which it binds to computersHand the result of "rand-nth" with the argument of a vector with the strings r, p , s.
The "rand-nth" function returns a random argument from its argument sequence.
The return value of getPlayersHand is bound to playersHand and will ask the user to enter "r" "p" or "s".
The winner is bound to the result of a call to the function computeWinner.
Finally the computers and players hand are printed.
It follows a conditional form that computes the winner and prints it.

The "startgame" function is put in a loop, that its possible to play again.
