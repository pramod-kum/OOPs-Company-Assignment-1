## Question 1:

**Write a program that takes as input an array of positive and negative numbers (0 excluded). The objective is to
return those items from the array whose sum is 0. If no such items exist return “No Elements found”**

---

## Example: 
**For an input array [-4, 1, 3, -2, -1],
one of the possible results would be 3, -2, -1 since their sum is 0.
Note: If there are more than 1 combination of such items, you can return any 1 of them.**

---

### Approach

This code is an implementation of a Java program that finds a combination of numbers from an input array that sums up to zero. Here's a step-by-step explanation of the code:

1. The `find` method takes an integer array `arr` as input and returns a `List<Integer>` representing the combination of numbers that sum up to zero.

2. if `ArrayList` will be empty then print "No Elements found".

That's an overview of the provided code. It aims to find a combination of numbers from an input array that sums will be zero.

## Time complexity
The Time complexity of this programm O(n)3.

Therefore, the overall time complexity of the find function is O(n)3, dominated by the exponential growth of the number of combinations.

## Space Complexity
 Both the recursive calls and the output space, the overall space complexity of the given code is O(N).
