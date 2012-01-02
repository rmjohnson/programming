for x in range (40):
    halves.append(int(math.floor((5*(x))/2)))
    
halves[0] = 1

for x in range (40):
    total += halves[x]
    print total

print "move on to 10's"

for y in range(20):
    for x in range (2*y +1):
        total += halves[x]
        print total
        
print "move on to 20's"

for z in range(10):
    for y in range(2*z+1):
        for x in range (2*y +1):
            total += halves[x]
            print total
            
for p in range(4):            
    for z in range(10):
        for y in range(2*z+1):
            for x in range (2*y +1):
                total += halves[x]
                print total
