# Homework 2 — Account Validation

## Objective

The objective of this homework is to model a small bank account and verify its business rules using JUnit.

The homework focuses on validating deposits and withdrawals, preventing invalid transactions, and checking the active status of the account based on its balance.

## Implementation and Tasks Completed

The `AccountValidation.java` class was implemented with methods for:

* Depositing money into the account.
* Withdrawing money from the account.
* Checking the current account balance.
* Checking whether the account is active.

The following business rules were implemented:

* Negative deposits are not allowed.
* Negative withdrawals are not allowed.
* Withdrawals greater than the available balance are not allowed.
* The account becomes inactive when the balance falls below `100` after a withdrawal.

The following tasks were completed:

* Tested a valid deposit of `500`.
* Tested a negative deposit using `deposit(-100)`.
* Tested an overdraft by attempting to withdraw more than the available balance.
* Tested that the account becomes inactive when the balance falls below `100`.
* Tested that the account remains active when the balance stays at or above `100`.
* Used JUnit assertions including `assertThrows`, `assertTrue`, and `assertFalse`.
* Completed 5 distinct test cases successfully.

## How to Run

### Run the Code

1. Open the project in NetBeans IDE.
2. Open `AccountValidation.java`.
3. Run the Java project or class.

### Run the Tests

1. Open `AccountValidationTest.java`.
2. Right-click the test file.
3. Select **Test File** to run the JUnit tests.

If the project is configured with Maven, tests can also be run using:

```bash
mvn test
```

## Test Result

The following test cases were completed:

* **TC-01:** `deposit(500)` → Balance `500` — PASS
* **TC-02:** `deposit(-100)` → `IllegalArgumentException` — PASS
* **TC-03:** Withdraw `300` from balance `200` → `IllegalStateException` — PASS
* **TC-04:** Deposit `150`, withdraw `100` → Account inactive — PASS
* **TC-05:** Deposit `500`, withdraw `100` → Account remains active — PASS

**Overall Result: PASS — 5/5 test cases passed.**
