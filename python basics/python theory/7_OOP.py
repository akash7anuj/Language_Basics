# Object oriented programming

"""
class Student :  # class
    name = "anuj"  


S1 = Student()  # object
print(S1.name)"""

#    other example

"""
class car :
    brand = "BMW"
    type = "modern"
    wheel = "4"

car1 = car()
print(car1.brand)
print(car1.type)  """

# __init__  { constructors }

"""
class student :

     # default constructors
    def __init__(self):
          pass
     
     # parameterized constructors

    def __init__(self, name) :
        self.name = name
        print("adding new value by another method")

s1 = student("anuj")
print(s1.name)

s2 = student("ankit")
print(s2.name)  """

# for adding another value

"""
class student :
    def __init__(self, name, marks) :
        self.name = name
        self.marks = marks
        print("adding new value by another method")

s1 = student("anuj", 76)
print(s1.name, s1.marks)

s2 = student("ankit", 87)
print(s2.name, s2.marks)  """

"""
class student :
    college = "IIt Bombay" # adding value  which is same for all object

    def __init__(self, name, marks) :
        self.name = name
        self.marks = marks
        print("adding new value by another method")

s1 = student("anuj", 76)
print(s1.name, s1.marks)

s2 = student("ankit", 87)
print(s2.name, s2.marks)

print(s2.college)    # both code are same
print(student.college)  """


#** methods


#1 static method  { methods which is on class level } { this methos is help to make function unique in class}

"""
class static() :
    @staticmethod   # to add static method in class  { # decorator } { can't be make dublicate function }
    def hello():
        print("hello")

static.hello()  """


#2 class method   {"cls" as attribute}

"""
class person():
    name = "anonymous"

    # def changeName (self, name):
    #     self.__class__.name = name   #  { make attribute as class value }

    @classmethod  #  { for directly change in class attribute }
    def changeName (cls, name):  
        cls.name = name

p1 = person()
p1.changeName("rahul kumar")

print(p1.name)
print(person.name)  """


#3 instance  method {"__init__"}

"""
class Student(): 
    college_name = "ABC College"

    def __init__(self, name, marks):    #  { instance method }
        self.name = name
        self.marks = marks

    def welcome(self):
        print("welcome student,", self.name)

    def get_marks(self):
        return self.marks


s1 = Student("karan", 97)
s1.welcome()
print(s1.get_marks())

del(s1) # to delete the value   """
#   del(s1)  { to delete the value }

# Private (like) method

"""
class Account:
    def __init__(self, acc_no, acc_pass):
        self.acc_no = acc_no
        self.__acc_pass = acc_pass  #{ "__" before attribute make this private }

    def reset_pass(self):
        print(self.__acc_pass)

acc1 = Account("12345", "abcde")

print(acc1.acc_no)
# print(acc1.__acc_pass)
print(acc1.reset_pass())  """


# to make something private
#  Private attributes & methods are meant to be used only within the class and are not accessible from outside the class.

"""
class private():
    # __name = "anuj"

    def __hello(self):
        print("hello anuj")

    def hii(self):      # 
        self.__hello()
    

p1 = private()
# print(p1.__hello) # give error
print(p1.hii())  """

#   Parts of OOPs
""" Parts of OOPs """

#1 encapsulation  { in class if there is object and method that's encapsulation }

#2 Abstraction   { use to hide extra information }

"""
class Car:

    def __init__(self):
        self.acc = False
        self.brk = False
        self.clutch = False

    def start(self):
        self.clutch = True  
        self.acc = True
        print("car started..")

car1 = Car()  # hide extra information and print directly car started
car1.start()   """

#3  Inheritence { when class (child) derives the property and methods of another class (parent) }
""" part of inheritence """

#a  single inheritence

"""
class car():
    color = "black"

    @staticmethod
    def start():
        print("car started...")

    @staticmethod
    def stop():
        print("car stoped...")

class anujCar(car):

    def __init__(self, name):
        self.name = name

car1 = anujCar("akash")
car1 = anujCar("kumar")

print(car1.start())
print(car1.color) """

#b multi-level inheritence

"""
class car():
    color = "black"

    @staticmethod
    def start():
        print("car started...")

    @staticmethod
    def stop():
        print("car stoped...")

class anujCar(car):

    def __init__(self, brand):
        self.brand = brand

class fortuner(anujCar):

    def __init__(self, type):
        self.type = type


# car1 = anujCar("fortuner")
car1 = fortuner("desiel")

print(car1.type)
# print(car1.brand)
car1.start()  """
        

#c  multiple inheritence

"""
class A():
    varA = "this is class A"

class B():
    varB = "this is class B"

class C(A, B):
    varC = "this is class C"

c1 = C()

print(c1.varC)
print(c1.varB)
print(c1.varA)  """


#  super method in inheritence

"""
class car():
    def __init__(self, type):
        self.type = type

    @staticmethod
    def start():
        print("car started...")

    @staticmethod
    def stop():
        print("car stoped...")

class anujCar(car):

    def __init__(self, brand, type):
        super().__init__(type)   # to add att from the parent class
        self.brand = brand
        super().start()

c1 = anujCar("tayota", "diesel")
print(c1.type)
print(c1.start())  """


# property decorator

"""
class student():

    def __init__(self, phy, che, math):
        self.phy = phy
        self.che = che
        self.math = math
        # self.percentage = str((phy + che + math) / 3) + "%"  # { old method or another method }

    @property # { use in case of chnage the value }
    def percentage(self):
        return str((self.phy + self.che + self.math) / 3) + "%"

s1 = student(89, 98, 78)
print(s1.percentage)

s1.phy = 98
print(s1.percentage) """

# getter decorator  { @getter }

# setter decorator  { @setter }


#4  Polymorphism : oprator overloading

"""
print(1 + 2) #calculate
print("apna" + "college")  #concatenate
print((1, 2, 3) + (4, 5, 6)) #merge  """


# "__add__"

class Complex:
    def __init__(self, real, img):
        self.real = real 
        self.img = img

    def showNumber(self):
        print(self.real, "i +", self.img,"j")

    def __add__(self, num2):
        newReal = self.real + num2.real
        newImg = self.img + num2.img 
        return Complex (newReal, newImg)
    
num1 = Complex(1, 3)
num1.showNumber()

num2 = Complex(4, 6)
num2.showNumber()

num3 = num1 + num2
num3.showNumber()


# "__sub__"

class Complex:
    def __init__(self, real, img):
        self.real = real 
        self.img = img

    def showNumber(self):
        print(self.real, "i +", self.img,"j")

    def __sub__(self, num2):
        newReal = self.real - num2.real
        newImg = self.img - num2.img 
        return Complex (newReal, newImg)
    
num1 = Complex(1, 3)
num1.showNumber()

num2 = Complex(4, 6)
num2.showNumber()

num3 = num1 - num2
num3.showNumber()
