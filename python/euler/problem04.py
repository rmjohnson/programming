def palindrome(x):
    x = str(x)
    for i in range(len(x)/2):
        if x[i] != x[-i-1]:
            return False
    return True
def palin_multiply(x,y):
    largest = 0
    origy = y
    while x > 99:
        y = origy 
        while y > 99:
            #print x,y
            if palindrome(x*y) and (x*y) > largest:
                largest = (x*y)
            y = y-1
        x = x-1
    return largest

print palin_multiply(1000,1000)
