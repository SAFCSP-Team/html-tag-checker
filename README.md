# HTML Tag Checker


## Objective

This project aims to test your knowledge of data structures and algorithms and use it to solve real-life problems.

 
## Problem

A software development company is facing an issue with maintaining the integrity of its HTML files, this project will check the nesting of HTML tags when reading files.
This functionality will ensure that HTML tags in the file are correctly nested, by analyzing the structure of the HTML tags, the checker will identify any incorrect or mismatched nesting.


## Features
* Read the HTML file character by character.
* Check the HTML file is correctly nested.
* Check each closing tag that it is for the last opened tag.
* Decide what `<` is used for. An open tag `<`, close tag `</`, or comment `<!`.
* Retrieve a successful message if the HTML file is correctly nested or the type of error if there is an issue in the file.
  
## Implementation

* Implement the `Tag` class with the following properties.
  * `name`: A string representing the HTML tag name.
  * `attributes`: A list of string arrays, where each array represents an HTML tag attribute.

* Implement the `HTMLTagChecker` class.
   * Create a function named `readFile` that reads the file character by character and takes decisions based on the `<` sign.
   * Create a function named `tag` that takes a string representing an HTML tag and returns a Tag object, this function should parse the tag string and extract the tag name and its 
    attributes.
   * Create a function named `check` that checks a stack of tags to determine if the file is nested correctly by parsing the list of HTML tags.



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
4.
```HTML
<html lang="en">
<head>
<title>

</title>
</head>
<body>
      
</body>
</html>
```

the output will be 

```
The HTML file nesting is correct
```

## Qualification to pass

 - [ ] The code should run successfully.
 - [ ] Write all the required functions correctly.
