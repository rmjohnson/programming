def f(x):
    i = 1
    total = 1
    while i <= x:
        total *= i
        i += 1
    return total

def ncr(n,r):
    result = f(n)/(f(r) * f((n-r)))
    return result

n = 1
count = 0
while n <= 100:
    r = 1
    while r <= n:
        if ncr(n,r) > 1000000:
            count += 1
        r += 1
    n += 1

print count


