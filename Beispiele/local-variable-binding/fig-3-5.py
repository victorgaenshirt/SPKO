#!/usr/bin/python3
# Scott Fig. 3.5
def A():
    v = 'a'

    def B():
        v = 'b'

        def C():
            print("C():v={0}".format(v))

        def D():
            print("D():v={0}".format(v))
            C()

        print("B():v={0}".format(v))
        D()

    def E():
        print("E():v={0}".format(v))
        B()

    print("A():v={0}".format(v))
    E()

A()

