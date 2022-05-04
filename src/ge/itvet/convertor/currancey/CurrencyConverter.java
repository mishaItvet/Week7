package ge.itvet.convertor.currancey;

import ge.itvet.convertor.AnotherConvertable;
import ge.itvet.convertor.Convertable;

public class CurrencyConverter implements Convertable {
    private Currency currency;
    private CurrencyType type;

    public CurrencyConverter(Currency currency, CurrencyType type) {
        this.currency = currency;
        this.type = type;
    }

    @Override
    public void convert() {
        if (currency.getType() == type) {
            return;
        }
        double convertToUSD = convertToUSD(currency.getAmount(), currency.getType());
        double convertFromUSD = convertFromUSD(convertToUSD, type);
        currency.setAmount(convertFromUSD);
        currency.setType(type);

    }

    private double convertToUSD(double x, CurrencyType type) {
        return x / type.exchange;


    }

    private double convertFromUSD(double x, CurrencyType type) {
        return x * type.exchange;
    }
}
