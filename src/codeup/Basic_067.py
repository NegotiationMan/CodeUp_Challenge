n = int(input())

if (n % 2 == 0) and n < 0:
    print("A")

if (n % 2 != 0) and n < 0:
    print("B")

if (n % 2 == 0) and n > 0:
    print("C")

if (n % 2 != 0) and n > 0:
    print("D")