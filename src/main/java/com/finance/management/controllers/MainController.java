package com.finance.management.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.finance.management.models.Account;
import com.finance.management.models.TransactionCategory;
import com.finance.management.models.Transactions;
import com.finance.management.models.Account.AccountType;
import com.finance.management.models.Transactions.TransactionType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MainController {
    @GetMapping("/transactions")
    public List<Transactions> getTransactions(){
        List transactionsList = new ArrayList<Transactions>();
        Account account = new Account(AccountType.CHECKINGS, 100.0);
        TransactionCategory category = new TransactionCategory("Groceries");
        Date date = new Date(0);
        Transactions Transaction1 = new Transactions(category, 100.0, date, "Wallmart", account, TransactionType.EXPENSES);
        transactionsList.add(Transaction1);
        return transactionsList;
    }
    public int sumint(int number){
        int path = 0;
        String numPath = String.valueOf(number);
        for (int i = 0; i < numPath.length(); i++) {
            int val = 
             Integer.valueOf(numPath.charAt(i));
            switch (val) {
                case 4:
                case 6:
                case 9:
                    path++;
                    break;
                case 8:
                    path+=2;
                default:
                    break;
            }        
            
        }

        switch (number) {
            case 4:
            case 6:
            case 9:
                path++;
                break;
            case 8:
                path+=2;
            default:
                break;
        }
        return path;
    }
}