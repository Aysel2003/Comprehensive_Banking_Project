# Comprehensive_Banking_Project
Welcome to the testing and quality assurance repository for the AngularJS Protractor Banking Project! This project is dedicated to ensuring the robustness and reliability of the AngularJS-based application through a comprehensive testing process.
## Manual Testing
Bug Report: Deposit and Withdrawal Functionality
### Issue 1: Deposit Section - Handling Negative Amounts and Zero value
•	Description: The deposit functionality on the website currently allows users to deposit amounts less than or equal to zero, including negative numbers.

•	Impact: Allowing negative or zero deposits can lead to fault financial transactions and may cause discrepancies in the user's account balance. And it did not show any result on the page.
Steps to Reproduce:
1.	Navigate to the deposit section on the website.
2.	Enter a negative number or zero as the deposit amount.
3.	Attempt to complete the deposit transaction.

### Issue 2: Withdrawal Section - Transaction Failure for Excessive Withdrawals
•	Description: The withdrawal functionality on the website does not prevent users from attempting to withdraw amounts greater than their available balance.

•	Impact: Allowing withdrawals greater than the available balance can lead to misleading information for users, as the transaction fails without providing clear feedback on the reason.
Steps to Reproduce:
1.	Navigate to the withdrawal section on the website.
2.	Enter an amount greater than the current account balance.
3.	Attempt to complete the withdrawal transaction.
### Expected Behavior:
1.	In the deposit section, the system should validate and reject transactions with negative or zero amounts, providing an appropriate error message to the user.
2.	In the withdrawal section, the system should validate and reject transactions with amounts exceeding the available balance, providing a clear error message explaining the reason for the transaction failure.
### Conclusion
Addressing these deposit and withdrawal issues will improve the overall reliability and user experience of the website's financial transactions, preventing potential errors and providing clear feedback to users during the process.
## JIRA UserStories
## Load Performance Testing on JMETER
1.Main-Page
 ![Main_Page](https://github.com/Aysel2003/Comprehensive_Banking_Project/assets/151445499/f5df8bbd-878b-4093-a850-3ebd219f7924)

2.Customer-Login
 ![Customer_Login](https://github.com/Aysel2003/Comprehensive_Banking_Project/assets/151445499/20ddd6e7-dc7c-4256-b41e-f52f1f58a79e)

3.Deposit-Withdrawl
 ![Deposit_Withdrawl](https://github.com/Aysel2003/Comprehensive_Banking_Project/assets/151445499/431d3689-1f2d-4ba8-a2ab-7d6daef84d43)

4.Transactions
 ![Transactions](https://github.com/Aysel2003/Comprehensive_Banking_Project/assets/151445499/b4d18661-f80e-4159-8e42-cdff7c96e1aa)

5.Bank-Manager
 ![Bank_Manager](https://github.com/Aysel2003/Comprehensive_Banking_Project/assets/151445499/89ce2dd0-9e32-4f65-b8de-2b0dfaac0c52)

6.Add-Customers
 ![Add_Customer](https://github.com/Aysel2003/Comprehensive_Banking_Project/assets/151445499/6c1d89cd-2fab-456b-be17-de7947e6972b)

7.Open-Account
 ![Open_Account](https://github.com/Aysel2003/Comprehensive_Banking_Project/assets/151445499/2494342f-e0c8-4250-a933-f3940e9bff2c)

8.Customers
 ![Customers](https://github.com/Aysel2003/Comprehensive_Banking_Project/assets/151445499/c07deab4-af81-4c80-844d-124fdcdfb46c)

9.View-Results-Tree
 ![View_Results_Tree](https://github.com/Aysel2003/Comprehensive_Banking_Project/assets/151445499/7eaa7a52-5643-41be-8eae-db0f527c6a96)

10.Summary-Report
 ![Summary_Report](https://github.com/Aysel2003/Comprehensive_Banking_Project/assets/151445499/0fe68a34-8c97-4502-ab5f-0c5ac8e9178b)

11.Graph-Results 
![Graph_Results](https://github.com/Aysel2003/Comprehensive_Banking_Project/assets/151445499/63fb664e-0c2f-4fc9-a0f8-d50757d38182)

