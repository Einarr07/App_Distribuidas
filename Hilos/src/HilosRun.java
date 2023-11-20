public class HilosRun implements Runnable {

    private int tipo;

    public HilosRun(int tipo) {
        this.tipo = tipo; // Constructor que recibe el tipo de hilo
    }

    @Override
    public void run() {
        switch (tipo) {
            case 1 -> {
                for (int i = 9; i < 50; i++) {
                    System.out.println(i); // Imprimir números del 1 al 29
                }
            }
            case 2 -> {

                for (char k = 'a'; k < 'z'; k++) {
                    System.out.println(k);
                }
            }
        }
    }
}