let numbers: number[] = [5, 7, 13, -4, 15];

export function multiplyNumbers(numbers: number[]){numbers.map(number => console.log(number*2))}

let words: string[] = ["why", "don't", "you", "go", "fuck", "yourself"]

export function filterWords(words: string[]){
    words.filter(word => {if (word.length > 5) {console.log(word)}})
}

export function sumNumbers (numbers: number[]) {
    const sum = numbers.reduce((accumulator, currentValue) => accumulator + currentValue, 0);
    console.log(sum)
}

export function someNumbers(numbers: number[]) {
    const some = numbers.some(num => num > 10)
    console.log(some)
}
