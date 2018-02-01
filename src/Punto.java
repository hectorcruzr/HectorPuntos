

public class Punto {
    int x;
    int y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distancia(Punto p) {
        double distancia = Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
        return distancia;
    }

    public void mostrar() {
        System.out.println(x + ":" + y);
    }
}
