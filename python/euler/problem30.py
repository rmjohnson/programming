x = 2
ttotal = 0
while x < 1000000:
    strx = str(x)
    index = 0
    total = 0
    while index < len(strx):
        total += int(strx[index])**5
        index += 1
    if total == x:
        ttotal += x
        print x
    x += 1
print "total:",
print ttotal
