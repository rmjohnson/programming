def p(n):
    if n < 0:
        n *= -1
    for x in range(2, int(n**0.5)+1):
        if int(n) % x == 0:
            return "F"
    return "T"

while x < 100:
    consecutive = []
    
