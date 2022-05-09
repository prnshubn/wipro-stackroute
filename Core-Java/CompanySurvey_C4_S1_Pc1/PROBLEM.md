## Practice Statement - Company Survey

**A survey is being undertaken by a company and they want to find the average age of their employees.
The age data shared with the HR team is in a raw format. Help the team to find the average age of the employees.
Write a program, that takes the raw data as input and calculates the average age of the employees.**

Note :
- The raw data is in the form of an array, a string array of age values.
- If the age data has alphabets and letters handle the exception appropriately.


#### Sample Input :
    String ageArray = {"35","26","32","44"}

#### Expected Output:
    Average Age = "34.25"

#### Sample Input :
    String ageArray = {"35","twenty six","32","44"}

#### Expected Output:
    java.lang.NumberFormatException: For input string: "twenty six"
