R, M, Y = map(int, input().split())
print(int(M * (1 + R * 0.01) ** Y))