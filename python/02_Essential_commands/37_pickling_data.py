#!/usr/bin/env python2

import pickle

data1 = ['a', 'b', 'c']
output1 = open('mypickle.dat', 'wb')
pickle.dump(data1, output1)
output1.close()
input1 = open('mypickle.dat', 'rb')
data2 = pickle.load(input1)

print data1
print data2
