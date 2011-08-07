def simplify(x,y):
    z = y
    while z > 1:
        if x % z == 0 and y % z == 0:
            return x/z, y/z
            break
        z -= 1
    return "F"

total = 0
x = 1
while x < 100:
    y = 1
    while y < 100:
        z = 1
        if simplify(x,y) != "F" and simplify(x,y) != (1,1):
            simpley = simplify(x,y)[1]
            simplex = simplify(x,y)[0]
            while simpley * z < y:
                if (str(simplex * z)[0] in str(x) or str(simplex * z)[-1] in str(x)) and (str(simpley * z)[0] in str(y) or str(simpley * z)[-1] in str(y)) and ("0" not in str(x) or "0" not in str(y)):
                    print simplex * z, simpley * z
                    print x,y
                    total *= y
                    break
                z += 1
        y += 1
    x += 1
print total
