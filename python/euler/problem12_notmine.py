import math
def factors(n):
    factors = 0
    for x in xrange(1, int(math.sqrt(n)+1)):
        if n%x == 0:
            factors += 2
    return factors
   
def get_answers():
    a = 0
    triangle = 0
    while True:
        a += 1
        triangle += a
        if factors(triangle) > 500:
            return triangle
            False
print get_answers()
