def tri(n):
    result = n * (n+1)/2
    return result

def pen(n):
    result = n * (3 * n-1)/2
    return result

def hexa(n):
    result = n * (2 * n-1)
    return result

triangles = []
n = 1
while n < 80000:
    triangles.append(tri(n))
    n += 1
print triangles[-1]

pentagons = []
n = 1
while n < 46200:
    pentagons.append(pen(n))
    n += 1
print pentagons[-1]

hexagons = []
n = 1
while n < 40001:
    hexagons.append(hexa(n))
    n += 1
print hexagons[-1]

x = 285
while x < len(hexagons):
    print hexagons[x]
    if hexagons[x] in triangles and hexagons[x] in pentagons:
        print "SOLUTION:",
        print hexagons[x]
        break
    x += 1
print x

