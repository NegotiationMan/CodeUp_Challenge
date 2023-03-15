n = int(input())
i = 1
sum = 0
while (True):
    if (sum >= n):
        print(i - 1)
        break
    sum += i
    i += 1
