package CheckClientForCredit;

public class Main {
    public static void main(String[] args) throws BadCreditHistoryException, ProblemWithLawException {
        BankClient client1 = new BankClient("Проблемы с банковской историей");
        BankClient client2 = new BankClient("Проблемы с законом");
        BankClient client3 = new BankClient("Норм");
        Worker worker = new Worker();
        System.out.println(getCreditForClient(worker, client1) + "\n"); //true

        System.out.println(getCreditForClient(worker, client2) + "\n"); //false

        System.out.println(getCreditForClient(worker, client3) + "\n"); // "Проблемы с банковской историей" false


    }

    public static boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
        try {
            bankWorker.checkClientForCredit(bankClient);

        } catch (BadCreditHistoryException e) {
            System.out.println("Проблемы с банковской историей");
            return false;
        } catch (ProblemWithLawException ignored) {
            return false;
        }
        return bankWorker.checkClientForCredit(bankClient);
    }


}


