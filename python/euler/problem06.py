def sumofsquares(x,y):
    total = 0
    while x <= y:
        total += x**2
        x += 1
    return total
def squareofsums(x,y):
    total = 0
    while x <= y:
        total += x
        x += 1
    return total**2
def difference(x,y):
    return squareofsums(x,y) - sumofsquares(x,y)

print difference(1,100)
