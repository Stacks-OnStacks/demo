const nums1 = [1, 2, 3, 4, 5];
const nums2 = [10, 20, 30, 40, 50];

console.log(nums1);
console.log(nums2);

function add5(num) {
    console.log(num + 5);
}

// add5(nums1[0]);
// add5(nums1[1]);
// add5(nums1[2]);
// add5(nums1[3]);
// add5(nums1[4]);

// forEach is a HIGHER ORDER function available to arrays to apply some CALLBACK function
nums1.forEach(add5);
nums2.forEach(add5);

// Anonymous functions - one offs
nums1.forEach((n) => {
    console.log(n * 2);
});
const times50 = nums2.forEach((n) => {
    n * 50;
});

console.log(nums1); // original array
console.log(nums2); // original array

// forEach function on arrays DOES NOT return anything it simply applies any CALLBACK function to each element
console.log(times50); // undefined

// map
// the addition of {} is requried for multi-line and requires you specify a return keyword for the value you wish to return
const x50 = nums2.map((n) => {
    return n * 50;
});

// when you're performing a single action you can ignore {} and needing to specify a return
const xx50 = nums2.map((n) => n * 50);

console.log(x50);
console.log(xx50);

const d2 = nums2.map((e) => {
    if (e % 4 === 0) {
        return e;
    }
    return e / 2;
});

console.log(d2);
let last;
last = nums1.pop();
console.log(last);
last = nums1.pop();
console.log(last);
last = nums1.pop();
console.log(last);
last = nums1.pop();
console.log(last);

// there is also an option to just add
nums1.push(2);
nums1.push(3, 4, 5);

console.log(nums1);

nums1
    .filter((e) => {
        if (e % 2 === 0) return e;
    })
    .forEach((e) => console.log(e));

const evenNums1 = nums1
    .filter((e) => {
        if (e % 2 === 0) return e;
    })
    .map((i) => i * 1000);

console.log(evenNums1);

const stringArray = ["hello", "there", "ahhh", "general", "kenobi", "blah"];
stringArray.pop();
console.log(stringArray);

const evenStrings = stringArray.filter((e) => (e.length % 2 === 0 ? e : ""));

console.log(evenStrings);
