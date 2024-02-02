// g.c
#include "g.h"
//#include "f.h"
#include <stdio.h>

static void f() {
    printf("g::f\n");
}

void g() {
    printf("g::g\n");
    f();
}

