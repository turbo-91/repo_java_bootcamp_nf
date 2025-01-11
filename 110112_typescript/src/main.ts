import './style.css'
import typescriptLogo from './typescript.svg'
import viteLogo from '/vite.svg'
import { setupCounter } from './counter.ts'
import {christmasTree} from "./christmasTree.ts";
import {filterWords, multiplyNumbers, someNumbers, sumNumbers} from "./function.ts";

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