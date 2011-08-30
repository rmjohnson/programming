f = open('triangle.txt','r')
triangle = []
for line in f.readlines():
    triangle.append(line.rstrip('\n').split(' '))

