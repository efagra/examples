#!/bin/sh

mkdir tmp_virtual_env
virtualenv tmp_virtual_env
. ./tmp_virtual_env/bin/activate
which python
deactivate
rm -rf tmp_virtual_env

