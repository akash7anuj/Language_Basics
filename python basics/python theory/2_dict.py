#  Dictionary { key : value } { keys can't be repeated }

"""
dict = {
    "name" : "anuj",
    "age" : 20,
    "cgpa" : 9.6,
    "present?" : True,
    "marks" : [96, 97, 92, 93, 92],
    "subject" : ("maths","science"),
    12 : "twelve",
}

dict["name"] = "akash"  # to change the value of key
dict["surname"] = "singh" # to insert new key and value

print(dict)
print(type(dict))
print(dict["name"])
print(dict[12])

pair = list(dict.items())  # to print sequence of key and value.
print(pair[2])"""


# create null dictonary

"""
nul_dict = {}
nul_dict["name"] = "anuj"
print(nul_dict)"""


# Nested dictionary

"""
student = {
    "name" : "akash",
    "subject" : {
        "maths" : 94,
        "science" : 87,
        "english" : 78
    }
}

print(student)
print(student["subject"])
print(student["subject"]["maths"])"""


#2  dictionary method

"""
dict = {
    "name" : "anuj",
    "age" : 20,
    "cgpa" : 9.6,
    "present?" : True,
    "marks" : [96, 97, 92, 93, 92],
    "subject" : ("maths","science"),
    12 : "twelve",
}

print(list(dict.keys()))   # to print dict into list formate
print(dict.keys())  # to print key list of dictionary

print(dict.values()) 
print(list(dict.values()))

print(dict.items()) # to create tuple
print(len(dict))

pair = list(dict.items())  # to print sequence of key and value.
print(pair[2])

print(dict["name"])   # if no result found, give error
print(dict.get("name1"))    # if no result found, give none,

dict.update({"city" : "delhi"})   # add or update dictionary

new_dict = {"city" : "delhi"}
dict.update(new_dict)
print(dict)
"""


#  Sets

"""
set0 = {1, 2, 3, 4, 5, "anuj", "singh"}
print(set0)
print(type(set0))

set1 = {1, 2, 2, 2, 5, "anuj","anuj", "singh"} # value can"t be repeated
print(set1)
print(len(set1))

empty_set = set()   # to create empty set  { give error }
print(type(empty_set))"""


#  set methods

"""
setm = {1,3, 9, 9.0}

setm.add(1),
setm.add(2),
setm.add(2)

print(setm)"""

