def p(n):
    if n < 0:
        n *= -1
    for x in range(2, int(n**0.5)+1):
        if int(n) % x == 0:
            return "F"
    return "T"

a = -999
biggesta = 0
biggestb = 0
biggest = 0
while a < 1000:
    b = -999
    while b < 1000:
        n = 0
        count = 0
        while p(n**2 + a * n + b) == "T":
            count += 1
            n += 1
        if count > biggest:
            #print "a=",
            #print a
            #print "b=",
            #print b
            #print "biggest=",
            #print biggest
            biggesta = a
            biggestb = b
            biggest = count
        b += 1
    print a,
    a += 1
print
print
print "A,B: ",
print str(biggesta) + "," + str(biggestb)
print "SOLUTION: ",
print biggesta * biggestb


