k = int(input())
numbers = input().split()
count_1 = 0
count_5 = 0
count_10 = 0
for number in numbers:
    num = int(number)
    if num == 1:
      count_1  += 1
    elif num == 5:
        count_5 += 1
    elif num == 10:
        count_10 += 1
print(count_1)
print(count_5)
print(count_10)