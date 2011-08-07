def p(x):
    strx = str(x)
    lenx = len(strx)
    i = 1
    while i <= lenx/2:
        if strx[i-1] != strx[-i]:
            return "F"
        i += 1
    return "T"

x = 1
count = 0
while x < 10:
    y = x
    i = 0
    go = "T"
    while i < 50 and go == "T":
        print y,
        print "+",
        print str(y)[::-1]
        y += (y + int(str(y)[::-1]))
        if p(y) == "T":
            go = "F"
        i += 1
    if p(y) == "F":
        count += 1
    x += 1
print count
