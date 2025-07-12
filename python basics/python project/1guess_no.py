"""
import random

def guess_number():

    num = int(input("enter max no. to play : "))
    number = random.randint(1, num)
    guess = None

    while guess != number:
        guess = int(input("Guess a number between 1 and "+ str(num) + " :" )) 
        if guess < number:
            print("Too low!")
        elif guess > number:
            print("Too high!")
        else:
            print("Congratulations! You guessed the number.")
        continue

guess_number() """


#  guess = int(input("Guess a number between 1 and 100 :")) in this line I want to replace the 100 to the value of num
# so, give me the way


"""...updated version..."""

# import random

# def guess_number():
#     while True:
#         try:
#             num = int(input("Enter the maximum number to play: "))
#             if num <= 1:
#                 print("Please enter a number greater than 1.")
#                 continue
#             break
#         except ValueError:
#             print("Please enter a valid integer.")

#     number = random.randint(1, num)
#     guess = None

#     while guess != number:
#         try:
#             guess = int(input(f"Guess a number between 1 and {num}: "))
#             if guess < 1 or guess > num:
#                 print(f"Please enter a number between 1 and {num}.")
#                 continue
#         except ValueError:
#             print("Please enter a valid integer.")
#             continue

#         if guess < number:
#             print("Too low!")
#         elif guess > number:
#             print("Too high!")
#         else:
#             print("Congratulations! You guessed the number.")

# guess_number()



import random

def guess_number():
    print("Welcome to the Guess the Number Game!")

    while True:
        try:
            num = int(input("Enter the maximum number to play: "))
            if num <= 1:
                print("Please enter a number greater than 1.")
                continue
            break
        except ValueError:
            print("Please enter a valid integer.")

    number = random.randint(1, num)
    guess = None

    while guess != number:
        try:
            guess_input = input(f"Guess a number between 1 and {num} (or type 'exit' to quit): ")
            if guess_input.lower() == 'exit':
                print(f"The number was {number}. Thanks for playing!")
                return

            guess = int(guess_input)

            if guess < 1 or guess > num:
                print(f"Please enter a number between 1 and {num}.")
                continue
        except ValueError:
            print("Please enter a valid integer.")
            continue

        if guess < number:
            print("Too low!")
        elif guess > number:
            print("Too high!")
        else:
            print("Congratulations! You guessed the number.")
    while True:
        play_again = input("Do you want to play again? (yes/no): ").strip().lower()
        if play_again == 'yes':
            guess_number()
        elif play_again == "no":
            print("Thanks for playing!")
            break
        else:
            print("please enter 'yes' or 'no' :", play_again)
        
guess_number()
