#!/bin/sh
# Testscript notenspiegel-test.sh fasst notenspiegel-in.txt mit Testkommandos zusammen
#   ./notenspiegel < notenspiegel-in.txt > out.txt
#   diff -w out.txt notenspiegel-out.txt

./notenspiegel << eingabeende \
| diff -w - notenspiegel-out.txt \
|| { echo 'Test failed!' ; exit 1 ; } ; echo 'Test succeeded!'
Mathematik_2 23
Mathematik_2 B
Stochastik 17
Programmiertechnik_2 27
Systemprogrammierung 30
Systemprogrammierung B
Rechnerarchitekturen 40
Rechnerarchitekturen N
Rechnerarchitekturen 11
Rechnerarchitekturen X
NN 50
NN N
eingabeende
