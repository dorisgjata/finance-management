package com.finance.management;

import com.finance.management.controllers.MainController;
import com.finance.management.models.Account;
import com.finance.management.models.TransactionCategory;
import com.finance.management.models.Transactions;
import com.finance.management.models.Account.AccountType;
import com.finance.management.models.Transactions.TransactionType;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
class FinanceManagementApplicationTests {
	@Autowired 
	MainController mainController;
	@Autowired
	private MockMvc mvc;

	@Test
	void contextLoads() throws Exception{
		Assertions.assertNotNull(mainController);
	}
	@Test
	public void getExpenses(){
		List transactionsList = new ArrayList<Transactions>();
        Account account = new Account(AccountType.CHECKINGS, 100.0);
        TransactionCategory category = new TransactionCategory("Groceries");
        Date date = new Date(0);
        Transactions Transaction1 = new Transactions(category, 100.0, date, "Wallmart", account, TransactionType.EXPENSES);
        transactionsList.add(Transaction1);
       
	}

}
