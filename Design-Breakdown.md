# Design Choices

## 1. Thought Process
To improve readability, I separated the code into 4 methods: `getInput(filePath)`, `groupAnagrams(input)`, `sortString(str)`,`printGroupedAnagrams(groupedAnagrams)`.

### 1.1 getInput(filePath) method
The input of the program is a .txt file, so I used the Scanner class. In the construct initialization, I used `Paths.get()` method to get the path to the file. Additionally, I used a try-with-resources block to catch any exceptions and to ensure that the Scanner class is properly closed after using it.
I also used an ArrayList to store all the words from the input file. Then by using a while-loop, I added all the words to the ArrayList by checking for unnecessary empty spaces.
### 1.2 groupAnagrams(input) method 
In this method, I sort each string in the file and by using a **HashMap**. I store the sorted string as a key and its anagrams as the value by storing them in an **ArrayList**.
For each word from the input list:
1. I create a new String variable which contains the sorted version of the current string.
2. I use the `putIfAbsent()` method to insert the sorted string into the map with a new ArrayList, if it doesn't already exist.
3. I use the `get()` method to retrieve the existing list and add the current word.
Finally, I sort the values from the map and return the grouped anagrams.
### 1.3 sortString(string) method
The purpose of this method is to generate a **sorted representation of the given string**. I convert the string to a character array, sort it using `Arrays.sort()`, and then convert it back to a string. This sorted string acts as the **unique key** to group anagrams efficiently.
### 1.4 printGroupedAnagrams(groupedAnagrams)
To print all the values in a new line, I chose a for-each loop, which splits the list and prints all the values on a new line.

## 2. Data Structures
For this project, I chose the `Map` and `List` interfaces to efficiently store and manage anagram groups.
- **Map:** I used the `HashMap` class for storing grouped anagrams due to its average **O(1)** complexity for both insertion and retrieval.
- **List:** I chose `ArrayList` to store anagrams because of its efficient append operation (O(1)) and lower memory overhead compared to `LinkedList`.

## 3. Scalability and Performance 
The solution is designed to handle large inputs efficiently. Sorting each word has a time complexity of **O(n log n)**, and storing grouped anagrams in a `HashMap` ensures fast lookups and insertions with **O(1)** complexity. This combination allows the program to handle large datasets with minimal performance degradation.

## 5. Maintainability
The code is designed with maintainability in mind through the following practices:

- **Modular Design:** The code is broken into small, single-purpose methods, making it easy to understand, test, and modify.
- **Clear Method Naming:** Each method name clearly indicates its functionality, improving code readability.
- **Error Handling:** Using try-with-resources ensures proper resource management, reducing the risk of memory leaks.
- **Minimal Code Duplication:** Reusing helper methods (like `sortString()`) avoids repeating code, making the program easier to maintain and extend.
- **Scalable Structure:** The separation of input reading, processing, and output allows for easier modifications, such as changing the input source or formatting the output differently.

## 4. External Libraries
This project does not use any external libraries. All functionality is achieved using the standard Java libraries, which makes the project lightweight and easy to build and run on any system with a JDK.
