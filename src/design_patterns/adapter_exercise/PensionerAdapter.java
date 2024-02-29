package design_patterns.adapter_exercise;

public class PensionerAdapter {
    private final Pensioner pensioner;

    public PensionerAdapter(Pensioner pensioner) {
        this.pensioner = pensioner;
    }

    public String toString() {
        return pensioner.getInfo();
    }
}
