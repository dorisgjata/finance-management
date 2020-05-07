package com.finance.management.models;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Expenses{
    private String expenseName;
    private String expensecategory;
    private double expenseAmount;
    private Date spentDate;
    private String payee;
    private Account accountType;
}