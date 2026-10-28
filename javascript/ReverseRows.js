function reverseRows(reverse) {

    for (let count = 0; count < reverse.length; count++) {

        let left = 0;

        let right = reverse[count].length - 1;

        while (left < right) {

            let temp = reverse[count][left];

            reverse[count][left] = reverse[count][right];

            reverse[count][right] = temp;

            left++;

            right--;
        }
    }
    return reverse;
}

let input = [
    [8,6],
    [4,5,6],
    [3],
    [1,2,3,4]
];

console.log(reverseRows(input));

