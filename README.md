# HTML Tag Checker


## Objective

This project aims to test your knowledge of data structures and algorithms and use it to solve real-life problems.

 
## Problem

A software development company is facing an issue maintaining its HTML files’ integrity. 
This project will check the nesting of HTML tags when reading files. This functionality will ensure that HTML tags in the file are correctly nested, by analyzing the structure of the HTML tags, the checker will identify any incorrect or mismatched nesting.


## Features
* Read the HTML file character by character
* Check the HTML file is correctly nested.
* Check each closing tag it's for the last open tag.
* decide if `<` is used for an open tag `<`, close tag `</`, or comment `<!`.
* retrieve a successful message if the HTML file is correctly nested or the type of error if there is an issue in the file.
  
## Implementation

* Create the `Tag` class and represent a tag in the HTML that will have the following properties:
      * tagName: A string representing the HTML tag name.
      * attributes: A list of string arrays, where each array represents an attribute of the HTML tag.
      * children: A list of Tags objects representing the nested tags of the current tag.


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

It means there is an issue with the tag nesting, the closing `</head>` does not exist.
## Qualification to pass

 * The code should run successfully.
 * Write all required functions correctly and logically.
