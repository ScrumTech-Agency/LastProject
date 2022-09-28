package com.ciclo3.TodoCompleto.Service;

import java.util.List;

public interface TrasnsactionManagerInterface {
    public List<Transaction> getTransactions();
    public Transaction getTransaction(Long id) throws Exception;
    public String setTransaction (Transaction Transactions) throws Exception;
    public Transaction UpdateTransactionAll(Transaction TransactionUpdate, Long id) throws Exception;
    public Transaction UpdateTransaction(Transaction TransactionUpdate, Long id) throws Exception;
    public String DeleteTransaction(Long id) throws Exception;
}
