import java.util.ArrayList;
import java.util.List;

class Bank {
    private final List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalance(int accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder: " + account.getAccountHolderName());
            System.out.println("Balance: Rs." + account.getBalance());
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }

    public void transferAmount(int senderAccount, int receiverAccount, double amount) {
        BankAccount sender = findAccount(senderAccount);
        BankAccount receiver = findAccount(receiverAccount);

        if (sender == null) {
            System.out.println("Sender account not found: " + senderAccount);
            return;
        }
        if (receiver == null) {
            System.out.println("Receiver account not found: " + receiverAccount);
            return;
        }
        if (amount <= 0) {
            System.out.println("Enter a positive amount to transfer.");
            return;
        }

        try {
            sender.withdraw(amount);
            receiver.deposit(amount);
            System.out.println("Amount transferred successfully.");
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void displayAllAccounts() {
        for (BankAccount account : accounts) {
            account.displayDetails();
        }
    }

    private BankAccount findAccount(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}



