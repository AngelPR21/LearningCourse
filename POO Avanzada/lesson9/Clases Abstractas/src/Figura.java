public abstract class Figura {
    private int lados;

    public Figura(int lados) {
        this.lados = lados;
    }

    public abstract float area();

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }
}