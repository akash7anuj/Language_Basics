questions = {
    "What is the capital of France?": ["A. Berlin", "B. Madrid", "C. Paris", "D. Rome"],
    "Which planet is known as the Red Planet?": ["A. Earth", "B. Mars", "C. Jupiter", "D. Saturn"],
    "Who wrote 'To Kill a Mockingbird'?": ["A. Harper Lee", "B. J.K. Rowling", "C. Ernest Hemingway", "D. Mark Twain"],
}

answers = {
    "What is the capital of France?": "C",
    "Which planet is known as the Red Planet?": "B",
    "Who wrote 'To Kill a Mockingbird'?": "A",
}

score = 0

for question, options in questions.items():
    print(question)
    for option in options:
        print(option)
    answer = input("Enter your answer (A/B/C/D): ").upper()
    
    if answer == answers[question]:
        score += 1
        print("Correct!\n")
    else:
        print("Wrong!\n")

print(f"Your total score is {score}/{len(questions)}.")
