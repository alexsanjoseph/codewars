def generate_diagonal(n, l):
    d = [0, 1, 0]
    ls = []
    for i in range(1, l + 1 + n):
        # print(l)
        ls.append(d[1:-1])
        d = [0] + [d[j] + d[j+1]  for j in range(i + 1)] + [0]
    return ([x[n] for x in ls[n:]])
    # return an array containing the numbers in the nth diagonal of Pascal's triangle, to the specified length

