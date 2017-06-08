#!/usr/bin/env python2

# Change cont to True to avoid crashing.
cont = False
if cont :
    var = 1234

# Next line will crash because var is defined outside the current scope.
print(var)
