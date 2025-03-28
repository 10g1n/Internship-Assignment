# Design Choices

## 1. Data Structures
For this project I decided to use the `Map` and the `List` interfaces for processing the inputs. In declaring the Map, I used the **HashMap** class because of its overall good performance when processing data. The time and space complexity of the `.putIfAbsent()` and `.get()` methods is O(1) and O(1) respectively.
Regarding the `List` interface, I used the `ArrayList` class because of its property of dynamically expanding the array. The method that I used is `.add()` (adding elements to the end of the list) which is highly efficient, having a time complexity of O(1). 