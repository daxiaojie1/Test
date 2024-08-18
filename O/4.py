n = int(input())
sigma = 0
i =0
while i < n:
    i +=1
    sigma += float(input())
print("%d %.5f" % (sigma,sigma / n))