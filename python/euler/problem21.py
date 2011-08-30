x = 1
total = 0
amicables = []
while (x <= 10000):
    dtotal = 0
    dttotal = 0
    y = 1
    if x not in amicables:
        while y < x:
            if(x % y == 0):
                dtotal += y
            y += 1
        y = 1
        while y < dtotal:
            if(dtotal % y == 0):
                dttotal += y
            y += 1
        if dttotal ==  x:
            if dtotal != x:
                total += (dtotal + x)
                print x
                amicables.append(dtotal)
    x += 1
print "total:",
print total
