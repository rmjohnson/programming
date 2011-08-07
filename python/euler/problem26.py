from decimal import *
getcontext()
getcontext().prec=100
def frac(n):
    getcontext().prec = 10000
    d = Decimal(1) / Decimal(n)
    sd = str(d)
    sd = sd.lstrip('0.')
    count = 0
    i = 1
    if len(sd) == 1:
        return 1
    while sd[0:i] != sd[i+1:2*i+1] and sd[1:i] != sd[i+1:2*i+1]:
        if i > len(sd):
            return sd
        count += 1
        i += 1
    count += 2
    return sd

print frac(24)

"""
x = 10
biggest = 0
xbiggest = 0
while x < 1000:
    if frac(x) > biggest:
        biggest = frac(x)
        xbiggest = x
    print x,
    print ",",
    print frac(x)
    x += 1
print "SOLUTION:",
print biggest,
print ",",
print xbiggest
"""
