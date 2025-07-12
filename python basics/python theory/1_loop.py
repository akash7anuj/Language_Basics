#  While loop     { while (condition) : }

"""
while True:       # for unlimited result  
    print("anuj")"""

"""
count = 1
while  count <= 5 :
    count += 1
    print("anuj")

print(count)"""


# print value in loop

"""
i = 1
while  i <= 50 :
    print("anuj", i)
    i += 1 
print(count) """

# print no. 1 to 10

"""
i = 1
while i <= 10:
    print(i)
    i += 1 """

# print no. 1o to 1

"""
i = 10 
while i >= 1 :
    print(i)
    i -= 1 """


# print indifinite negative no.

"""
i = 5 
while i < 6 :    # stoping condition
    print(i)
    i -= 1  """

#  break method in loop

"""
num = (1, 4, 9, 16, 25, 36, 49, 64, 81, 100)

search = int(input("enter your no :"))

i = 0
while i < len(num) :
    if num[i] ==  search:
        print("found at ", i)
        break    # after the above get false it stop or break the program...
    else :
        print("finding...")
    i += 1

print("end the loop")"""


#  continue method in loop


# skip 4 in row

"""
i = 1
while i <= 10 :
    if (i == 4) :
        i += 1
        continue  # skip
    print(i)
    i += 1 """


# skip even in row

"""
i = 1
while i <= 10 :
    if (i % 2 == 0) :
        i += 1
        continue  # skip
    print(i)
    i += 1 """


#  for loop { for condition }

"""
num = (1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
for val in num : # print list of value in sequience
    print(val)

name = ("anuj","ankit","satya","durga","jyoti","nirjala")
for val in name:
    print(val) 
else:     # for optional or extra work
    print("end of the name")

name = "anuj kumar"
for char in name:  # print characters of word
    print(char)

seq = range(5)  # to print range of the no.
for i in seq:
    print(i)

    # or

for i in range(5):
    print(i)

for i in range(2,  5) : # starting point
    print(i)

for i in range(3, 20, 2): # {3 = staring no.} { 20 = ending no.} { 2 = step of avoid }
    print(i) 

for i in range(5):
    pass    # used to pass or ignore the loop

print(" it's pass ") """