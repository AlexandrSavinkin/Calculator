package CheckClientForCredit;

import java.util.Objects;

public class BankClient {
    public String status;

    public BankClient(String status) {
        this.status = status;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankClient client1 = (BankClient) o;
        return status.equals(client1.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }


}
