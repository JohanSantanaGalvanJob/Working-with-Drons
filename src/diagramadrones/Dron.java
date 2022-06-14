package diagramadrones;

import java.util.ArrayList;

public class Dron {

    int x; //posición x
    int y; //posición y
    int z; //altura del dron

    double a;
    double b;

    //Esquina superior izquierda.
    double x1;
    double y1;

    //esquina superior derecha
    double x2;
    double y2;

    //esquina inferior izquierda.
    double x3;
    double y3;

    //esquina inferior derecha
    double x4;
    double y4;

    public Dron(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = 1.5 * z;
        this.b = (9 * this.a) / 16;
        //Esquina superior izquierda.
        this.x1 = x - (a / 2);
        this.y1 = y + (b / 2);

        //esquina superior derecha
        this.x2 = x + (a / 2);
        this.y2 = y + (b / 2);

        //esquina inferior izquierda.
        this.x3 = x - (a / 2);
        this.y3 = y - (b / 2);

        //esquina inferior derecha
        this.x4 = x + (a / 2);
        this.y4 = y - (b / 2);
    }

    public Double superficie() {
        return a * b;
    }

    public boolean solapada(ArrayList<Dron> drones) {

        for (int i = 0; i < drones.size(); i++) {

            //Esquina superior izquierda
            if (drones.get(i).x >= this.x && drones.get(i).y <= this.y) {
                if (drones.get(i).x1 < this.x4 && drones.get(i).y1 > this.y4) {
                    return true;
                }
            }
            //esquina superior derecha
            if (drones.get(i).x <= this.x && drones.get(i).y <= this.y) {
                if (drones.get(i).x2 > this.x3 && drones.get(i).y2 > this.y3) {
                    return true;
                }
            }
            //Esquina inferior izquierda
            if (drones.get(i).x >= this.x && drones.get(i).y >= this.y) {
                if (drones.get(i).x3 < this.x2 && drones.get(i).y3 < this.y2) {
                    return true;
                }
            }
            //Esquina inferior derecha.
            if (drones.get(i).x <= this.x && drones.get(i).y >= this.y) {
                if (drones.get(i).x4 > this.x1 && drones.get(i).y4 < this.y1) {
                    return true;
                }
            }

        }

        return false;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public double getX3() {
        return x3;
    }

    public double getY3() {
        return y3;
    }

    public double getX4() {
        return x4;
    }

    public double getY4() {
        return y4;
    }

}
