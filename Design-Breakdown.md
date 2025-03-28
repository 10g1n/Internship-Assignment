# Design Choices

## 1. Thought Process
### 1.1 getInput() method
The input of the program is a .txt file, so I used the Scanner class. In the construct initialization, I used `Paths.get()` method to get the path to the file. Additionally, I used a try-with-resources block to catch any exceptions and to ensure that the Scanner class is properly closed after using it.
I also used an ArrayList to store all the words from the input file. Then by using a while-loop, I add all the words to the ArrayList by checking for unnecessary empty spaces.


## 2. Data Structures
For this project I decided to use the `Map` and the `List` interfaces for processing the inputs. In declaring the Map, I used the **HashMap** class because of its overall good performance when processing data, also because I was thinking about storing the data as key-value pairs. The time and space complexity of the `.putIfAbsent()` and `.get()` methods is O(1) and O(1) respectively.
Regarding the `List` interface, I used the `ArrayList` class because of its property of dynamically expanding the array with less memory usage than the `LinkedList`. The method that I used is `.add()` (adding elements to the end of the list) which is highly efficient, having a time complexity of O(1). 
//TODO add more info
