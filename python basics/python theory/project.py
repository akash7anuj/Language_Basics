#1  A program to check the no. is even or odd

"""
num = int(input("enter your no. : "))
rem = num % 2

if (rem == 1) :
    print("odd")
else :
    print("even")  """


#2  A program to find greatest of 3 number entered by user

"""
num1 = int(input("enter first no. : "))
num2 = int(input("enter second no. : "))
num3 = int(input("enter third no. : "))

if (num1 >= num2 and num1 >= num3):
    print("your greatest no. is :" and num1)
elif(num2 >= num3):
    print("your greatest no. is :" and num2)
else:
    print("your greatest no. is :" and num3)"""


#3 A program to find greatest of 4 number entered by user

"""
num1 = int(input("enter first no. : "))
num2 = int(input("enter second no. : "))
num3 = int(input("enter third no. : "))
num4 = int(input("enter fourth no. : "))


if (num1 >= num2 and num1 >= num3 and num1 >= num4):
    print("your greatest no. is :" , num1)
elif(num2 >= num3 and num2 >= num4 ):
    print("your greatest no. is :" , num2)
elif(num3 >= num4):
    print("your greatest no. is :" , num3)
else:
    print("your greatest no. is :" , num4)"""


#4 A program to check a no. is multiple of 7 or not

"""
num1 = int(input("enter your no. :"))
num2 = num1 % 7
if (num2 == 0) :
    print("this is multiple of 7" )
else:
    print("this is not multiple of 7" )
    print("your left no. is :", num2)"""


#5  A program to ask user to enter name of 3 favourite movie & store them in a list

"""
list = []

m1 = input("enter 1st movie name :")
m2 = input("enter 2nd movie name :")
m3 = input("enter 3rd movie name :")

list.append(m1)
list.append(m2)
list.append(m3)

print(list)"""

# another method
"""
list = []
list.append(input("enter 1st movie name :"))
list.append(input("enter 2nd movie name :"))
list.append(input("enter 3rd movie name :"))
print(list)"""


#6 A program to check if a list contain pelindrome of elements. {pelindrome is same as from opposite}

"""
list = [1, 4, 3, 4, 1]

list1 = list.copy()
list1.reverse()

if list1 == list :
    print( "it's pelindrome")
else:
    print("it's not pelindrome")  """


#7  print multiplication table of 2 with formate

"""
i = 1
while i <= 10 :
    n = 2 * i 
    print(2,"*",i, "=", n)
    i += 1  """


#8  print multiplication of string "n"  in series

"""
i = 1
while i <= 10 :
    print("n" * i)
    i += 1  """


#9  print the element of the following no. [ 1, 4, 9, 16, 25, 36, 49, 64, 81, 100]  

"""
num = (1, 4, 9, 16, 25, 36, 49, 64, 81, 100)

i = 0
while i < len(num) :
    print(num[i])
    i += 1  """

#10  search for a no in tuple using loop (1, 4, 9, 16, 25, 36, 49, 64, 81, 100)

"""
num = (1, 4, 9, 16, 25, 36, 49, 64, 81, 100)

search = int(input("enter your no :"))

i = 0
while i < len(num) :
    if num[i] ==  search:
        print("found at ", i)
    i += 1  """


#11  skip even in row

"""
i = 1
while i <= 10 :
    if (i % 2 == 0) :
        i += 1
        continue  # skip
    print(i)
    i += 1  """


#12  print multiplication table with formate { using for loop }

"""
num = int(input("enter your no. :"))

for i in range(1,11):
    print(num, "*", i, "=", num*i)  """

#13 A program to find the sum of all natural no. at given point.

"""
n = int(input("enter your no. :"))
sum = 0

for i in range(1, n+1) :
    sum += i
    print("total sum", i, "=", sum)
print("total sum", sum) """

# using while

"""
n = int(input("enter your no. :"))
sum = 0
i = 1

while i <= n :
    sum += i
    i += 1
    # print("total sum =", sum)
print("total sum =", sum) """


#14  A program to find the factorial of a no.

"""
n = int(input("enter your no. :"))
fact = 1
i = 1

while i <= n :
    fact *= i
    i += 1
    # print("total sum =", sum)
print("total sum =", fact) """

