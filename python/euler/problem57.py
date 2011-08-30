x = "1 + 1/2"
y = "(2 + 1/2)"
i = 1
while i <= 1000:
    z = 1
    while z < i:
        x = x.strip("2" + (")" * i))
        x += y + (")" * i)
        z += 1
    i += 1
    print x
