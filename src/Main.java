
public class Main {
    public static void main(String a[]) {
        Punto p1 = new Punto(-2, -4);
        Punto p2 = new Punto(3, 2);
        double distancia;
        distancia = p1.distancia(p2);
        System.out.println("coordenadas");
        p1.mostrar();
        p2.mostrar();
        System.out.println("distancia: " + ((double) Math.round(distancia * 100) / 100) + " unidades");
    }
}
