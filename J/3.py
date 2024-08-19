n = int(input())
ages = list(map(int, input().split()))
bili1, bili2, bili3, bili4 = 0, 0, 0, 0
for age in ages:
    if age <= 18:
        bili1 += 1
    elif age <= 35:
        bili2 += 1
    elif age <= 60:
        bili3 += 1
    else:
        bili4 += 1
print(f"{bili1 / n * 100:.2f}%")
print(f"{bili2 / n * 100:.2f}%")
print(f"{bili3 / n  * 100:.2f}%")
print(f"{bili4 / n  * 100 :.2f}%")