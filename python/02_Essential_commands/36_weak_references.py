#!/usr/bin/env python2

import weakref
class myobj:
    pass

obj1 = myobj()
obj2 = weakref.ref(obj1)
obj2 is obj1
obj3 = obj2()
obj3 is obj1
del obj1
# obj3 is obj1 # causes error
print obj2()
