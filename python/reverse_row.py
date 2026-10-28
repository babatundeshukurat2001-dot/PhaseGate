def reverse_rows(reverse):

    for count in range(len(reverse)):

        left = 0

        right = len(reverse[count]) - 1

        while left < right:

            reverse[count][left], reverse[count][right] = reverse[count][right], reverse[count][left]

            left += 1

            right -= 1

    return reverse

print(reverse_rows([[8,6],[4,5,6],[3],[1,2,3,4]]))
