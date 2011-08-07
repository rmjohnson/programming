def ptest(x):
    y = 2
    while y < x**0.5:
        if x%y==0:
            return False
        y += 1
    return True
def prime_factor(x):
    y = 2
    pfactors = []
    while y < x**0.5:
        if x%y==0 and ptest(y) == True:
            pfactors.append(y)
        y += 1
    return pfactors
print prime_factor(600851475143)[-1]
