def p(n): #Prime Finder
    if n < 0:
        n *= -1
    for x in range(2, int(n**0.5)+1):
        if int(n) % x == 0:
            return "F"
    return "T"
def listsum(l):
    sum = 0
    for i in range(len(l)):
       sum += l[i]
    return sum

big = 0
high = 0
consecutive = []
x = 0
while x < 100:
    if p(x) == "T":
        if p(listsum(consecutive) + x) == "T":
            consecutive.append(x)
        else:
            if len(consecutive) > big:
                    high = listsum(consecutive)
                    print consecutive
            consecutive = [x]
    x+= 1
print high 
    
