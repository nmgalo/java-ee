package ge.edu.btu.nika_mgaloblishvili;

public class Currency {

    String currencyName;
    float buy, sell;

    public Currency() {
    }

    public Currency(String currencyName, float buy, float sell) {
        this.currencyName = currencyName;
        this.buy = buy;
        this.sell = sell;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public float getBuy() {
        return buy;
    }

    public void setBuy(float buy) {
        this.buy = buy;
    }

    public float getSell() {
        return sell;
    }

    public void setSell(float sell) {
        this.sell = sell;
    }
}
