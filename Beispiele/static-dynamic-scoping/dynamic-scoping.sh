#!/bin/sh
# Beispielprogramm zu Folie 4-11/12/13

f()
{
  n=1  # welches n?
}

g()
{
  local n=0
  f
}

n=2
f
echo -n $n  # 2 oder 1?
n=3
g
echo -n $n  # 3 oder 1?

