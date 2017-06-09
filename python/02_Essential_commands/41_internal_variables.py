#!/usr/bin/env python2

class my_class:
    _internal_num = 23
    _nternal_string = "Hello sir"
    def _internal_func():
        print "How did you find me?"
    def regular_func():
        print "You are allowed here"

my_obj = my_class()
print my_obj._internal_num
