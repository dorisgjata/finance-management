package com.finance.management.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.finance.management.models.Account;
import com.finance.management.models.Expenses;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MainController {
    @GetMapping("/expenses")
    public List<Expenses> getExpenses(){
        List expensesList = new ArrayList<Expenses>();
        Account account = new Account("checkings", 1000);
        Date date = new Date(0);
        Expenses expense1 = new Expenses("Grocery Shopping", "Groceries",100, date, "Wallmart", account);
        expensesList.add(expense1);
        return expensesList;
    }
}