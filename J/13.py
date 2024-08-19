sum_factorials = 0
n = int(input())
for i in range(1, n + 1):
    factorial = 1
    for j in range(1, i + 1):
        factorial *= j
    sum_factorials += factorial
print(sum_factorials)