#!/usr/bin/env python2

# We create a variable by writing the name of the variable we want followed
# by an equals sign, which is followed by the value we want to store in the
# variable. For example, the following line creates a variable called
# hello_str, containing the string Hello World.
hello_str = "Hello World"

# Integer variable
hello_int = 21

# Boolean variable
hello_bool = True

# Tuples are immutable data types
hello_tuple = (21,32)

# List
hello_list = ["Hello,","this","is","a","list"]

# This list now contains 5 strings. Notice that there are no spaces
# between theese strings so if you were to join them up so make a sentence
# you'd have to add space between each element.

# Another way to create the same list
hello_list = list()
hello_list.append("Hello")
hello_list.append("this")
hello_list.append("is")
hello_list.append("a")
hello_list.append("list")

# The first line creates an empty list and the following lines use the append
# function of the list type to add elements to the list. This way of using a
# list isn't really very useful when working with strings you already know of in
# advance, but it can be really useful when working with dynamic data such as user
# input. This list will overwrite the first list without any warning as we
# are using the same variable name as the previous list.

hello_dict = {"first_name":"Liam",
       "last_name":"Frasier",
       "eye_colour":"Blue"}

# Let's access some elements inside our collections
# We'll start by changing the value of the last string in our hello_list and
# add an exclamation mark to the end. The "list" string is the 5th element
# in the list. However, indexes in Python are zero-based, which means the
# first element has an index of 0.

print(hello_list[4])
hello_list[4]+="!"
# The above line is the same as
hello_list[4] = hello_list[4] + "!"
print(hello_list[4])

print(str(hello_tuple[0]))
# We can't change the value of those elements like we just did with the list
# Notice the use of the str function above to explicitly convert the integer
# value inside the tuple to a string before printing it.

print(hello_dict["first_name"] + " " +
      hello_dict["last_name"]  + " has " +
      hello_dict["eye_colour"] + " eyes.")

print("{0} {1} has {2} eyes.".format(hello_dict["first_name"],
                                     hello_dict["last_name"],
                                     hello_dict["eye_colour"]))

