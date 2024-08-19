s = input()
s1 = ""
for i in range(len(s) - 1):
    s1 += chr(ord(s[i]) + ord(s[i+1]))
s1 += chr(ord(s[-1]) + ord(s[0]))
print(s1)