def prime(n):
    for x in range(2, int(int(n)**0.5)+1):
        if int(n) % x == 0:
            return "F"
    return "T"
def perm(x,y,z):
    i = 0
    x = str(x)
    y = str(y)
    z = str(z)
    correct = 0
    while i < len(x):
        if x[i] in y and x[i] in z:
            correct += 1
        else:
            break
        i += 1
    i = 0
    while i < len(y):
        if y[i] in x and y[i] in z:
            correct += 1
        else:
            break
        i += 1
    i = 0
    while i < len(z):
        if z[i] in x and z[i] in y:
            correct += 1
        else:
            break
        i += 1
    if correct == len(x) + len(y) + len(z):
        return "T"
    else:
        return "F"

increase = 1000
answer = ""
go = "T"
while go == "T":
    x = 1000
    while x + increase * 2 < 9999:
        y = x + increase
        z = y + increase
        if perm(x,y,z) == "T" and prime(x) == "T" and prime(y) == "T" and prime(z) == "T":
            if x != 1487 or increase != 3330:
                answer = str(x) + str(y) + str(z)
                go = "F"
                break
        x += 1
    if increase > 8999:
        go = "F"
    if increase % 1000 == 0:
        print increase
    increase += 1
print
print "SOLUTION:",
print answer
