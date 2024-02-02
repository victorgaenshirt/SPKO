#!/usr/bin/python3
# Scott Fig. 3.5
def A(p):
    v = 'a'

    def B():
        v = 'b'

        def C():
            print("+A.B.C():p={0},v={1}".format(p,v))
            D()
            print("-A.B.C():p={0},v={1}".format(p,v))

        def D():
            print("+A.B.D():p={0},v={1}".format(p,v))
            E()
            print("-A.B.D():p={0},v={1}".format(p,v))

        print("+A.B():p={0},v={1}".format(p,v))
        C()
        print("-A.B():p={0},v={1}".format(p,v))

    def E():
        p = 2
        print("+A.E():p={0},v={1}".format(p,v))

    print("+A():p={0},v={1}".format(p,v))
    B()
    print("-A():p={0},v={1}".format(p,v))

A(1)

