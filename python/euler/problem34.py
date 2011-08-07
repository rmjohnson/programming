def f(x):
    i = 1
    total = 1
    while i <= x:
        total *= i
        i += 1
    return total

x = 3
ttotal = 0
while x < 50000:
    strx = str(x)
    index = 0
    total = 0
    while index < len(strx):
        digit = int(strx[index])
        total += f(digit)
        index += 1
    if x == total:
        ttotal += x
        print x
    x += 1
print "total:",
print ttotal
