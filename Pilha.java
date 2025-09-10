import java.util.Scanner;

public class Pilha {

    static class No {
        int valor;
        No prox;
        No(int v) {
            valor = v;
            prox = null;
        }
    }

    static class PilhaDinamica {
        private No topo = null;

        public void insere(int v) {
            No n = new No(v);
            n.prox = topo;
            topo = n;
        }

        public void remove() {
            if (topo == null) {
                System.out.println("Pilha vazia. Nao ha elemento para remover.");
                return;
            }
            int removido = topo.valor;
            topo = topo.prox;
            System.out.println("Elemento removido: " + removido);
        }

        public void imprime() {
            if (topo == null) {
                System.out.println("Pilha vazia.");
                return;
            }
            System.out.print("Topo -> ");
            No p = topo;
            while (p != null) {
                System.out.print(p.valor);
                if (p.prox != null) System.out.print(" | ");
                p = p.prox;
            }
            System.out.println(" <- Base");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilhaDinamica pilha = new PilhaDinamica();

        while (true) {
            System.out.println("\n===== PILHA DINAMICA =====");
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
                pilha.insere(x);
                System.out.println("Inserido: " + x);
            } else if (op == 2) {
                pilha.remove();
            } else if (op == 3) {
                pilha.imprime();
            } else {
                System.out.println("Opcao invalida.");
            }
        }

        sc.close();
    }
}
