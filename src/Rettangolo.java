class Rettangolo extends Forma {
    // Attributi per la base e l'altezza del rettangolo
    private double base;
    private double altezza;

    // Costruttore del rettangolo
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    // Override del metodo calcolaArea per calcolare l'area del rettangolo
    @Override
    public void calcolaArea() {
        double area = base * altezza;
        System.out.println("L'area del rettangolo è: " + area);
    }
}