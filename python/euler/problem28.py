goupby = 3
x = 1
total = 1
while x < 501:
    y = 0
    while y < 4:
        total += goupby
        print goupby
        goupby += 2 * x
        y += 1
    goupby += 2
    x += 1
print total
