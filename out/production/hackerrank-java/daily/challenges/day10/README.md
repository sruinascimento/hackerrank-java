# LocalDate

A date without a time-zone in the ISO-8601 calendar system, such as 2007-12-03.
LocalDate is an immutable date-time object that represents a date, often viewed as year-month-day. Other date fields, such as day-of-year, day-of-week and week-of-year, can also be accessed.
<hr>

You are given a date. You just need to write the method, `findDay()`, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

**Example**

```
month = 8
day = 14
year = 2017
```

The method should return `MONDAY`  as the day on that date.

**Function Description**

Complete the findDay function in the editor below.

findDay has the following parameters:

- int: month
- int: day
- int: year

**Returns**

- string: the day of the week in capital letters

**Input Format**

A  single line of input containing the space separated month, day and year, respectively, in **MM DD YYYY**  format.

**Constraints**

- 2000 < year < 3000

**Sample Input**

```
08 05 2015
```

**Sample Output**

```
WEDNESDAY
```

**Explanation**

The day on August 5th 2015 was WEDNESDAY.
