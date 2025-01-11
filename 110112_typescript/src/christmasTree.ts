export function christmasTree(n: number): void {
    // Top part: Tree
    for (let i = 1; i <= n; i++) {
        let spaces = ""; // Initialize spaces
        let stars = ""; // Initialize stars

        // Build spaces
        for (let j = 1; j <= n - i; j++) {
            spaces += " ";
        }

        // Build stars
        for (let k = 1; k <= 2 * i - 1; k++) {
            stars += "*";
        }

        console.log(spaces + stars);
    }

    // Bottom part: Trunk
    for (let i = 1; i <= n; i++) {
        let trunkSpaces = ""; // Initialize trunk spaces

        // Build spaces for trunk
        for (let j = 1; j <= n - 1; j++) {
            trunkSpaces += " ";
        }

        console.log(trunkSpaces + "*");
    }
}
