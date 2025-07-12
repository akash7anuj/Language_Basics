"""Conditional statement"""
#1 if, elif, else


# traffic light code

light = input("light : ")

if (light == "red") :
    print("stop")
elif (light == "yellow") :
    print("wait")
elif (light == "green") :
    print("go")
else :
    print("light is broken")


# marks code

mark = int(input("enter your mark :"))

if (mark >= 90) :
    print("A")
elif(mark >= 80 and mark < 90) :
    print("B")
elif(mark >= 70 and mark < 80) :
    print("C")
elif(mark >= 60 and mark < 70) :
    print("D")
else :
    print("FAIL")


# fee code with conditon (true & false)

A = int(input("A: "))
G = input("M/F: ")

if((A == 1 or A == 2) and G == "M") :
    print("fee is 100")
elif(A == 3 or A == 4 or G == "F") :
    print("fee is 200")
elif(A == 5 and G == "M") :
    print("fee is 300")
else:
    print("no fee")

#  and  { T+T = T , T+F = F , F+T = F , F+F = F  }
#  or   { T+T = T , T+F = T , F+T = T , F+F = F  } 


# nesting  { one statement is in another statement }
age = 95

if (age >= 18):
    if (age >= 88):
        print("cannot drive")
    else:
        print("can drive")
else:
        print("cannot drive")

    

#2 single line If ( ternary oprator) 
# write 4 line code in one line but in same manner

#               1st

#   <var> = <var1> if <condition> else <var2>

food = input("food :")
eat = "yes" if food == "cake" else ("no")
print(eat) 


#               2nd

#   <stt1> if <condition> else <stt2>

food = input("food :")
print("sweet") if food == "cake" or food == "mango" else print("no sweet")



#3 clever if / ternary oprator 
# write 4 line code in one line but in different manner

#  <var> = (false_val , true_val) [<condition>]

age = int(input("age :"))
vote = ("yes" , "no") [age < 17]
print (vote)


sal = float(input("salary: "))
tax = sal*(0.1, 0.2) [sal <= 50000]
print(tax)