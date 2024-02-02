// scopes.c
#include <stdio.h>
int n = 1;

void f() {
    int m = n;
    printf("%p:%d\n", (void*) &m, m);
    int n = 2;
    printf("%p:%d\n", (void*) &n, n);
    for (int i = 3; i < 4; ++i) {
        printf("%p:%d\n", (void*) &n, n);
        printf("%p:%d\n", (void*) &i, i);
        int n = 4;
        printf("%p:%d\n", (void*) &n, n);
    }
    for (int i = 5; i < 6; ++i) {
        printf("%p:%d\n", (void*) &i, i);
        int n = 6;
        printf("%p:%d\n", (void*) &n, n);
    }
}

int main(void) {
    f();
    printf("%p:%d\n", (void*) &n, n);
}

