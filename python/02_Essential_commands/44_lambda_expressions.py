#!/usr/bin/env python2

sqr1 = lambda x: x*x

print sqr1(10)
print sqr1(6)

def gen_func(x):
    return lambda y:y**x

cubic = gen_func(3)
print cubic(2)

