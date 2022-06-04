package edu.fiuba.algo3;

public class Ciudad {
    private Cruce[][] matrizMapa;

    Ciudad(int largo, int ancho) {
        crearMapa(largo, ancho);
    }

    private void crearMapa(int largo, int ancho) {
        Cruce actual;
        SinSalida borde;
        matrizMapa = new Cruce[largo][ancho];
        for (int fila = 0; fila < largo; fila++) {
            for (int columna = 0; columna < ancho; columna++) {
                actual = new Cruce();
                matrizMapa[fila][columna] = actual;
                if (columna != 0)
                    crearCuadra(matrizMapa[fila][columna - 1], actual, 2, 0);
                else {
                    borde = new SinSalida();
                    crearCuadra(borde, actual, 2, 0);
                }
                if (fila != 0)
                    crearCuadra(matrizMapa[fila - 1][columna], actual, 3, 1);
                else {
                    borde = new SinSalida();
                    crearCuadra(borde, actual, 3, 1);
                }
                if (columna == ancho-1) {
                    borde = new SinSalida();
                    crearCuadra(borde, actual, 0, 2);
                }
                if (fila == largo-1) {
                    borde = new SinSalida();
                    crearCuadra(borde, actual, 1, 3);

                }
            }
        }
    }

    private void crearCuadra(PuntoEstable cruce, PuntoEstable cruceLlegada, int direccion, int direccionInversa){
        Cuadra cuadra = new Cuadra(cruce, cruceLlegada);
        cruce.agregarCuadra(cuadra, direccion);
        cruceLlegada.agregarCuadra(cuadra, direccionInversa);
    }


    public void colocarElementos(){}

    public Cruce puntoPartida(){
        return matrizMapa[0][0];
    }


}
