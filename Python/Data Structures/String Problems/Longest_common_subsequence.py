#problem statement
#Print the longest common subsequence from given two strings

def lcs(X, Y, m, n):
	L = [[0 for i in range(n+1)] for j in range(m+1)]

	for i in range(m+1):
		for j in range(n+1):
			if i == 0 or j == 0:
				L[i][j] = 0
			elif X[i-1] == Y[j-1]:
				L[i][j] = L[i-1][j-1] + 1
			else:
				L[i][j] = max(L[i-1][j], L[i][j-1])

		# Create a string variable to store the lcs string
	lcs = ""

	# Start from the right-most-bottom-most corner and
	# one by one store characters in lcs[]
	i = m
	j = n
	while i > 0 and j > 0:

		# If current character in X[] and Y are same, then
		# current character is part of LCS
		if X[i-1] == Y[j-1]:
			lcs += X[i-1]
			i -= 1
			j -= 1

		# If not same, then find the larger of two and
		# go in the direction of larger value
		elif L[i-1][j] > L[i][j-1]:
			i -= 1
			
		else:
			j -= 1
	lcs = lcs[::-1]
	print("Longest common subsequence is "  + lcs)


# Driver program
X = input("Enter 1st string: ")
Y = input("Enter 2nd string: ")
m = len(X)
n = len(Y)
lcs(X, Y, m, n)

#output
"""
Enter 1st string: AGGTAB
Enter 2nd string: GXTXAYB
Longest common subsequence is GTAB 
"""




