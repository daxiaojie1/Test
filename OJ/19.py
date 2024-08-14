# a1, a2, n = input().split()
# print(int(a1) + (int(a2) - int(a1)) * (int(n) - 1))
#
# a, b = input().split()
# print(int(a) * int(b))
#
# a = input()
# print(2 ** int(a))
import math

# n = int(input())
# if n > 0:
#     print("positive")
# elif n == 0:
#     print("zero")
# else:
#     print("negative")
#
# n =float(input())
# print("%.2f" % abs(n))
# print(f"{abs(n):.2f}")
#
# n = int(input())
# if n % 2:
#     print("odd")
# else:
#     print("even")
#
# import sys
#
# if s := input():
#     n = ord(s)
# else:
#     print('NO')
#     sys.exit()
#
# if n % 2:
#     print('YES')
#     sys.exit()
# print('NO')

# x,y = input().split()
# if int(x) > int(y):
#     print('>')
# elif int(x) == int(y):
#     print('=')
# else:
#     print('<')
#
# n = int(input())
# if (n //10) and not (n // 100):
#     print(1)
# else:
#     print(0)


# n , m = input().split()
# if int(n) >= 10 or int(m) >= 20:
#     print(1)
# else:
#     print(0)

# n = int(input())
# if n % 3 == 0 and n % 5 == 0:
#     print('YES')
# else:
#     print('NO')

# n = int(input())
# b = True
# for i in [3 ,5 ,7]:
#     if not n % i:
#         print(i,end=' ')
#         b = False
# if b:
#     print('n')

n, m = input().split()
if int(n) < 60 or int(m) < 60:
    print(1)
else:
    print(0)

n = int(input())
if 1 - n % 2 + n // 7:
    print('YES')
else:
    print('NO')

n = int(input())
if n > 100:
    print('Bike')
elif n == 100:
    print('All')
else:
    print('Walk')


x = float(input())
if x < 5:
    print("%.3f" % (2.5 - x))
elif x < 10:
    print("%.3f" % (2 - 1.5 * (x - 3) ** 2))
else:
    print("%.3f" % (x / 2 - 1.5))


n , m = input().split()
n = int(n)
money = 8 + 4 * ((n - 1000) // 500)
if n % 500:
    money += 4
if n <= 1000:
    money = 8
if m == 'y':
    money += 5
print(money)

a, b, c = input().split()
if int(b) > int(a):
    a =b
if int(c) > int(a):
    print(c)
else:
    print(a)

a, b, c = input().split()
a = int(a)
b = int(b)
c = int(c)
n = a + b + c
if int(b) > int(a):
    a = b
if int(c) > int(a):
    a = c
if n - a > a:
    print('yes')
else:
    print('no')

n = int(input())
if n % 4 + (n % 100 == 0) + (n % 400 == 0):
    print('N')
else:
    print('Y')

n, m = input().split()
if abs(int(n)) >1 or abs(int(m)) >1:
    print('no')
else:
    print('yes')

a, b, c = input().split()
a = int(a)
b = int(b)
if c == '+':
    print(a + b)
elif c == '-':
    print(a - b)
elif c == '*':
    print(a * b)
elif c == '/' and b:
    print(a / b)
elif c == '/':
    print("Divided by zero!")
else:
    print('Invalid operator!')

import math
a, b, c = input().split()
a = float(a)
b = float(b)
c = float(c)
delta = b ** 2 - 4 * a * c
if delta > 0:
    x1 = (-b + math.sqrt(delta)) / (2 * a)
    x2 = (-b - math.sqrt(delta)) / (2 * a)
    print("x1=%.5f;x2=%.5f" % (x1, x2))
elif delta == 0:
    x1 = -b  / (2 * a)
    print("x1=%.5f;x2=%.5f" % x1 )
else:
    x_Re = -b / (2 * a)
    x_Im = math.sqrt(-delta) / (2 * a)
    print("x1=%.5f + %.5fi;x2=%.5f - %.5fi" % (x_Re, x_Im, x_Re, x_Im))