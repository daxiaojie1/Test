N, m = map(int, input().split())
numbers = map(int, input().split())
count_m = 0
for number in numbers:
    num = int(number)
    if num == m:
      count_m  += 1
print(count_m)