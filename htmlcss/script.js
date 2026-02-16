// What is JavaScript?
// it makes the website interactive
// a programming language that is use to code functionaility to a website
// An Object Based Programming Language
// What is an Object Based Programming Language
// Everything is treated as an object
// JavaScript Has Classes but doesn't implement everything that an Object Oriented Language would do

let num = 10;

console.log(num)

console.log(num.toExponential())

// Variables

// var -- is the Original way of declaring variables
// Global scoped or Function Scoped -- This way is going out, so it shouldn't getting used in newer project
//var String = "hello";

// let String = "hello"

// var daniel = "hello"

// console.log(String)

// let
// when use let to declare variables, their mutable, they can be changed
//  so it gets used when we expect this variable to change throughout the instruction feed to the machine
// Developers can become lazy

//let isEven = 4 % 2 === 0

let numTwo = 10;
console.log(numTwo)
numTwo = 15
console.log(numTwo)

function isEven(num) {
    return num % 2 === 0 // JavaScript doesn't only have ==
}

// const
// const is immutable/cannot be reassigned
// so you want to use const when you want to prevent changes happening
// and must be assigned value immediately

const numthree = 20// even through it get boxed by the object, the value of numbers, strings, boolean because these not container objects the value becomes locked
// const is short for constant
const arr = [] //so if the object being stored inside a const is a container object(examples being arrays, hashmaps or etcs), you can modify what is inside the object but you cannot reassign that object

const numFour = 45

console.log(arr)

arr.push(numthree)
arr.push(numFour)

console.log(arr)

console.log("0" == 0)// this know as a truthy check, it compares the value of the string to the number after its cast
console.log("0" === 0) // this one is know as a truth check, so it check the datatype first then it compares the value, if the datatype is not a match it fails right
// Casting is when you go from one datatype to another
// with == it will cast the type then proform the boolean check
// with === it will not cast, if the types on't match then it fails

// Loops

// For Loop, While Loop, Do While Loop
// For Loop
// you with an iterater, this iterater will increment every round until you meet the condition
// forward or backward, counting up or counting down
// Big O Notation
// We use the Big O Notation
for(let count = 0; count < 10; count++) {
    console.log(count)
}

for(let count = 10; count > 0; count--) {
    console.log(count)
}

//While loop
// While the condition is not met, it continue the loop, if the condition is met before even entering the loop, the loop will not run

let foundEvenNumber = true

while (foundEvenNumber) {
    let randomNumber = Math.floor(Math.random() * 10)
    console.log(randomNumber)
    if(randomNumber % 2 === 0) {
        foundEvenNumber = false;
    }
    console.log(foundEvenNumber)
}

// Do While
// It will run the block of code once, then condition

let condition = true

do {
    console.log("example text")
    const b = Math.floor(Math.random() * 1)
    if (b <= 5) {
        condition = false
    }
} while (condition)

// Operators
//it special symbols used to help perform different operations
// Arthmatic
// Add, Substract, Multipcation, Division, Modulus, Exponents
// +, -, *, /, %, ** <- these are the simple math operators
// when chain together they follow PEMDAS

let result = 2
result *= 10 // 2*10
// result = result * 10
console.log(result)

// +=, *=, -=, /= <- the start of the advance math operaters
// they perform the math operation in a short hand format

// ++, --
result++ // result + 1, Postfix - it happens after
result-- // result - 1
++result // Prefix - it happens before

let playNum = 0
console.log(playNum);

console.log(++playNum);// <- Prefix
console.log(playNum++) // <- Postfix
console.log(playNum);

// boolean operators

// ==, ===, &&, ||
// Truthy, Truth, AND, OR
// Work hand and hand with the If Statement
// with the ==, === they are compartive operator
// with ==, it will type cast then compare the value after casting
// with ===, it doesn't type cast it, it compares the type and value

// Casting means changing the Datatype
// string, number, bool, NaN, undefined, Infinity
// string == number
// string transform it into another datatype like number

console.log("0" == 0)
console.log("0" === 0)

// AND, OR
// Truth Table
// condition(important) OR condition2(second) == True
// condition(important) AND condition2(second) == True

// +
// ADD, CONCATE

console.log(5 + "5")

// If Statements
// So it will check the condition or conditions and if they are met run the block of code

let mathResult = (15 + 25 === 40)

// an one condition if statement
if (mathResult) {
    console.log("IT WAS TRUE")
}

if((45 * 3 === 35 * 4) || true) { //<- with the OR operator either has to to be true to met the 
    // condition to run the block of code
    // will evulate the first if it is true stops evulating and runs code
    console.log("Its TRUE");
}

if (5 > 1 && 8 < 12) { // <- Here both conditions have to be true or the code will not run

}

//Reverse Bool

let boolResult = false

if (!boolResult) {
    console.log("My false went true");
    
}

