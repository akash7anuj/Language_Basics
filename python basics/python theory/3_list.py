# list and tuple

"""
marks = (94.4, 87.5, 95.2, 66.4, 45.1)

print(marks)
print(len(marks))
print(marks [0])
print(marks [1])"""


# in list we can assign the value

"""
student = ["karan", 95.4, 17, "Delhi"] 
print(student [0])

student [0] = "arjun"
print(student)"""

#  list slicing

"""
marks = (94, 87, 95, 66, 45)
print(marks[1 : 5])
print(marks[ : 5])
print(marks[2 : ])
print(marks[-4 : -1]) # opposite slicing"""

# list methods { special for list }

"""
list = [94, 87, 95, 66, 45]
list.append(4)    # to add new digit in list but in last
list.sort()       # ascending order
list.sort(reverse= True)  # descending order
list.reverse()
list.insert(3, 55)
list.remove(87)
list.pop(2)   # remove through plave value{ index }
print(list)


alp = ["a", "d" ,"t" ,"y", "u", "w"] # order in string
alp.sort()    
alp.sort(reverse= True)
alp.reverse()
list.insert(3, "h")
print(alp)"""

#  tuples  { immutable " can't delete, edit or add data " same in string } not assignment

tup = (1,)  # use "," after single value to make it tuple otherwise its int, string, float etc.
print(tup)
print(type(tup))

tup = (3, 5, 6, 7, 4)
print(tup)
print(tup.index(6))  # place of index of element, present in tuple
print(tup.count(6))  # count the no of element in tuple