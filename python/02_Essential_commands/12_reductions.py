#!/usr/bin/env python2

print reduce(lambda a,b: a+b, range(3))
print reduce(lambda a,b: a+b, range(4))
print reduce(lambda a,b: a+b, range(5))
print reduce(lambda a,b: a*b, range(5))
print reduce(lambda a,b: a*b, range(1,5))
