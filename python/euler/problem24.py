"""x = 123456789
count = 0
while 1 == 1:
    strx = str(x)
    if len(strx) == 9:
        strx = "0" + strx
    if "0" in strx and "1" in strx and "2" in strx and "3" in strx and "4" in strx and "5" in strx and "6" in strx and "7" in strx and "8" in strx and "9" in strx:
        count += 1
        print strx
    if count == 1000000:
        print x
        break
    x += 1
"""
def fact(k, n):
	f = []
	for j in range(1, n + 1):
		f.append(k % j)
		k /= j
	return f[::-1]

def change(f):
	tmp = []
	for i in f:
		tmp.append(i + 1)
	for i in range(len(tmp) - 1, -1, -1):
		for j in range(i + 1, len(tmp)):
			if (tmp[j] >= tmp[i]):
				tmp[j] += 1
	for i in range(0, len(tmp)):
		tmp[i] -= 1
	return tmp
