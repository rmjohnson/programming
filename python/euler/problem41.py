def p(x):
    y = 2
    while y < x:
        if (x % y == 0):
            return "F"
        y += 1
    return "T"

x = ["1","2","3","4","5","6","7","8","9"]
biggest = 0
y = 0
while y < 90:
    index = 0
    while index < len(x)-1:
        xi = x[index]
        xi1 = x[index+1]
        x[index] = xi1
        x[index+1] = xi
        strx = ','.join(x)
        strx = strx.replace(',','')
        intx = int(strx)
        print intx
        if p(intx) == "T":
            if intx > biggest:
                biggest = x
        index += 1
    y += 1
print biggest
"""
x = 100000
biggest = 0
while x < 999999:
    go = "T"
    strx = str(x)
    digits = len(strx)
    digit = digits
    while digit >= 1:
        if str(digit) not in strx:
            go = "F"
        digit -= 1
    if p(x) == "T" and go == "T":
        if x > biggest:
            print x
            biggest = x
    x += 1
print biggest
"""
