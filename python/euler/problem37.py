def p(x):
    i = 2
    while i < x:
        if(x % i == 0):
            return "F"
            break
        i += 1
    if x == 1:
        return "F"
    return "T"

def truncateR(x):
    if p(x) == "F":
        return "F"
    strx = str(x)
    i = 1
    while i < len(strx):
        new = strx[:i-len(strx)]
        if p(int(new)) == "F":
            return "F"
        i += 1
    if p(int(strx)) == "F":
        return "F"
    return "T"

def truncateL(x):
    if p(x) == "F":
        return "F"
    strx = str(x)
    i = 1
    while i < len(strx):
        new = strx[i-len(strx):]
        if p(int(new)) == "F":
            return "F"
        i += 1
    return "T"

total = 0
count = 0
x = 8
while count != 11:
    if truncateL(x) == "T" and truncateR(x) == "T":
        print x
        total += x
        count += 1
    x += 1
print
print total
