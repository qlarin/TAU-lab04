Given a calculator
When set arguments to 3.14 and 2.07
Then adding should return 5.21

When set arguments to 9.01 and 1.001
Then subtracting should return 8.009

When set arguments to 10.12 and 1.1
Then multiplication should return 11.132

When set arguments to 15.9 and 3
Then division should return 5.3

When set arguments to 10.00090 and 10.00089
Then condition greater should return true

When 15.17 division by 0
Then an exception is thrown
