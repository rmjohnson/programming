def tri(n):
    result = n * (n+1)/2
    return result
triangles = []
n = 1
while n < 80000:
    triangles.append(tri(n))
    n += 1

d = {"a":1, "b":2, "c":3, "d":4, "e":5, "f":6, "g":7, "h":8, "i":9, "j":10, "k":11, "l":12, "m":13, "n":14, "o":15, "p":16, "q":17, "r":18, "s":19, "t":20, "u":21, "v":22, "w":23, "x":24, "y":25, "z":26}

f = open("words.txt","r")
strf = f.read()
listf = strf.split("\",\"")

x = 0
count = 0
while x < len(listf):
    word = str(listf[x])
    wordval = 0
    y = 0
    while y < len(word):
        wordval += d[word[y].lower()]
        y += 1
    if wordval in triangles:
        count += 1
    x += 1

print count
