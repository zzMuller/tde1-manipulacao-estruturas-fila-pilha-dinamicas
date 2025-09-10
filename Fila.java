import java.util.Scanner;

public class Fila {

    static class No {
        int valor;
        No prox;
        No(int v) {
            valor = v;
            prox = null;
        }
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

        public void remove() {
            if (frente == null) {
                System.out.println("Fila vazia. Nao ha elemento para remover.");
                return;
            }
            int removido = frente.valor;
            frente = frente.prox;
            if (frente == null) tras = null;
            System.out.println("Elemento removido: " + removido);
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaDinamica fila = new FilaDinamica();

        while (true) {
            System.out.println("\n===== FILA DINAMICA =====");
            System.out.println("1) Inserir");
            System.out.println("2) Remover");
            System.out.println("3) Imprimir");
            System.out.println("0) Sair");
            System.out.print("Escolha: ");
            int op = sc.nextInt();

            if (op == 0) {
                System.out.println("Encerrando...");
                break;
            } else if (op == 1) {
                System.out.print("Valor a inserir: ");
                int x = sc.nextInt();
                fila.insere(x);
                System.out.println("Inserido: " + x);
            } else if (op == 2) {
                fila.remove();
            } else if (op == 3) {
                fila.imprime();
            } else {
                System.out.println("Opcao invalida.");
            }
        }

        sc.close();
    }
}
