# QuickSort Algorithm
The QuickSort algorithm is an efficient sorting algorithm based on the divide and conquer technique.
It works by selecting a **'pivot'** element from the array and partitioning the other elements into two groups:
those less than or equal to the pivot and those greater than the pivot.
The process is then recursively applied to the two subarrays, resulting in a sorted array.

## Algorithm Overview
Choose a pivot element from the array.
Partition the array into two subarrays:
Elements less than or equal to the pivot.
Elements greater than the pivot.
Recursively sort the subarrays.
### Time Complexity
- Best-case: O(n log n)
- Average-case: O(n log n)
- Worst-case: O(n^2)
 
 The time complexity of QuickSort heavily depends on the choice of the pivot element.
 The best and average-case scenarios occur when the pivot is chosen such that it effectively divides the array into two nearly equal-sized subarrays.
 The worst-case scenario occurs when the pivot is chosen in such a way that it repeatedly produces one subarray with n-1 elements and another with 0 elements,
 leading to a time complexity of O(n^2).
 However, various techniques can be employed to optimize the pivot selection,
 such as the "median of three" method, which reduces the likelihood of the worst-case behavior and improves the average-case performance.

### Space Complexity
- Worst-case: O(n)
- Average-case: O(log n)


  The QuickSort algorithm has a space complexity of O(log n) for the average case due to the recursive nature of the algorithm, 
  as it requires additional space for the function call stack.
  The worst-case space complexity is O(n) when the algorithm degenerates to O(n^2) time complexity.

