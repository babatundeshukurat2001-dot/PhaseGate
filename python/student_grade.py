def main():
    students = int(input("How many students do you have? "))
    subjects = int(input("How many subjects do they offer? "))

    scores = [[0] * subjects for _ in range(students)]
    totals = [0] * students
    positions = [0] * students

    for count in range(students):
        print(f"\nEntering score for Student {count + 1}")

        for index in range(subjects):
            while True:
                score = int(input(f"Enter score for subject {index + 1}: "))

                if 0 <= score <= 100:
                    scores[count][index] = score
                    totals[count] += score
                    print("Saved successfully")
                    break
                else:
                    print("Invalid score! Enter a score between 0 and 100.")

    for count in range(students):
        positions[count] = 1
        for index in range(students):
            if totals[index] > totals[count]:
                positions[count] += 1

    
    line = "============================================================="
    print("\n" + line)
    print("STUDENT GRADE SUMMARY")
    print(line)

    headings = f"{'STUDENT':<12}"
    for index in range(subjects):
        headings += f"{'SUB' + str(index + 1):>8}"
    headings += f"{'TOTAL':>10}{'AVE':>10}{'POS':>8}"
    print(headings)
    print(line)

    for count in range(students):
        average = totals[count] / subjects

        row = f"{'Student ' + str(count + 1):<12}"
        for index in range(subjects):
            row += f"{scores[count][index]:>8d}"
        row += f"{totals[count]:>10d}{average:>10.2f}{positions[count]:>8d}"
        print(row)


if __name__ == "__main__":
    main()
