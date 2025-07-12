# function definition

"""
def calc_sum(a, b):  # parameter
    sum = a + b
    print(sum)
    return sum

calc_sum(5, 10)   # function call / argument

calc_sum(2, 10)

calc_sum(12, 17)

       # or

def calc(a, b):
    return a + b

sum = calc(2, 5)
print (sum) """


# print hello

"""
def print_hello() :
    print("Hello")

print_hello()"""


# average of a no.

"""
def avg(a, b, c):
    sum = a + b + c
    avg1 = sum / 3
    print(avg1)
    return avg1

avg(4, 5, 6,)"""


# function in python  
"""
print()  # bulit in function
len()
type()
range()"""

"""
def calc_sum(a=1, b=2):  # parameter
    sum = a + b
    print(sum)
    return sum

calc_sum()  # use prestored value if function is null """


#* Recursion  { looks like loops }

"""
def recr(n):
    if (n == 0):
        return
    print(n)
    recr( n - 1 )


recr(9) """

# factorial of a no. through recursion


def fact(n):
    if(n == 0 or n == 1):
        return 1
    else:
        return n * fact(n-1)
        
print(fact(4))

