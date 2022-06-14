package diagramadrones;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class DiagramaDrones {

    public static void SVG() {
        try {
            String ruta = "C:\\Users\\Johan\\Desktop\\sos.svg";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            String cadena = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n";
            cadena += "<!DOCTYPE svg>\n";
            cadena += "<svg width=\"1500px\" height=\"1500px\" xmlns=\"http://www.w3.org/2000/svg\">\n";
            for (Dron d : drones) {
                cadena += "  <polygon points=\"" + d.getX1() + "," + d.getY1() + " "
                        + d.getX2() + "," + d.getY2() + " "
                        + d.getX4() + "," + d.getY4() + " "
                        + d.getX3() + "," + d.getY3()
                        + "\" stroke=\"black\" stroke-width=\"0.5\" fill=\"none\"/>\n";
            }
            cadena += "</svg>";
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(cadena);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int azar(int limite) {
        return (int) Math.floor(Math.random() * limite);
    }

    static ArrayList<Dron> drones = new ArrayList();

    public static void main(String[] args) {

        int a = 0;
        int areaTotal = 0;
        do {
            Dron D = new Dron(azar(1000), azar(1000), azar(80) + 20);
            if (D.solapada(drones) == false) {
                drones.add(D);
                areaTotal += drones.get(a).superficie();
                System.out.println("DRON " + a);
                System.out.println("Posiciones: " + drones.get(a).getX() + " - " + drones.get(a).getY() + " - " + drones.get(a).getZ());
                System.out.println("A y B: " + drones.get(a).getA() + " - " + drones.get(a).getB());
                System.out.println("Vértices X: " + drones.get(a).getX1() + " - " + drones.get(a).getX2() + " - " + drones.get(a).getX3() + " - " + drones.get(a).getX4());
                System.out.println("Vértices Y: " + drones.get(a).getY1() + " - " + drones.get(a).getY2() + " - " + drones.get(a).getY3() + " - " + drones.get(a).getY4());
                System.out.println("-------------------------------------------------");
                a++;
            }

        } while (drones.size() < 100);
        System.out.println("El área total es: " + areaTotal);
        SVG();
    }

}
