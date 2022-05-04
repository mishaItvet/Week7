package ge.itvet.convertor.currancey;

public class Currency {
    private double amount;
    private CurrencyType type;

    public Currency(double amount, CurrencyType type) {
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public CurrencyType getType() {
        return type;
    }

    public void setType(CurrencyType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "amount=" + amount +
                ", type=" + type +
                '}';
    }
}
