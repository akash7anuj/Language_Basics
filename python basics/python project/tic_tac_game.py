# def print_board(board):
#     for row in board:
#         print(" | ".join(row))
#         print("-" * 5)

# def check_winner(board, player):
#     for row in board:
#         if all(s == player for s in row):
#             return True
#     for col in range(3):
#         if all(board[row][col] == player for row in range(3)):
#             return True
#     if all(board[i][i] == player for i in range(3)) or all(board[i][2 - i] == player for i in range(3)):
#         return True
#     return False

# def tic_tac_toe():
#     board = [[" " for _ in range(3)] for _ in range(3)]
#     current_player = "X"
#     moves = 0

#     while moves < 9:
#         print_board(board)
#         row, col = map(int, input(f"Player {current_player}, enter your move (row and column): ").split())
        
#         if board[row][col] == " ":
#             board[row][col] = current_player
#             moves += 1
#             if check_winner(board, current_player):
#                 print_board(board)
#                 print(f"Player {current_player} wins!")
#                 return
#             current_player = "O" if current_player == "X" else "X"
#         else:
#             print("Invalid move, try again.")
    
#     print_board(board)
#     print("It's a tie!")

# tic_tac_toe()



def print_board(board):
    # Print each row of the board
    for row in board:
        # Join the elements of the row with ' | ' and print
        print(" | ".join(row))
        # Print a separator line
        print("-" * (4 * len(row) - 1))

def check_winner(board, player):
    size = len(board)
    # Check each row for a win
    for row in board:
        if all(s == player for s in row):
            return True
    # Check each column for a win
    for col in range(size):
        if all(board[row][col] == player for row in range(size)):
            return True
    # Check the main diagonal for a win
    if all(board[i][i] == player for i in range(size)):
        return True
    # Check the anti-diagonal for a win
    if all(board[i][size - 1 - i] == player for i in range(size)):
        return True
    return False

def tic_tac_toe():
    # Prompt the user to enter the size of the board
    size = int(input("Enter the size of the board (e.g., 3 for 3x3 board): "))
    # Initialize the board with empty spaces
    board = [[" " for _ in range(size)] for _ in range(size)]
    current_player = "X"
    moves = 0

    # Loop until all moves are exhausted
    while moves < size * size:
        print_board(board)
        # Prompt the current player to enter their move
        row, col = map(int, input(f"Player {current_player}, enter your move (row and column): ").split())
        
        # Check if the move is valid
        if 0 <= row < size and 0 <= col < size and board[row][col] == " ":
            # Update the board with the current player's move
            board[row][col] = current_player
            moves += 1
            # Check if the current player has won
            if check_winner(board, current_player):
                print_board(board)
                print(f"Player {current_player} wins!")
                return
            # Switch to the other player
            current_player = "O" if current_player == "X" else "X"
        else:
            print("Invalid move, try again.")
    
    # If all moves are exhausted and no winner, it's a tie
    print_board(board)
    print("It's a tie!")

# Start the game
tic_tac_toe()