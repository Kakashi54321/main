//1) timeout
console.log('1');
let timmy = setTimeout(function () {
    console.log('2');
}, 1);
let timothy = setTimeout(function () {
    console.log('3');
}, 10);
let timer = setTimeout(function () {
    console.log('4');
}, 0);
console.log('5');

//Output:
// 1
// 5
// 2
// 4
// 3

//2) async
let num = 0;
async function increment() {
    num += await 2;
    console.log(num);
}
increment();
num += 1;
console.log(num);

//Output:
//1
//2

// 3) Differences between dot notation and square bracket syntax
let sam = {
    castiel: "dilip"
}
let dean = {
    john: "diwas",
    dilip: "rahul"
}

//which, if any, of these three log statements will work?
console.log(dean[sam.castiel]);
//console.log(dean.sam.castiel);
console.log(dean[sam['castiel']]);
//console.log(dean[sam[castiel]]);

//Output:
// rahul
// exception 
// rahul
// exception 

// 4) Using `this` inside an object
// The object has functions created three different ways 
// What will be the result of the three log statements?

const circle = {
    radius: 10,
    circumference: function () {
        return (2 * Math.PI * this.radius);
    },
    diameter() {
        return (this.radius * 2);
    },
    area: () => {
        return (Math.PI * Math.PI * this.radius);
    }
}
console.log(circle.area()); // NaN
console.log(circle.diameter()); // works fine
console.log(circle.circumference()); // works fine

//5) spread operator
var myArray = ["Dilip", "Diwas", 1, true, 35];

myArray.push("end");
myArray.unshift("start");

myArray = ["start", ...myArray, "end" ]

console.log(myArray);

//6) bind 
var student = {
    name:"Dilip",
    getName: function(){
        return this.name;
    }
}

var name = student.getName.bind(student);

console.log(name());
console.log(student.getName());

/**
 *7)
 * Quirky operators and precedence in JavaScript
 * What is the output of these three lines and why?
 */

let first = (! + [] * []);
let second = (! + [] + [] * []);
let third = (! + [] + [] + ![]).length;

console.log(first);
console.log(second);
console.log(third);

