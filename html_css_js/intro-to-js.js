// This is a comment
console.log("hello stacks on stacks you wonderful human beings (plus one robot)");
console.log("We are oh so quite fantastic individuals learning the JS");

x = 10; // this is a primitive known as number

console.log(x * 2); // 20
console.log(x - 2); // 8
console.log(x / 2); // 5

y = 10.4; // this is still just a number
// note under the hood all JS numbers are floating point numbers
console.log(y * 2); // 20.8

//console.log(asdfasdf); // kills the program
console.log(pie); // this is known as HOISTING
//console.log(pie2); // you won't be able to call this before pie2 is declared!

var pie; // declare a variable in JS and always defaults to undefined
let pie2; // this allows for reassignment
const pie3 = 9.42;

// primitives
number = 20.75;
fName = "Charles"; // this is a string
nothing = null; // YOU HAVE TO SPECIFY THIS
defaultNothing = undefined; // default "nothing" value
booleans = true; // true false like every other language
notANumber = NaN; // Not a number, meaning something is not a valid number but the datatype is number

console.log("pie" * 20); // this is a NaN, which is st ill datatype number

console.log(number, fName, nothing, defaultNothing, booleans, notANumber);

pie = 3.14;
pie2 = 6.28;
// pie3 = 10; this will not run due to being a const variable

console.log(pie);
console.log(pie2);
console.log(pie3);

// operators x = 10 they are pretty universal
console.log(x % 2); // 0
x += 2; // 12
x *= 2; // 24
x -= 2; // 22
x /= 2; // 11

console.log(x * 2); // 22?

// Wild nature of java script
// tHis is type coercion
console.log(true + 3 * 2 + "10" + 45); // 71045
console.log(true + 3 * 2 + "10" * 2); // 1 + 6 + 20 = 27
console.log((true + 3 * 2 + "10") * 2); // 1420?
console.log((undefined + 3 * 2 + "10") * 2); // 1420?
console.log(1 + 3 + 2 + "10" + 2); // 6102 Left -> right
console.log("10" + 1 + 3 + 2 + 2); // 101322 Left -> right

// equivalency evaluations (true or false)
console.log(true == 1); // true
console.log(undefined == 0); // true? false
console.log("20" == 20); // true

// How do we counteract this?
console.log("20" === 20); // this now also CHECKS THE TYPE OF DATA AS WELL
