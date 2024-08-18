m,n = map(int,input().split())
sigma = 0
for i in range(m + 1 - m % 2, n + 1, 2):
    sigma += i
print(sigma)