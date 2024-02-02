// pipe.c
#include <stdio.h>
#include <string.h>
#include <unistd.h>
#include <wait.h>

int main(int argc, char *argv[])
{
    int lhs = 1;
    int rhs = argc;
    for (int i = 2; i < argc; ++i)
    {
        if (strcmp(argv[i], "|") == 0)
        {
            argv[i] = NULL;
            rhs = i + 1;
            break;
        }
    }

    if (argc < 4 || rhs >= argc)
    {
        fprintf(stderr, "Usage: %s command | command\n", argv[0]);
        return 1;
    }

    int fd[2];
    if (pipe(fd) == -1)
    {
        perror("pipe");
        return 1;
    }

    pid_t pid;
    if((pid = fork()) == -1)
    {
        perror("fork");
        return 1;
    }

    if(pid == 0)
    {
        // child process becomes pipe writer
        if (dup2(fd[1], 1) == -1)
        {
            perror("dup2");
            return 1;
        }
        close(fd[0]);
        close(fd[1]);
        if (execvp(argv[lhs], argv + lhs) == -1)
        {
            perror("execvp");
            return 1;
        }
    }

    // parent process becomes pipe reader
    if (dup2(fd[0], 0) == -1)
    {
        perror("dup2");
        return 1;
    }
    close(fd[0]);
    close(fd[1]);
    if (execvp(argv[rhs], argv + rhs) == -1)
    {
        perror("execvp");
        return 1;
    }

    return 1; // never reached
}

