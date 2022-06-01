/* This is a calculator 
Functionality: Addition/Subtraction, Multiplication/Division
Author: Caitin Connerly
Languages: JavaScript, HTML, CSS
Date of Creation: 05/18/2022
Date of Last Iteration: --
Change Log: --
*/


//This function sums two numbers and prints the result 
function sum(x, y) {
    return (x+y);
}

//This function subratcs two numbers and prints the result
function difference(x, y) {
    return (x-y);
}

//This function multiplies two numbers and prints the result
function product(x, y) {
    return (x*y);
}

//This function divides two numbers and prints the result
function quotient(x, y) {
    //set case to provide error message if try to divide by zero
    if (y === 0) {
        return 'Error, you cannot divide by zero unless you want to be thrown into a pit of INFINITE misery';
    } else {
        return (x/y);    
    }
}

// Initialize operators as string variables
let firstOperator = '';
let secondOperator = '';

function operate(operator, x, y) {
    //Switch case for operators
    switch (operator) {
        case '+':
            return sum(x, y);  
        case '-':
            return difference(x, y);  
        case '*':
            return product(x, y);
        case '/':
            return quotient(x, y);
    }
}

/*//Test Cases, comment once validated
//Test Basic Functions
operate('+', 7, 2); //expected 9
operate('-', 7, 2); //expected 5
operate('*', 7, 2); //expected 14
operate('/', 7, 2); //expected 3.5
//Test case of divide by zero infinity warning
operate('/', 7, 0); //expected snarky error message
//Test case of stupid input 
operate('*', a, b); //error
operate('*', 'a', 'b'); //returns NaN
*/

//Define vars for inputs and actions

const numInput = document.querySelectorAll('.nums');
const operatorSelection = document.querySelectorAll('.operators');
const giveResult = document.getElementById('equals');
const clrScrn = document.getElementById('clear');
const currentDisplay = document.getElementById('current-display');
const previousDisplay = document.getElementById('prev-display');

//Add event listeners

window.addEventListener('keydown', handleKeyboardInput);

clrScrn.addEventListener('click', clearScreen);
giveResult.addEventListener('click', displayResult);

//Activate number and operator buttons
numInput.forEach((button) => 
    button.addEventListener('click', () => displaySelection(button.textContent))
)
operatorSelection.forEach((button) =>
    button.addEventListener('click', () => assignOperator(button.textContent))
)

//Def cleared calculator display
function clearScreen() {
    currentDisplay.textContent = '0';
    previousDisplay.textContent = '';
}

//Def reset calculator display
function resetScreen() {
    currentDisplay.textContent = '';
    needReset = false;
}

//Display result of math operation
function displayResult() {

}

//Assigns the input operator to the problem
function assignOperator() {
    previousDisplay.textContent = currentDisplay.textContent;
    //operand1 = previousDisplay.textContent;
    //FIX ME
}

function assignOperand() {
    resetScreen();
    //FIX ME
}

function displaySelection(number) {
    if (currentDisplay.textContent === '0' || needReset) {
        resetScreen();
    }
    currentDisplay.textContent += number;
}

function handleKeyboardInput(e) {
    if (e.key === 'Delete') clearScreen();
    if (e.key === '+' || e.key === '-' || e.key === '*' || e.key === '/') assignOperator(e.key);
    if (e.key >= 0 && e.key <= 9) displaySelection(e.key);
}