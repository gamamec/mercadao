package gf.oracle.programacao;

public class Sacolao {
    // Atributos do estoque
     int maca = 10;
     int uva = 20;
     int pessego = 12;
     int melancia = 3;
     int mamao = 4;

    // Exibe o menu e estoque atual
    public void mostrarMenu() {
        System.out.println("\n=== BEM-VINDO AO SACOLÃO ===");
        System.out.println("Estoque Atual:");
        System.out.println("1. Maçã - " + maca + " unidades");
        System.out.println("2. Uva - " + uva + " unidades");
        System.out.println("3. Pêssego - " + pessego + " unidades");
        System.out.println("4. Melancia - " + melancia + " unidades");
        System.out.println("5. Mamão - " + mamao + " unidades");
        System.out.println("6. Sair");
        System.out.print("Escolha uma fruta para comprar (1 a 6): ");
    }

    // Realiza a compra da fruta usando if/else if
    public void comprar(int opcao, int quantidade) {
        boolean comprado = false;

        if (opcao == 1) {
            if (quantidade <= maca) {
                maca -= quantidade;
                comprado = true;
            }
        } else if (opcao == 2) {
            if (quantidade <= uva) {
                uva -= quantidade;
                comprado = true;
            }
        } else if (opcao == 3) {
            if (quantidade <= pessego) {
                pessego -= quantidade;
                comprado = true;
            }
        } else if (opcao == 4) {
            if (quantidade <= melancia) {
                melancia -= quantidade;
                comprado = true;
            }
        } else if (opcao == 5) {
            if (quantidade <= mamao) {
                mamao -= quantidade;
                comprado = true;
            }
        }

        if (comprado) {
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Estoque insuficiente. Tente uma quantidade menor.");
        }
    }
}
