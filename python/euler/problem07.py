<<<<<<< HEAD
def test_primes(x):
    for y in range(2,int( x**0.5)+1):
        if x%y==0:
            return False
    return True

primes = []
x = 2
while len(primes) < 10001:
    if test_primes(x) == True:
        primes.append(x)
    x += 1
print primes[-1]
=======
def prime(x,y)
>>>>>>> Added project euler problem 7.
