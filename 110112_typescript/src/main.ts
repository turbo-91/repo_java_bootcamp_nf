import './style.css'
import typescriptLogo from './typescript.svg'
import viteLogo from '/vite.svg'
import { setupCounter } from './counter.ts'
import {christmasTree} from "./christmasTree.ts";
import {filterWords, multiplyNumbers, someNumbers, sumNumbers} from "./function.ts";
import {outputStudent, Student} from "./types.ts";

document.querySelector<HTMLDivElement>('#app')!.innerHTML = `
  <div>
    <a href="https://vite.dev" target="_blank">
      <img src="${viteLogo}" class="logo" alt="Vite logo" />
    </a>
    <a href="https://www.typescriptlang.org/" target="_blank">
      <img src="${typescriptLogo}" class="logo vanilla" alt="TypeScript logo" />
    </a>
    <h1>Vite + TypeScript</h1>
    <div class="card">
      <button id="counter" type="button"></button>
    </div>
    <p class="read-the-docs">
      Click on the Vite and TypeScript logos to learn more
    </p>
  </div>
`

setupCounter(document.querySelector<HTMLButtonElement>('#counter')!)

let numbers: number[] = [5, 7, 13, -4, 15];
multiplyNumbers(numbers);

let words: string[] = ["why", "don't", "you", "go", "fuck", "yourself"]
filterWords(words);
sumNumbers(numbers)
someNumbers(numbers)

let antonMeier: Student = {
    firstName: "Anton",
    lastName: "Meier",
    age: 16,
    grades: [1, 4, 3, 1, 2, "A", undefined, 1, 2]
}

let bertaMueller: Student = {
    firstName: "Berta",
    lastName: "Müller",
    age: 17,
    grades: ["A", undefined, 1]
}

let caesarSchmidt: Student = {
    firstName: "Cäsar",
    lastName: "Schmidt",
    age: 17,
    grades: ["A", 1, undefined, 3, 2, 4, 5]
}

console.log("")
outputStudent(antonMeier);
console.log("")
outputStudent(bertaMueller);
console.log("")
outputStudent(caesarSchmidt);