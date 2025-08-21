# Number Guessing Game (Java Console)

A simple console-based **Number Guessing Game** written in Java.  
The player selects a difficulty level and tries to guess the correct number within 5 attempts.

---

## 🎯 Game Rules
- **Easy**: Guess a number between **1 and 50**  
- **Medium**: Guess a number between **1 and 100**  
- **Hard**: Guess a number between **1 and 500**  

👉 You have **5 attempts** to guess the correct number.  
👉 After each guess, the game will tell you if your number is **higher** or **lower** than the target.  

---

## 🚀 How to Run

1. Clone this repository:
   git clone https://github.com/your-username/NumberGuessingGame.git
   cd NumberGuessingGame

2. Compile the java file
   javac src/NumberGuessingGame.java

3. Run the program
   java -cp src NumberGuessingGame


## Example Gameplay

    Welcome to the Number Guessing Game 

    Game Rules:
    ---------------------------------------
    Easy   : Guess a number between 1-50
    Medium : Guess a number between 1-100
    Hard   : Guess a number between 1-500

    You have 5 attempts to guess the correct number.
    Feedback will guide you whether your guess is higher or lower.

    Choose Difficulty: 1. Easy  2. Medium  3. Hard: 2

    You chose Medium mode!

    You need to guess a number between 1 and 100.

    Enter the Number: 45
    The guessed number is lower than the actual number!


## Technologies Used
1. Java
2. Console I/O
3. Random number generation
