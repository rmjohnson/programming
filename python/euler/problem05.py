def evenly_divisible(x,y):
    for z in range(1,y):
        if x%z!=0:
            return False
    return True
x = 20
while evenly_divisible(x,20) == False:
    x += 20
print x
