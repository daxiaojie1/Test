n = int(input())
gold, silver, bronze = 0, 0, 0
for i in range(n):
    medals = input().split()
    g, s, b = map(int, medals)
    gold +=g
    silver +=s
    bronze +=b
total_medals = gold + silver + bronze
print(f"{gold} {silver} {bronze} {total_medals}")