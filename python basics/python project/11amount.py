expenses = {}

def add_expense(date, amount, category):
    if date in expenses:
        expenses[date].append({'amount': amount, 'category': category})
    else:
        expenses[date] = [{'amount': amount, 'category': category}]

def view_expenses():
    for date, expense_list in expenses.items():
        print(f"Date: {date}")
        for expense in expense_list:
            print(f"  Amount: {expense['amount']}, Category: {expense['category']}")

def total_expenses():
    total = sum(expense['amount'] for expense_list in expenses.values() for expense in expense_list)
    print(f"Total expenses: {total}")

while True:
    action = input("Enter 'add', 'view', 'total', or 'quit': ").lower()
    
    if action == 'add':
        date = input("Enter date (YYYY-MM-DD): ")
        amount = float(input("Enter amount: "))
        category = input("Enter category: ")
        add_expense(date, amount, category)
    elif action == 'view':
        view_expenses()
    elif action == 'total':
        total_expenses()
    elif action == 'quit':
        break
    else:
        print("Invalid action!")
