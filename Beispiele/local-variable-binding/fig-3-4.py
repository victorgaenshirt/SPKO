#!/usr/bin/python3
# Scott Fig. 3.4
def p1(a1):
    x = 1

    def p2(a2):
        def p3(a3):
            print("p1({0})->p2({1})->p3({2}):{3}".format(a1,a2,a3,x))

        print("p1({0})->p2({1}):{2}".format(a1,a2,x))
        p3(10)

    def p4(a4):
        def p5(a5):
            x = 2
            print("p1({0})->p4({1})->p5({2}):{3}".format(a1,a4,a5,x))
            p2(20)

        print("p1({0})->p4({1}):{2}".format(a1,a4,x))
        p5(30)

    print("p1({0}):{1}".format(a1,x))
    p2(40)
    print("p1({0}):{1}".format(a1,x))
    p4(50)

p1(60)

