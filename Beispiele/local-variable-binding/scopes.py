#!/usr/bin/python3
# Schleife definiert keinen Scope (nur Funktionen und Klassen)
n = 1;

def f():
    # m = n
    n = 2 # verdeckt globales n
    print(n)
    for i in range(3,4):
        n = i # kein neues n
        print(n)
    for i in range(5,6):
        n = i # kein neues n
        print(n)
    print(n)

f()
print(n)

