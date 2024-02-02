# Makefile
CC = gcc -g
CFLAGS = -Wall -Wextra -Werror -std=$(STD) -pedantic
STD = c11

all: main

clean:
	$(RM) main main.o f.o g.o

main: main.o f.o g.o
	$(CC) $(LDFLAGS) $^ -o $@

