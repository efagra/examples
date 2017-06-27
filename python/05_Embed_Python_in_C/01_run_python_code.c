// A simple way to run Python code
#include <Python.h>

int main(int argc, char *argv[]) {
  Py_SetProgramName(argv[0]);
  // Initialize the Python interpreter
  Py_Initialize();
  // Run your Python code
  PyRun_SimpleString("from time import time,ctime\n"
                     "print 'Today is',ctime\n");
  // Don't forget to clean up
  Py_Finalize();
  return 0;
}
