#!/usr/bin/env python2

my_func = lambda x: x*x

import thread

my_thread = thread.start_new_thread(my_func, (1,))
print my_thread

