threshold = float(input())
dna1 = input().strip()
dna2 = input().strip()

if len(dna1) != len(dna2):
    print("Error")
    exit()

same_base_pairs = 0
for i in range(len(dna1)):
    if dna1[i] == dna2[i]:
        same_base_pairs += 1

same_ratio = same_base_pairs / len(dna1)

if same_ratio >= threshold:
    print("yes")
else:
    print("no")