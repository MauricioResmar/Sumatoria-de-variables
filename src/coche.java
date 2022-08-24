public class coche {
    public static void main(String[] args)
    {
        int numpuertas=4;

        int micoche = addpuerta(numpuertas);
        System.out.println("El coche tiene:" + " " + micoche + " " + "Puertas");
    }
    public static int addpuerta (int puertas)
    {
        int resultado = puertas+1;
        return resultado;
    }

}
