def cascade(n):
	if n < 10:
		print(n)
	else:
		print(n)
		cascade(n//10)
		print(n)

def square(n):
	return n * n

def summation(n, term):
        total, k = 0, 1
        while k <= n:
            total, k = total + term(k), k + 1
        return total

