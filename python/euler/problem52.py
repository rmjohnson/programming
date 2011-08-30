def strtolist(x):
    result = []
    i = 0
    while i < len(x):
        result.append(x[i])
        i += 1
    return result
x = 1
go = "t"
limit = 10000000000000
while go == "t":
    x1 = strtolist(str(1 * x))
    x2 = strtolist(str(2 * x))
    x3 = strtolist(str(3 * x))
    x4 = strtolist(str(4 * x))
    x5 = strtolist(str(5 * x))
    x6 = strtolist(str(6 * x))

    i = 0
    correctdigits = 0
    if x % 100000 == 0:
        print x
    if len(x1) == len(x6):    
        while i < len(x6):
            if x6[i] in x5 and x6[i] in x4 and x6[i] in x3 and x6[i] in x2 and x6[i] in x1:
                correctdigits += 1
                i += 1
            if correctdigits < i+1:
                break
        
    if correctdigits > len(x6):
        print
        print "SOLUTION:",
        print x
        go = "f"
    x += 1
    if x >= limit:
        go = "f"

    
