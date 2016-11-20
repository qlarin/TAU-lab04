Given a calculator
When set arguments to 3 and 2
Then adding should return 5

When set arguments to 9 and 1
Then subtracting should return 8

When set arguments to 10 and 1
Then multiplication should return 10

When set arguments to 15 and 3
Then division should return 5

When set arguments to 10 and 3
Then condition greater should return true

When 15 division by 0
Then an exception is thrown
