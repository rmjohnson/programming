def t(p):
    a = 1
    count = 0
    while a < p:
        b = 1
        while b < p:
            if (a ** 2 + b ** 2) ** 0.5 + a + b == p:
                count += 1
                #print a,
                #print b
            b += 1
        a += 1
    return count/2

biggest = 0
for x in range(1000):
    if t(x) > biggest:
        biggest = x
    print x
print biggest

