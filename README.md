# Comprehensive_Banking_Project
Welcome to the testing and quality assurance repository for the AngularJS Protractor Banking Project! This project is dedicated to ensuring the robustness and reliability of the AngularJS-based application through a comprehensive testing process.
# Manual Testing
Bug Report: Deposit and Withdrawal Functionality
Issue 1: Deposit Section - Handling Negative Amounts and Zero value
•	Description: The deposit functionality on the website currently allows users to deposit amounts less than or equal to zero, including negative numbers.
•	Impact: Allowing negative or zero deposits can lead to fault financial transactions and may cause discrepancies in the user's account balance. And it did not show any result on the page.
•	Steps to Reproduce:
1.	Navigate to the deposit section on the website.
2.	Enter a negative number or zero as the deposit amount.
3.	Attempt to complete the deposit transaction.
Issue 2: Withdrawal Section - Transaction Failure for Excessive Withdrawals
•	Description: The withdrawal functionality on the website does not prevent users from attempting to withdraw amounts greater than their available balance.
•	Impact: Allowing withdrawals greater than the available balance can lead to misleading information for users, as the transaction fails without providing clear feedback on the reason.
•	Steps to Reproduce:
1.	Navigate to the withdrawal section on the website.
2.	Enter an amount greater than the current account balance.
3.	Attempt to complete the withdrawal transaction.
Expected Behavior:
1.	In the deposit section, the system should validate and reject transactions with negative or zero amounts, providing an appropriate error message to the user.
2.	In the withdrawal section, the system should validate and reject transactions with amounts exceeding the available balance, providing a clear error message explaining the reason for the transaction failure.
Conclusion: Addressing these deposit and withdrawal issues will improve the overall reliability and user experience of the website's financial transactions, preventing potential errors and providing clear feedback to users during the process.
