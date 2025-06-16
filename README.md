# 🔍 Hash Table & 🌳 Binary Search Tree

**Subject:** Algorithms and Data Structures  
**Student:** Ayazbek Abdanur  

## 📌 Project Description

This project is the third assignment in the Algorithms and Data Structures course. It consists of two core parts:

1. **Custom Hash Table** (`MyHashTable<K, V>`) implementation using chaining to resolve collisions.
2. **Binary Search Tree (BST)** implementation (`BST<K, V>`) with support for insertion, deletion, and in-order traversal through a custom iterator.

The purpose of this assignment was to gain deeper insight into how fundamental data structures function internally by building them from scratch without relying on Java’s built-in collections.

## 💡 Features

### ✅ MyHashTable
- Custom implementation of a generic hash table.
- Collision handling via linked list chaining.
- Custom key class with manually defined `hashCode()` method.
- Supports `put()`, `get()`, `remove()`, and `contains()` methods.
- Bucket distribution analyzer with `printBucketSizes()`.

### ✅ BST (Binary Search Tree)
- Generic implementation using key-value pairs.
- Full support for:
  - `put()`, `get()`, and `delete()`
  - `size()` tracking
  - In-order traversal via iterator
- Iterator provides access to both keys and values:
  ```java
  for (var node : tree) {
      System.out.println("key is " + node.getKey() + " and value is " + node.getValue());
  }
  ```

## 📦 Technologies

* Language: **Java**
* Version Control: **Git & GitHub**
* IDE: **IntelliJ IDEA**
* Testing: Manual testing through custom `Main` and `Test` classes

## 🚀 How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/MnstrsParago/ADS.ASG3.HT_BST
   cd ADS.ASG3.HT_BST
   ```

2. Open the project in IntelliJ IDEA or any Java IDE of your choice.

3. Run the following classes:

   * `Main.java` – Demonstrates the hash table functionality with 10,000 entries.
   * `BSTTest.java` – Demonstrates all BST operations and in-order traversal.

## 📘 Reflection

This assignment helped me understand how abstract data structures like hash tables and binary trees are implemented and managed internally. It was particularly interesting to work on balancing the hash function manually to achieve uniform distribution across the buckets. Also, implementing in-order traversal and iterator support in BST without relying on Java Collections was a rewarding experience. Overall, this project enhanced both my algorithmic thinking and practical coding skills.
