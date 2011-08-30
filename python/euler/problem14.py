def even(n):
    n = n/2
    return n

def odd(n):
    n = 3*n+1
    return n

def main():
    x = 0
    biggest = 0
    n = 0
    for y in range(1000000):
        z = x
        count = 0
        while z > 1:
            if z%2==0:
                z = even(z)
            else:
                z = odd(z)
            count += 1
        if count > biggest:
            print biggest
            biggest = count
            n = x
        x += 1
    print "Answer:",
    print n
    print biggest
main()
