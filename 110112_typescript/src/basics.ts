
let age: number = 33;

for (let i = 1; i < age; i++) {
    console.log(i);
}

if (age > 18) {console.log("You're legally an adult.")}
else {console.log("You cry baby.")}

let score: number = 0;

if (score !== 0) {console.log("Score is available.")}

if (score) {console.log("Score is evaluated as truthy.")}

let username: string = "";

if (username !== null) {console.log("Username is available.")}

if (!username) {console.log("Username is evalutated as falsy.")}

let isAdmin: boolean = false;

if (isAdmin) {console.log("isAdmin is evaluated as truthy.")}

if (isAdmin == false) {console.log("isAdmin is false.")}