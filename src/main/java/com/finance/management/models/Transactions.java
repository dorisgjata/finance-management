package com.finance.management.models;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Transactions{    
    private TransactionCategory transactionCategory;
    private double transactionAmount;
    private Date transactionDate;
    private String transactionOrigin;
    private Account accountType;
    private TransactionType transactionType;
    public enum TransactionType {
        INCOME("Income"),
        EXPENSES("Expense");
        @Getter private String transactionType;
        private TransactionType(String transactionType){
            this.transactionType = transactionType;
        }
        public static TransactionType fromString(String text){
            for(TransactionType type :  TransactionType.values()){
                if(type.transactionType.equalsIgnoreCase(text)){
                    return type;
                }
            }
            throw new IllegalArgumentException("No constant found.");
        }
    };
        

}