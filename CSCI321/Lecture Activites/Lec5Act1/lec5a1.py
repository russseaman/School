hashTable = [12,44,13,88,23,94,11,39,20,16,5]

# def hashEqn(x):
#     return ((3 * x) + 5) % 11

def doubleHash(x):
    return((7-x) % 7)

print("KEY\t|\tDoubleHash")

for i in hashTable:
    print(i ,'\t|\t',doubleHash(i))
