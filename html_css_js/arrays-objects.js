console.log("Hello from the arrays-objects.js file");

// Arrays in JS
let hello = "hello";
const stuff = [10, 20, 30, true, null, undefined, NaN, hello, "cheesecake"];

console.log(stuff); // will print out the above array

console.log(stuff[7]); // hello

stuff[stuff.length + 100] = true;
// stuff[stuff.length] = true;
// stuff[stuff.length] = true;
// stuff[stuff.length] = true;
// stuff[stuff.length] = true;
// stuff[stuff.length] = true;
// stuff[stuff.length] = true;
// stuff[stuff.length] = true;
// stuff[stuff.length] = true;
// stuff[stuff.length] = true;
// stuff[stuff.length] = true;
// stuff[stuff.length] = true;
// stuff[stuff.length] = true;
// stuff[stuff.length] = true;
console.log(stuff);

// spread operator with arrays
const clonedStuff = [...stuff, true, true, true, true, true, true, true, true, true, true, true, true, true, true];

console.log(clonedStuff);

// array with for loop

for (let i = 0; i < stuff.length; i++) {
    console.log(stuff[i]);
}

// fun weird syntax for a for loop
let x = 0;
for (; x < 10; ) {
    console.log(x);
    x += 1;
}

// for of loop - arrays

for (const element of stuff) {
    console.log("Enhanced for loop returns: " + element);
}

// Array Destructuring -- NOTE THIS FOR REACT

const people = ["Rei", "Izzy", "Byron", "Paul"];
console.log(people);

// people[1] = "Charles";
// console.log(people);

// With array destructuring ORDER MATTERS!!!!!
// const [rei, izzy, paul, byron] = people;

// the above array destructuing is the same as
const [rei, izzy, byron, paul] = ["Rei", "Izzy", "Byron", "Paul"];

// The below is equivalent to what's above
// const rei = people[0];
// const izzy = people[1];
// const byron = people[2];
// const paul = people[3];

console.log(rei, izzy, byron, paul); // Rei, Izzy, Paul, Byron?

//JS Object Literals! === JSON ** some caveats

const user = {
    username: "JesterCharles",
    fName: "Charles",
    lName: "Jester",
    isTrainer: true,
    hasLife: undefined,
    hasMeaningForExistence: null,
    key: "HAH got you",
};

// Two ways to access values:

console.log(user.username); // dot notation to access a value based on its key
console.log(user["hasLife"]); // this is block notation providing the STRING value for the key

for (const key in user) {
    //console.log(key + " " + user.key); // DO NOT USE dot NOTATION IN a for-in loop
    console.log(key, user[key]); // use block notation instead
}

user.password = "securePass";

const { username, password, fName, lName } = user;

console.log(username, password, fName, lName);

// Cloning - using the SPREAD OPERATOR!!!!!!

// const clonedUser = {
//     username: "CronjeRei",
//     fName: "Rei",
//     lName: "Cronje",
//     isTrainer: true,
//     hasLife: undefined,
//     hasMeaningForExistence: null,
//     key: "HAH got you",
// };

// this is the spread operator
const clonedUser = {
    ...user, // at this point clonedUser === user
    username: "CronjeRei", // here we start reassigning the values for each key
    fName: "Rei",
    lName: "Cronje",
    password: "lastNameIsSecure&Secret",
    isTrainer: false,
};

console.log(clonedUser);
