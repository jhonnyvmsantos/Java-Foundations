package entities;

public class OutsourceEmployee extends Employee{

    private final Double multiplayer = 1.10;
    private Double additionalCharge;

    public OutsourceEmployee() {
        super();
    }

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getMultiplayer() {
        return multiplayer;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        Double salary = super.payment();
        return salary + (this.additionalCharge * this.multiplayer);
    }
}
