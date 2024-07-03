# Queue Data Structure

A queue is a fundamental data structure in computer science that follows the First In, First Out (FIFO) principle.
This means that the first element added to the queue will be the first one to be removed.

This characteristic makes queues particularly useful in scenarios where order needs to be preserved,
such as in
 - scheduling and managing tasks,
 - buffering data, and handling asynchronous data processing.

### Operations 
- #### Enqueue: Adding element to the rear of thr queue.
- #### Dequeue: Removes the element from the front of the queue.
- #### Peek/Front: Returns the element at the front of the queue without removing it. 

### Types of Queues
- ####  Linear Queue:
```plaintext
A simple, linear representation where elements are added to the end and removed from the beginning.
```
- #### Circular Queue:
```plaintext
A more efficient form where the end of the queue wraps around to the beginning, forming a circle.
This avoids the problem of unused spaces in a linear queue.
```
- #### Priority Queue:
```plaintext
Elements are dequeued based on the priority rather than order.
Each element has a prioritiy, and the element with the highest priority is dequeued first.
```
- #### Double-Ended Queue (Deque):
```plaintext
Allows insertation and removal od the elements from both the front and the rear.
```


