"""
total = 0
g = 3 #Number of squares on any one side
x = 1
while x < g-1:
    y = g
    while y > 0:
        if x == 1:
            total += y
            print y
        elif (y-1) * (g-1) == 0:
            total += 1
            print 1
        else:
            total += (y-1) * (g-1)
            print (y-1) * (g-1)
        y -= 1
    x += 1
total *= 2
total += 2 * g + 2
print total
"""
def fact(x): return (1 if x==0 else x * fact(x-1))
print fact(40) / fact(20) / fact(20)
#BAH!
