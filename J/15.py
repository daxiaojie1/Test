input_str = input()
char_count = {}
for char in input_str:
    if char in char_count:
        char_count[char] += 1
    else:
        char_count[char] = 1
for char in input_str:
    if char_count[char] == 1:
        print(char)
        break
else:
    print("no")