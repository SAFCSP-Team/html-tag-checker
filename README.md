# HTML Tag Checker


## Objective

This project aims to test your knowledge of data structures and algorithms and use it to solve real-life problems.

 
## Problem

The software development company plans to develop a feature for their project that checks the nesting of HTML tags when reading files. This functionality will ensure that HTML tags in the file are correctly nested, by analyzing the structure of the HTML tags, the checker will identify any incorrect or mismatched nesting, providing the company with a reliable tool to maintain the integrity of their HTML files

## Implementation

* Create an HTML file and populate it with HTML tags.
* Create the `TreeNode` class and represent a node in the HTML tree that will have the following properties:
    - `tagName`: A string representing the HTML tag name.
    - `attributes`: A list of string arrays, where each array represents an attribute of the HTML tag.
    - `children`: A list of TreeNode objects representing the children nodes of the current node.
* Create a function named `buildHTMLTree` that takes a list of strings as input. This function will build the HTML tree by parsing the list of HTML tags.
* Create a function named `createNodeFromTag` that takes a string representing an HTML tag and returns a TreeNode object. This function should parse the tag string and extract the tag name and its attributes.
* Create a function named `checkTagNesting` that takes a TreeNode object representing the root of the HTML tree and a `Stack<String>` object to track the tag nesting.
* In the main method, read the contents of the HTML file into a list of strings, then call the `buildHTMLTree` function with the list of lines to build the HTML tree and, call the `checkTagNesting` function with the root node and an empty stack to check if the tag nesting is correct.
* The code will check the correctness of tag nesting and print whether the nesting is correct or not.


## Output
```
Is HTML tag nesting correct? true
```

## Test Case

```HTML
<html lang="en">
<head>
<title>

</title>
</head>
<body>
      
</body>
```

the output will be 
```
Is HTML tag nesting correct? false
```
beacuse the closing `</head>` not included.
## Qualification to pass

 * The code should run successfully.
 * Write all required functions correctly and logically.
