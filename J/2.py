n = int(input("Enter a number: "))
arr = list(map(int, input().split()))
arr.reverse()
print(' '.join(map(str, arr)) )