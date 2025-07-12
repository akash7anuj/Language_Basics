def hangman():
    word = "python"
    guessed = "_" * len(word)
    attempts = 6
    guessed_letters = []

    print("Welcome to Hangman!")
    print(guessed)

    while attempts > 0 and guessed != word:
        guess = input("Guess a letter: ").lower()
        
        if guess in guessed_letters:
            print("You already guessed that letter!")
            continue

        guessed_letters.append(guess)

        if guess in word:
            guessed = "".join([guess if word[i] == guess else guessed[i] for i in range(len(word))])
        else:
            attempts -= 1
            print(f"Wrong guess! {attempts} attempts left.")

        print(guessed)

    if guessed == word:
        print("Congratulations! You won!")
    else:
        print("Sorry, you lost. The word was:", word)

hangman()
