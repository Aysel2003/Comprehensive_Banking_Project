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
### User Story 1: Customer Login 
As a customer, I want to easily log in to the XYZ website using my unique credentials. This will allow me to access personalized features and make the overall user experience more convenient.
### User Story 2: Character Selection
As a customer, I want the ability to specifically select "Hermione Granger" from the drop-down menu after successfully logging into the XYZ website.
### User Story 3: Transaction Details
As Hermione Granger, I want to access a dedicated page on the XYZ website that provides options such as transactions, deposits, and withdrawals after selecting my character. Additionally, I want to click on the "Transactions" option and view a detailed list that includes information like date, amount, and more.
### User Story 4: Deposit
As Hermione Granger, I want to have a straightforward process to deposit funds on the XYZ website. I want to click on the "Deposit" option, be prompted to enter a value for the deposit, and then proceed to complete the deposit.
### User Story 5: WithDrawl
As Hermione Granger, I want a seamless process to withdraw funds on the XYZ website. I want to click on the "Withdrawal" option, be prompted to enter a value for the withdrawal, and then proceed to complete the withdrawal.
### User Story 6: Bank Manager Login
As a bank manager, I want to access the XYZ website with ease using my designated bank manager credentials. Once logged in, I expect to see options such as "Add Customer," "Open Account," and "Customers" to efficiently manage and oversee banking operations.
### User Story 7: Add Customers 
As a bank manager, I want to efficiently add new customers to the XYZ bank system. I expect to click on the "Add Customer" option, be prompted to enter essential details such as first name, last name, and post code, and then click the "Add Customer" button to successfully record the customer information.
### User Story 8: Open an account
As a bank manager, I want to efficiently open new accounts for customers on the XYZ website. I expect to click on the "Open Account" option, be prompted to select a customer name and currency from drop-down menus, and then click the "Process" button to successfully open the account.
### User Story 9: Customer Details
As a bank manager, I want to efficiently view and manage customer information on the XYZ website. I expect to click on the "Customers" option and see a comprehensive list that includes customer details such as first name, last name, and post code.
### User Story 10: Delete Customer
As a bank manager, I want to efficiently manage customer records on the XYZ website. I expect to click on the "Customers" option, view a list of all customers, and have the ability to delete a customer by clicking the "Delete" button next to their name.
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

## Conclusion
We've got all bases covered in testing for the AngularJS Protractor Banking Project. Automated tests make things quick and reliable, manual testing dives into the details, and load performance testing ensures the app stands strong even during busy times.
This testing combo is our secret sauce for crafting a robust and user-friendly project. Together, we're ensuring every aspect is solid, reliable, and ready for prime time.
