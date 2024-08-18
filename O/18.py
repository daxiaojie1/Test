
N = int(input())

numbers = list(map(int, input().split()))

m = int(input())

count = sum(1 for num in numbers if num == m)

print(count)