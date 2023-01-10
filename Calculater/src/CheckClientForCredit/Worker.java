package CheckClientForCredit;

public class Worker implements BankWorker {

    @Override
    public boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
        if (bankClient.equals("Проблемы с банковской историей")) {
            throw new BadCreditHistoryException();
        } else if (bankClient.equals("Проблемы с законом")) {
            throw new ProblemWithLawException();
        }

        return false;
    }
}
