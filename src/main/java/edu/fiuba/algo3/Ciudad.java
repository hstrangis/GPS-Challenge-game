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
                    crearCuadra(matrizMapa[fila][columna - 1], actual, new Este(), new Oeste());
                else {
                    borde = new SinSalida();
                    crearCuadra(borde, actual, new Este(), new Oeste());
                }
                if (fila != 0)
                    crearCuadra(matrizMapa[fila - 1][columna], actual, new Sur(), new Norte());
                else {
                    borde = new SinSalida();
                    crearCuadra(borde, actual, new Sur(), new Norte());
                }
                if (columna == ancho-1) {
                    borde = new SinSalida();
                    crearCuadra(actual, borde, new Este(), new Oeste());
                }
                if (fila == largo-1) {
                    borde = new SinSalida();
                    crearCuadra(actual, borde, new Sur(), new Norte());
                }
            }
        }
    }

    private void crearCuadra(PuntoEstable cruce, PuntoEstable cruceLlegada, Sentido sentido, Sentido sentidoInverso){
        Cuadra cuadra = new Cuadra(cruce, cruceLlegada);
        cruce.agregarCuadra(cuadra, sentido);
        cruceLlegada.agregarCuadra(cuadra, sentidoInverso);
    }

    public void agregarElemento(Elemento elemento, int fila, int columna, Sentido sentido){
        matrizMapa[fila][columna].agregarElemento(elemento, sentido);
    }

    public Cruce puntoPartida(){
        return matrizMapa[0][0];
    }
}