if(!5) {
    console.log("error")
}


// Functions
// What are Functions
// It's algorithmic set of instructions
// There Three ways to declare functions

// Function Statement
function someFunction() {
    //you have your set of instructions
    for (let count = 0; count < 50; count++) {
        if(count % 2 === 0){
            console.log(count);
        } else {
            console.log("Odd");    
        }
    }
}

//Function Expression
const funcArrow = function() { // <- This is an Object
    // This is another way of declaring functions
    // This is not the Arrow Function
}

//Is Developers, Even though they come up with solution, they also like to reduce work effort to max results.
// Arrow Function

const funcArrow2 = () => {

}

funcArrow(10)
//Parameterless Functions

//Parameterized Functions
// You should avoid passing parameters that will not be used into the function
// Challenge 1 Debugging
// Is to find out why even though the array has 5 init why its not triggering the if statement 
const checkIfFiveIsInArray = (arr) => {
    arr.forEach(element => {
        if(element === 5) return element
        console.log(element) // <-- This is a Lambda Expression/ Unnamed Function
    });
    return false
}

const array1 = [6,2,7,9,10,5,8]

console.log(checkIfFiveIsInArray(array1))

// in forEach that return true doesnt return from check only returns from the callback function
//also even if 5 was found the loop never stops early and the line that hsa return false; always runs so the function result is always false
//basecilly return only exits the current function

/* const checkIfFiveIsInArray = (arr) => {
    for (const element of arr){
        if( element === 5 )return true;
    }
    return false;
}

// this for of methos is better tha forEach because it will stop once it finds number 5 but forEach it keeps looping to the end no matter what 
const array1 = [6,2,7,9,10,5,8]
    
console.log(checkIfFiveIsInArray(array1)) */







const spreadParameter = (...nums) => {
    let result = 0
    for(let numsInArray = 0; numsInArray < nums.length; numsInArray++) {
        result += nums[numsInArray]
    }
    return result
}

console.log(spreadParameter(5,4,9,10));
console.log(spreadParameter(1,2));
console.log(spreadParameter(6,7,3,1,45, 65, 15));

// Returns
// the main point of the return, is break out of the function scope the return called
// function will either return a piece of Data or it undefined
// this includes function that don't state a return

const product = (num1, num2) => {
    return num1 * num2 // <-- This is a basic return, using a Pure function
}
// A pure function will always have the same result, No unexpected side affects
console.log(product(2, 2));
console.log(product(2, 2));

const divisible = (num1, num2) => {
    if (num1 === 0 || num2 === 0) return 0 //<-- Early Return Statement to break before the rest of the code runs
    return num1 / num2
}

console.log(divisible(15, 0));
console.log(divisible(15, 3));

//const substract = (num1, num2) => num1 - num2 // <-- is know as a Implicit return

const substract = (num1, num2) => { num1 - num2 } // <-- This will not be treated as implicit return
// the reason it not consider implicit is because of the curly brackets
// when you have the curly brackets you have to state the return otherwise it goes to the default of undefined
console.log(substract);

// Nested Functions
// Functions inside Function

const exampleOuterFunction = () => { //<-- Very simple example of closure happening
    const outerVar = "I'm on the outside of the inner function"// <-- this variable belongs to the outside function

    const inner = () => {
        console.log(outerVar)//<-- it's being used here
        console.log("I'm from the Inner")
        console.log(num)
    }

    inner()
}

// exampleOuterFunction().inner()

// inner()

// Scopes
// Its How our Varaibles are place and ability to access them
// when you write a variable out outside a function or class its consider global/file scoped
// when global, you can access it through the whole script file
// function scoped
// function scoped variables and functions/methods can only be called inside the function
// Variable Shadowing
const sum = (num1, num2) => {
    let num = 0 //<-- this num will hide the other num only inside this function
}

// Closures
// So we have already been using closures.
// A closure is a function that has access to variable from its outer function, even after the outer function has returned

// Closure Backpack Comparsion
// You would the outer function, the backpack is an inner function
// when the call to the backpack is made, it loads the outer variable being called inside of itself
// Problems that can be caused by Closures: 

const createFunctionsBroken = () => {
    const functions = [];
    
    for (let i = 0; i < 3; i++) {  // var is function-scoped!
        functions.push(() => {
            console.log(i);  // Closes over the SAME i
        });
    }
    
    return functions;
};

const brokenFuncs = createFunctionsBroken();

console.log(brokenFuncs);
brokenFuncs[0]()
brokenFuncs[1]()
brokenFuncs[2]()

//Promises
// A promise is an object that knows information is coming, just doesn't know when it going to arrive
// Fetch API built into JavaScript

const characters = fetch("https://rickandmortyapi.com/api/character")
.then(res => console.table(res))
.catch(err => console.error(err))

console.table(characters)