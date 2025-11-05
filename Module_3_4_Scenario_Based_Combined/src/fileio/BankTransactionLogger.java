package fileio;
import java.io.*;
import java.util.*;

public class BankTransactionLogger {
    public static void appendTransactions(List<String> transactions) {
        try (FileWriter fw = new FileWriter("transactions.log", true)) {
            for (String txn : transactions) {
                fw.write(txn + "\n");
            }
            System.out.println("Transactions appended successfully.");
        } catch (IOException e) {
            System.out.println("Error writing transactions: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> txns = new ArrayList<>();
        txns.add("2025-10-13 09:00: Withdraw $300");
        txns.add("2025-10-13 10:15: Deposit $500");
        appendTransactions(txns);
    }
}