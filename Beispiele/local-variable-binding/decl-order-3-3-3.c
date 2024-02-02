// Scott 3.3.3
#include <stdio.h>
int n = 1;

void f() {
    int m = n;
    printf("%d\n", m);
    int n = 2;
    printf("%d\n", n);
}

int main(void) {
    f();
    printf("%d\n", n);
}

