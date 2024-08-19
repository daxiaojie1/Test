s = input()
if s[0].isdigit():
    print("no")
else:
    if all(char.isalnum() or char == '_' for char in s):
        print("yes")
    else:
        print("no")
