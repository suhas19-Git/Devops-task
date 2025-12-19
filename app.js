// sumCalculator.js

// Function to add two numbers
function addNumbers(a, b) {
    return a + b;
}

// Main function
function main() {
    const readline = require('readline').createInterface({
        input: process.stdin,
        output: process.stdout
    });

    readline.question('Ondu number enter madu: ', num1 => {
        readline.question('Inno number enter madu: ', num2 => {
            const result = addNumbers(Number(num1), Number(num2));
            console.log(`Sum = ${result}`);
            readline.close();
        });
    });
}

main();
