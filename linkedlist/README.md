# Linked List

A linked list is a linear data structure where elements, called nodes, are stored in a sequence.
Each node contains two parts:

#### Data:
The value or information stored in the node.

#### Pointer (Reference):
A reference to the next node in the sequence.

## Types of Linked Lists:
#### 1) Singly Linked List:
Each node points to the next node and the last node points to null.

#### 2) Doubly Linked List:
Each node has two pointers, one pointing to the next node and one pointing to the previous node.

#### 3) Circular Linked List:
The last node points back to the first node, forming a circle.

### Example of a Singly Linked List:
```plaintext
Head -> [Data|Next] -> [Data|Next] -> [Data|Next] -> Null
```


# Arrays

An array is a linear data structure where elements are stored in contiguous memory locations. Each element is accessed by its index.

### Example of an Array:
```plaintext
Index: 0    1    2     3
Data: [10] [20] [30] [40]
```

# Comparison

### 1. Memory Allocation
- **Array:** Contiguous memory allocation. This can lead to inefficient memory usage and difficulties in resizing.
- **Linked List:** Non-contiguous memory allocation. Nodes are scattered in memory and linked using pointers.

### 2. Access Time
- **Array:** Constant time access (O(1)) for reading and writing by index.
- **Linked List:** Linear time access (O(n)) since you need to traverse the list from the head to the desired node.

### 3. Insertion and Deletion
- **Array:** Insertion and deletion can be costly (O(n)) because elements may need to be shifted.
- **Linked List:** Insertion and deletion are generally more efficient (O(1)) if the pointer to the node is known. However, finding the node where insertion or deletion needs to occur takes O(n) time.

### 4. Size
- **Array:** Fixed size (in static arrays) or requires resizing (in dynamic arrays), which can be expensive.
- **Linked List:** Dynamic size, can grow and shrink as needed without expensive resizing operations.

### 5. Memory Usage
- **Array:** Requires less memory overhead because there are no pointers.
- **Linked List:** Requires more memory due to storage of pointers along with data in each node.

### 6. Cache Locality
- **Array:** Better cache performance due to contiguous memory storage.
- **Linked List:** Poor cache performance because nodes are scattered in memory.

# When to Use
- **Array:** When you need fast access by index, have a known fixed size, and memory allocation is not a concern.
- **Linked List:** When you need efficient insertions and deletions, and the size of the data structure may change frequently.


