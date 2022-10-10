package main

import (
	"fmt"
	"log"
	"math/rand"
	"time"
)

// Tree structure
type Tree struct {
	Left  *Tree
	Value int
	Right *Tree
}

/**
 * While traversing on a binary tree
 */
func traverse(t *Tree) {
	if t == nil {
		return
	}
	traverse(t.Left)
	log.Print(t.Value, "")
	traverse(t.Right)
}

/**
 * Creating a binary tree with random value
 */
func create(n int) *Tree {
	var t *Tree
	// Logic to insert random int value
	rand.Seed(time.Now().Unix())
	for i := 0; i < 2*n; i++ {
		temp := rand.Intn(n * 2)
		// invoking insert function to create form a binary tree
		t = insert(t, temp)
	}
	return t
}

/**
 * Inserting random values in a tree
 */
func insert(t *Tree, v int) *Tree {
	if t == nil {
		return &Tree{nil, v, nil}
	}
	if v == t.Value {
		return t
	}
	if v < t.Value {
		t.Left = insert(t.Left, v)
		return t
	}
	t.Right = insert(t.Right, v)
	return t
}

// Main function invocation
func main() {
	tree := create(30)
	fmt.Println("The value of the root of the tree is", tree.Value)
	traverse(tree)
	fmt.Println()
	tree = insert(tree, -10)
	tree = insert(tree, -2)
	traverse(tree)
	fmt.Println()
	fmt.Println("The value of the root of the tree is", tree.Value)
}
