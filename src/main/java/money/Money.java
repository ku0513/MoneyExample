package money;

class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

//    abstract Money times(int multiplier);
    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }
    String currency() {
        return currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
            && currency().equals(money.currency());
    }

    public String toString() {
        return amount + " "  + currency;
    }
}
