# SucotAviv
Sucot work for school. Two questions about matrix, 2d arrays

## Question 1:
- A cupboard has 81 locker cells
- Every cell has an index ranging from 11-99 correspondingly to the row and collum of the cell
- Every cells has a secrete code
### Write a program that receives a matrix that contains the codes and an index of a cell. The program should return the secret code.

## Question 2:
- 4 Gduds (rows)  x  6 teams each (columns)
- Find the highest value team in each gdud (could be more than one)
- From the highest value of the gduds, print the gdud with the smallest value (again, could be more than one)

  Output example for following matrix (not including row = 0 and column = 0):
  
  
| x | 1 | 2 | 3 | 4 | 5 | 6 |
| --- | --- | --- | --- | --- | --- | ---  |
| 1 | 09 | 15 | 23 | 18 | 15 | 20 |
| 2 | 21 | 23 | 19 | 17 | 34 | 22 |
| 3 | 30 | 28 | 25 | 19 | 20 | 19 |
| 4 | 14 | 16 | 23 | 22 | 21 | 23 |


  (Output):
  
  - Team 3 gdud 1 (Value = 23)
  - Team 3 gdud 4 (Value = 23)
  - Team 6 gdud 4 (Value = 23)

*Important to notice that Team 2 gdud 2 (Value = 23) shouldn't be printed! Beacuse 23 isn't the maximum value for this gdud (row)
