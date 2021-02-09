package com.finance.management.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class TransactionCategory {
    @NonNull
    String transactionCategory;
    TransactionCategory fromCategory;
}