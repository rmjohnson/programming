def multipletest(x,y):
	if(x%y==0):
		return True
	else:
		return False
sum = 0
for x in range(1000):
	if multipletest(x,5) or multipletest(x,3):
		sum += x
print sum 
