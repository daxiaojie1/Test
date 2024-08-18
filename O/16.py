import sys
N, K = map(int, input().split())
house_price =200
salary = N
for i in range(19):
    if salary >= house_price:
        print(i + 1)
        sys.exit()
    salary += N
    house_price *= 1 + K / 100
print('Impossible')
