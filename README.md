gregorian-leap-year
-------------------

shows leap year(s)

Getting Started
---------------

```
gradle build
```

usage
-----

1. By default, leap years from the year 1 AD to current year will be shown.

`gradle run`

2. With one argument, ditermination if the year is a leap year will be shown.

`gradle run --args="2000"`

3. With two arguments, this will be find leap years within the given arguments.

`gradle run --args="1800 2020"`

-> leap years from year 1800 AD to year 2020 will be shown.

4. With illegal arguments, it works by default.

`gradle run --args="aaa bbb"`

-> same as `gradle run`

`gradle run --args="100 200 300"`

-> same as `gradle run`