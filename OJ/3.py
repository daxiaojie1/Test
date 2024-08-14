num = input().split()
h = int(num[0])
r = int(num[1])
pi = 3.14159


if 20 * 1E3 % (pi * r ** 2 * h) == 0:
    print(int(20 * 1E3 // (pi * r ** 2 * h)))
else:
    print(int(20 * 1E3 // (pi * r ** 2 * h) + 1))