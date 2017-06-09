#!/usr/bin/env python2

a = "Hello World"
b = memoryview(a)
print(b)
list(b)
print b[5]
print b[6]

