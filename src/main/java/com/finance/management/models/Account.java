package com.finance.management.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Account {
    private AccountType accountType;
    private double accountAmount;
    public enum AccountType {
        SAVINGS("Savings"),
        CHECKINGS("Checkings");
        @Getter private String accountType;
        private AccountType(String accountType){
            this.accountType = accountType;
        }
        public static AccountType fromString(String text){
            for(AccountType type :  AccountType.values()){
                if(type.accountType.equalsIgnoreCase(text)){
                    return type;
                }
            }
            throw new IllegalArgumentException("No constant found.");
        }
    };
}