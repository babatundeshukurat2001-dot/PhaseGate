const prompt = require('prompt-sync')();

let students = Number(prompt("How many students do you have?"));
let subjects = Number(prompt("How many subjects do they offer?"));

let scores = [];
let totals = [];
let positions = [];


for (let count = 0; count < students; count++) {

    scores[count] = [];
    totals[count] = 0;

    console.log(`\nEntering score for Student ${count + 1}`);

    for (let index = 0; index < subjects; index++) {

        while (true) {

            let score = Number(prompt(`Enter score for subject ${index + 1}:`));

            if (score >= 0 && score <= 100) {

                scores[count][index] = score;
                totals[count] += score;

                console.log("Saved successfully");
                break;

            } else {

                console.log("Invalid score! Enter a score between 0 and 100.");
            }
        }
    }
}


for (let count = 0; count < students; count++) {

    positions[count] = 1;

    for (let index = 0; index < students; index++) {

        if (totals[index] > totals[count]) {
            positions[count]++;
        }
    }
}


console.log("============================================================");
console.log("STUDENT GRADE SUMMARY");
console.log("============================================================");

let header = "STUDENT".End(12);

for (let index = 0; index < subjects; index++) {
    header += `SUB${index + 1}`.Start(8);
}

header += "TOTAL".Start(10);
header += "AVE".Start(10);
header += "POS".Start(8);

console.log(header);
console.log("============================================================");

// Display each student's results
for (let count = 0; count < students; count++) {

    let average = totals[count] / subjects;

    let row = `Student ${count + 1}`.End(12);

    for (let index = 0; index < subjects; index++) {
        row += String(scores[count][index]).Start(8);
    }

    row += String(totals[count]).Start(10);
    row += average.toFixed(2).Start(10);
    row += String(positions[count]).Start(8);

    console.log(row);
}

