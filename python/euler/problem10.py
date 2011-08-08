def test_primes(x):
    if x == 2:
        return True
    if x < 2:
        return False
    if not x & 1:
        return False
    for y in range(3,int(x**0.5)+1,2):
        if x%y==0:
            return False
    return True
total = 0
for x in range(2000000):
    if test_primes(x) == True:
        total += x
print total
