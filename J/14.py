input_str = input()
count = 0
for char in input_str:
    if char.isdigit():
        count += 1
print(count)