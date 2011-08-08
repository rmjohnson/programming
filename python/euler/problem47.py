def pcheck(x):
    if x < 2:
        return False
    if x == 2:
        return True
    for y in range(3,int(x**0.5)+1,2):
        if x&y==0:
            return False
    return True
def find_factors(x):
    y = 2
    factors = []
    while x > 2:
        if x%y==0:
            factors.append(y)
            x = x/y
        else:
            y += 1
    return factors
def pfactors(x):
    factors = find_factors(x)
    for i in range(len(factors)):
        if pcheck(factors[i]) == False:
            return False
        if factors.count(factors[i]) > 1:
            return False
    return True

for x in range(10000000):
    if pfactors(x) == True and len(find_factors(x)) == 4:
        if pfactors(x+1) == True and len(find_factors(x+1)) == 4:
            if pfactors(x+2) == True and len(find_factors(x+2)) == 4:
                if pfactors(x+3) == True and len(find_factors(x+3)) == 4:
                    print x
    print x
