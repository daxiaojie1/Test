m,n = map(int,input().split())
sigma = 0
for i in range(m , n + 1):
    if i % 17 == 0:
        sigma += i
print(sigma)