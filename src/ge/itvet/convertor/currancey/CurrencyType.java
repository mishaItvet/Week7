package ge.itvet.convertor.currancey;

public enum CurrencyType {
    USD(1),
    EURO(0.95),
    GEL(3.0),
    DKK(3.4),
    KOW(1000),
    GBP(0.8);

    public double exchange;


    CurrencyType(double exchange) {
        this.exchange = exchange;
    }

    public double getExchange() {
        return exchange;
    }

    public void setExchange(double exchange) {
        this.exchange = exchange;
    }
}
