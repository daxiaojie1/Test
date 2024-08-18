a = 0
b = 1
print("0, 1, ", end='')
for i in range(45):
    print(a + b, end=', ')
    c = a
    a = b
    b = c + b