#15  A function to change doller in ₹

"""
def converter(usd_val):
    inr_val = usd_val * 83
    print(usd_val, "USD =", inr_val, "INR")

converter(5)


#  A function to change ₹ in $

def converter(inr_val):
    usd_val = inr_val / 83
    print(inr_val, "INR =", usd_val, "USD")

converter(8) """


#16  A function to print odd or even no.

"""
def no_check(num):
    if num % 2 == 0 :
        print("this is even no.")
    else:
        print("this is odd no.")

no_check(8) """


#17  A program to solve the sum of first n natural no. using recursion

"""
def rect(n):
    if(n == 0 ):
        return 0
    return n + rect(n - 1)

print(rect(4)) """


#18  A program to print all element of list using recursion

"""
def ele(list, idx = 0):
    if(idx == len(list)):
        return 
    print(list[idx])
    ele(list, idx + 1)
 
alp = ["a", "d" ,"t" ,"y", "u", "w"]
ele(alp) """


#19 A program to replaces the "java" to "python"

"""
with open("kumar.txt", "r") as f:
    data = f.read()

new_data = data.replace("java", "python")
print(new_data)


with open("kumar.txt", "w") as f:
    data = f.write(new_data)  """


#20  A program to search "python" in given file or not

"""
word = "python"
with open("kumar.txt", "r") as f:
    data = f.read()
    if(data.find(word) != -1 ):
        print("found")
    else:
        print("not found")
  
  #   in function

def search_word():

    word = input("search your word :")
    with open("kumar.txt", "r") as f:
        data = f.read()
        if(data.find(word) != -1 ):  #or { if (word in data): }
            print("found")
        else:
            print("not found")

search_word()  """

#21  A program to find the word comes first in which place

"""
def check_for_line():
    word = input("check line :")
    data = True
    line_no = 1
    with open("kumar.txt", "r") as f:
        while data:
            data = f.readline()
            if(word in data):
                print(line_no)
                return
            line_no += 1
    return -1
    
check_for_line()  """

#22  A program to find the no. of even in a list from a file

"""
count = 0
with open("kumar.txt", "r") as f:
    data = f.read()

    nums = data.split(",")
    for val in nums :
        if(int(val) % 2 == 0):
            count += 1

print(count) """


#23 Create student class that takes name & marks of 3 subjects as arguments in constructor. Then create a method to print the average.

"""
class Student:
    def __init__(self, name, marks):
        self.name = name
        self.marks = marks
    def get_avg(self):
        sum = 0
        for val in self.marks:
            sum += val
        print("hi", self.name, "your avg score is:", sum/3)

s1 = Student("tony stark", (99, 98, 97))
s1.get_avg()  """


#24 Create Account class with 2 attributes - balance & account no.
#    Create methods for debit, credit & printing the balance.

"""
class Account:
    def __init__(self, bal, acc):
        self.balance = bal
        self.account_no = acc

    def debit(self, amount):
        self.balance -= amount
        print("Rs.", amount, "was debited")
        print("total balance", self.get_balance())

    def credit(self, amount):
        self.balance += amount
        print("Rs.", amount, "was credited")
        print("total balance = ", self.get_balance())
              
    def get_balance(self):
        return self.balance

atc1 = Account(10000, 12345)
atc1.debit(1000)
atc1.credit(100)  """


#25  it's last one 


# make a number guess game
"""
import random

target = random.randint(1, 5)

while True:
    userChoice = input("guess your no. or Quit(Q) :")

    if (userChoice == "Q"):
        print("...GAME IS OVER...")
        break
    
    userChoice = int(userChoice)
    if (target == userChoice):
        print("succefully! you got the no.")
        print("...GAME IS OVER...")
        break
    elif(target > userChoice):
        print("too low no.")
    elif(target < userChoice):
        print("too high no.")
    else:
        print("invalide!..") """

# password generator


import random
import string

pass_len = 50

charValue = string.ascii_letters + string.digits + string.punctuation

password = ""
for i in range(pass_len):
    password += random.choice(charValue)

print("your new password is :", password)

        # or

res = "".join([random.choice(charValue) for i in range(pass_len)]) # { "" is for add value}
print(res)  