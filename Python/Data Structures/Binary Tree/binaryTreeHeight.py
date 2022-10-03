#Problem statement
#Write a program to find the height of a binary tree



# A binary tree node
class Node:

	# create a new node
	def __init__(self, data):
		self.data = data
		self.left = None
		self.right = None
    
def maxDepth(node):
	if node is None:
		return 0

	else:

		# Compute the depth of each subtree
		left_Depth = maxDepth(node.left)
		right_Depth = maxDepth(node.right)

		# Use the larger one
		if (left_Depth > right_Depth):
			return left_Depth+1
		else:
			return right_Depth+1


# Driver program to test above function
root = Node(1)
root.right = Node(2)
root.left = Node(3)
root.right.right = Node(4)
root.right.left = Node(5)


print("Height of tree is %d" % (maxDepth(root)))


#Output
# Height of tree is 3

