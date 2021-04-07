package ge.edu.btu.nika_mgaloblishvili;

public class ConverterRequest {

    String to;
    float amount;

    public ConverterRequest() {
    }

    public ConverterRequest(String to, float amount) {
        this.to = to;
        this.amount = amount;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
