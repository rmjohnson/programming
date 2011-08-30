d = "0"
x = 1
while x <= 1000000:
    d += str(x)
    x += 1

total = int(d[1]) * int(d[10]) * int(d[100]) * int(d[1000]) * int(d[10000]) * int(d[100000]) * int(d[1000000])
print total
