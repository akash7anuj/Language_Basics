contacts = {}

def add_contact(name, phone, email):
    contacts[name] = {'phone': phone, 'email': email}

def view_contacts():
    for name, details in contacts.items():
        print(f"Name: {name}, Phone: {details['phone']}, Email: {details['email']}")

def delete_contact(name):
    if name in contacts:
        del contacts[name]
        print(f"Contact {name} deleted.")
    else:
        print("Contact not found.")

while True:
    action = input("Enter 'add', 'view', 'delete', or 'quit': ").lower()
    
    if action == 'add':
        name = input("Enter name: ")
        phone = input("Enter phone number: ")
        email = input("Enter email: ")
        add_contact(name, phone, email)
    elif action == 'view':
        view_contacts()
    elif action == 'delete':
        name = input("Enter the name of the contact to delete: ")
        delete_contact(name)
    elif action == 'quit':
        break
    else:
        print("Invalid action!")
