#!/usr/bin/env python2

import shelve
myshelf = shelve.open('myshelf.dat')
myshelf['1'] = 'a'
myshelf['2'] = 'b'
myshelf.keys()
myshelf.close()
# myshelf.keys() # causes error
