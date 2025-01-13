export type Grade = 1 | 2 | 3 | 4 | 5 | 6 | "A" | "B" | "C" | "D" | "E" | "F" | undefined;

export type Student = {
    firstName: string;
    lastName: string;
    age: number;
    grades: Grade[];
};

export function outputStudent(student: Student) {
    const firstLine: string  = student.firstName + " " + student.lastName + " (" + student.age + ")"
    const separator: string = "=".repeat(firstLine.length)
    console.log(firstLine);
    console.log(separator);
    const formattedGrades = student.grades.map(grade => grade === undefined ? "*" : grade);
    console.log("Grades: " + formattedGrades.join(", "));
}
