def fib(max):
	nums = [1,2]
	while nums[-1]  < max:
		nums.append(nums[-2] + nums[-1])
	return nums
fibs = fib(4000000)
sum = 0
for i in range(len(fibs)):
	if fibs[i]%2==0:
		sum += fibs[i]		

print sum
