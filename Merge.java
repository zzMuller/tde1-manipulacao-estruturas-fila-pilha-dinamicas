import java.util.Scanner;

public class Merge {

    static class No {
        int valor;
        No prox;
        No(int v) { valor = v; prox = null; }
    }

    static class FilaDinamica {
        private No frente = null;
        private No tras   = null;

        public void insere(int v) {
            No n = new No(v);
            if (frente == null) {
                frente = n;
                tras = n;
            } else {
                tras.prox = n;
                tras = n;
            }
        }

        public int dequeue() {
            if (frente == null) return Integer.MIN_VALUE;
            int v = frente.valor;
            frente = frente.prox;
            if (frente == null) tras = null;
            return v;
        }

        public int peek() {
            if (frente == null) return Integer.MIN_VALUE;
            return frente.valor;
        }

        public boolean vazia() {
            return frente == null;
        }

        public void imprime() {
            if (frente == null) {
                System.out.println("Fila vazia.");
                return;
            }
            System.out.print("Frente -> ");
            No p = frente;
            while (p != null) {
                System.out.print(p.valor);
                if (p.prox != null) System.out.print(" | ");
                p = p.prox;
            }
            System.out.println(" <- Tras");
        }
    }

    static FilaDinamica executa(FilaDinamica A, FilaDinamica B) {
        FilaDinamica C = new FilaDinamica();
        while (!A.vazia() && !B.vazia()) {
            if (A.peek() <= B.peek()) {
                C.insere(A.dequeue());
            } else {
                C.insere(B.dequeue());
            }
        }
        while (!A.vazia()) C.insere(A.dequeue());
        while (!B.vazia()) C.insere(B.dequeue());
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FilaDinamica A = new FilaDinamica();
        FilaDinamica B = new FilaDinamica();

        System.out.print("Quantos elementos em A? ");
        int nA = sc.nextInt();
        System.out.println("Digite os elementos de A em ordem crescente:");
        for (int i = 0; i < nA; i++) A.insere(sc.nextInt());

        System.out.print("Quantos elementos em B? ");
        int nB = sc.nextInt();
        System.out.println("Digite os elementos de B em ordem crescente:");
        for (int i = 0; i < nB; i++) B.insere(sc.nextInt());

        System.out.println("\nFila A:");
        A.imprime();
        System.out.println("Fila B:");
        B.imprime();

        FilaDinamica C = executa(A, B);

        System.out.println("\nFila C (resultado do MERGE):");
        C.imprime();

        sc.close();
    }
}
