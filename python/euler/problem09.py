def py_check(a,b,c):
    if a**2 + b**2 == c**2:
        return True
    else:
        return False
for a in range(500):
    for b in range(500):
        if py_check(a,b,1000-a-b) == True:
            print a*b*(1000-a-b)
