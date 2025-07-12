#  file input & output


""" Character Meaning """

 # 'r'   open for reading (default)

#  'w'   open for writing, truncating the file first
    
#  'x'   create a new file and open it for writing

#  'a'   open for writing, appending to the end of the file if it exists
    
#  'b'   binary mode

#  't'   text mode (default)

#  '+'   open a disk file for updating (reading and writing)


#  "r+"  "w+"   "a+"



#  to read the file 
#  .read()

"""
f = open("anuj.txt", "r")
data = f.read()
print(data)
f.close() """


# to print the lines of paragraph { no in braket for print charcter}
#  .readline()  (no. of character)

"""
f = open("anuj.txt", "r")
line1 = f.readline(3)
print(line1)
f.close()  """

# to write new line or add new line in paragraph
#  .write()   {"w" - for over write the paragraph } {"a" - for add the text in paragraph }

"""
f = open("anuj.txt", "a")
line1 = f.write("\nthis is anuj")
print(line1)
f.close() """

# for create new file

"""
f = open("kumar.txt", "w" )
f.close  """

# for over writting text from starting  {"r+"}

"""
f = open("anuj.txt", "r+")
f.write("abc")
print(f.read())
# print(f.write("anuj"))
f.close()  """


#  "with"  syntax in files

"""
with open("anuj.txt", "r") as f:
    data = f.read()
    print(data)

with open("kumar.txt", "w") as f:
    data = f.write("anuj kumar singh is the king of the world")
    print (data)  """

# delete a file

import os

# os.remove("kumar.txt")
os.rename("kumar.txt", "singh.txt")


# add a file
f = open("kumar.txt", "w")
f.close()