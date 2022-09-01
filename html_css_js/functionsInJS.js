console.log("Functions in JS are amazing!!!!!!!");

// What are functions in JS???

// Basic Function syntax
function fun() {
    console.log("I demand your happiness!!!");
}

fun();

const fun1 = function () {
    console.log("Why are you not laughing!!!!");
};

fun1();

// Arrow notation

const funArrow = () => {
    console.log("Fun arrow function! LAUGH!!!");
};

funArrow();

// Simple Add Function

const add = (a, b) => {
    console.log(a + b);
};

add(1, 2);
add(3, 4);
add(200, "300");

// Object Literals with Function definition

const dog = {
    petname: "Atlas",
    isHappy: true,
    isGood: undefined,
    coolOwner: null,
    bark: function () {
        console.log("BORK BORK!");
    },
};

dog.bark();

const dog2 = {
    petname: "Saber",
    isHappy: true,
    isGood: undefined,
    bark() {
        console.log("BJORN BJORN!");
    },
};

dog2.bark();

// JSON EXAMPLE
const jsonDog = JSON.stringify(dog); // converts JS objects to JSON
console.log(dog);

const jsonBackToDog = JSON.parse(jsonDog); // parses JSON to JS Objects
console.log(jsonBackToDog);
