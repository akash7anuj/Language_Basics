"""Type of oprator"""

#1 arithmetic operators
#    { it's calculus statement }

a = 5
b = 2

print(a + b)
print(a - b)
print(a + b)
print(a / b)
print(a % b)   #remainder
print(a ** b)  #a^b


#2 relational operators
#   { result come in "true or false"}  { it's comparing statement }

a = 50 
b = 20

print(a == b) # equal to
print(a != b) # not equal to { "!" is generally use for indicate "not"}
print(a > b)  # greater than
print(a >= b) # greater than equal to
print(a <= b) # smaller than equal to
print(a < b)  # smaller than


#3 assignment oprators
#  { used to assign(add) value to previous var}

num = 10

num += 10 # add 10 to 1st num
num -= 10
num *= 10
num /= 10
num %= 10
num **= 10

print (num)


#4 Logical oprators
#  { work on boolean value }

print(not True)         # { "not" gives opposite value. }
print(not False)

print(True and True)   
print(True and False)   # { "and" gives true if T+T otherwise it gives false }
print(False and True)   # { and means "aur" [ agr dono me se koi bhi glt to mai glt ] }
print(False and False)  #( in this false is more)

print(True or True)    
print(True or False)    # { "or" gives false if F+F otherwise it gives true }
print(False or True)    # { or means "ya" [ agr dono me se koi bhi sahi to mai sahi ] }
print(False or False)   #  ( in this true is more)