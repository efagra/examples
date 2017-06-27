// You can run a script file
#include <Python.h>

int main(int argc, char *argv[]) {

  FILE *fp;
  Py_Initialize();
  fp = fopen("my_script.py", "r");
  PyRun_SimpleFile(fp, "my_script.py");
  Py_Finalize();
  fclose(fp);
  return 0;

}
