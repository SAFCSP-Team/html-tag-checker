# HTML Tag Checker


## Objective

This project aims to test your knowledge of data structures and algorithms and use it to solve real-life problems.

 
## Problem

A software development company is facing an issue with maintaining the integrity of its HTML files, this project will check the nesting of HTML tags when reading files.
This functionality will ensure that HTML tags in the file are correctly nested, by analyzing the structure of the HTML tags, the checker will identify any incorrect or mismatched nesting.


## Features
* Read the HTML file character by character
* Check the HTML file is correctly nested.
* Check each closing tag it's for the last open tag.
* decide if `<` is used for an open tag `<`, close tag `</`, or comment `<!`.
* retrieve a successful message if the HTML file is correctly nested or the type of error if there is an issue in the file.
  
## Implementation

* Create the `Tag` class and it will have the following properties:
  * tagName: A string representing the HTML tag name.
  * attributes: A list of string arrays, where each array represents an attribute of the HTML tag.

* Create an `HTMLTagChecker` class.
   * Create a function named `CreateTag` that takes a string representing an HTML tag and returns a Tag object, this function should parse the tag string and extract the tag name and its attributes.
   * Create a function named `TagChecker` that takes a tag stack to determine if the file is nested correctly or not by parsing the list of HTML tags.



## Output
```
The HTML file nesting correct
```

## Test Case
1.
```HTML
<html lang="en">
<head>
<title>

</title>
</body>
<body>
      
</body>

```

the output will be 
```
Error: Found mismatched closing tag: </body>
```
it's should be `</head> `instead of `</body>`

2. 
```HTML
<html lang="en">
<head>
<title>

</title>
<body>
      
</body>
</html>
```

the output will be 

```
Error: Not found closing tag: <head>
```

3.
```HTML
<html lang="en">
<head>
<title>

</title>
</head>
</head>
<body>
      
</body>
</html>

```

the output will be 

```
Error: Found additional closing tag: <head>
```

## Qualification to pass

 * The code should run successfully.
 * Write all required functions correctly and logically.
