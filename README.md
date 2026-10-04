# Leetcode

Решения задач с [LeetCode](https://leetcode.com) на Java. Каждая задача лежит в отдельном пакете: `Solution.java` с решением и `Main.java` для запуска на примерах.

Всего задач: 18.

| Задача | Решение |
|---|---|
| Build Array From Permutation | [`BuildArrayFromPermutation`](src/main/java/BuildArrayFromPermutation) |
| Concatenation Of Array | [`ConcatenationOfArray`](src/main/java/ConcatenationOfArray) |
| Count Square Submatrices With All Ones | [`CountSquareSubmatricesWithAllOnes`](src/main/java/CountSquareSubmatricesWithAllOnes) |
| Final Value Of Var After Perfoming Operations | [`FinalValueOfVarAfterPerfomingOperations`](src/main/java/FinalValueOfVarAfterPerfomingOperations) |
| Find The Minimum Area To Cover All Ones I | [`FindTheMinimumAreaToCoverAllOnesI`](src/main/java/FindTheMinimumAreaToCoverAllOnesI) |
| Find Words Containing Character | [`FindWordsContainingCharacter`](src/main/java/FindWordsContainingCharacter) |
| Largest 3Same Digit Number In String | [`Largest3SameDigitNumberInString`](src/main/java/Largest3SameDigitNumberInString) |
| Largest Triangle Area | [`LargestTriangleArea`](src/main/java/LargestTriangleArea) |
| Minimum Number Of Operations To Move All Balls To Each Box | [`MinimumNumberOfOperationsToMoveAllBallsToEachBox`](src/main/java/MinimumNumberOfOperationsToMoveAllBallsToEachBox) |
| Number Of Good Pairs | [`NumberOfGoodPairs`](src/main/java/NumberOfGoodPairs) |
| Partition Array According To Given Pivot | [`PartitionArrayAccordingToGivenPivot`](src/main/java/PartitionArrayAccordingToGivenPivot) |
| Paskals Triangle | [`PaskalsTriangle`](src/main/java/PaskalsTriangle) |
| Power Of Three | [`PowerOfThree`](src/main/java/PowerOfThree) |
| Power Of Two | [`PowerOfTwo`](src/main/java/PowerOfTwo) |
| Score Of AString | [`ScoreOfAString`](src/main/java/ScoreOfAString) |
| Sum Of All Subset XORTotals | [`SumOfAllSubsetXORTotals`](src/main/java/SumOfAllSubsetXORTotals) |
| Valid Sudoku | [`ValidSudoku`](src/main/java/ValidSudoku) |
| Ways To Express An Integer As Sum Of Powers | [`WaysToExpressAnIntegerAsSumOfPowers`](src/main/java/WaysToExpressAnIntegerAsSumOfPowers) |

## Запуск

Требуется JDK 21+.

```bash
./gradlew build
```

Запуск конкретной задачи: откройте её `Main.java` в IDE или

```bash
./gradlew classes
java -cp build/classes/java/main PowerOfTwo.Main
```
