import math

def factors(n):
    factors = 0
    for x in xrange(1, int(math.sqrt(n)+1)):
        if n%x == 0:
            factors += 2
    return factors
    
def triangle(x):
    total = 0
    while x > 0:
        total += x
        x -= 1
    return total

def main():
    x = 1
    while x <= 100000:
        if factors(triangle(x)) > 500:
            return triangle(x)
        x += 1
print main()
