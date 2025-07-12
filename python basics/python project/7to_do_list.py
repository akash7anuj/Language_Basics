def todo_list():
    tasks = []
    while True:
        action = input("Choose an action (add/view/quit): ").lower()
        if action == 'add':
            task = input("Enter a task: ")
            tasks.append(task)
        elif action == 'view':
            print("To-Do List:")
            for task in tasks:
                print(f"- {task}")
        elif action == 'quit':
            break
        else:
            print("Invalid action")

todo_list()
