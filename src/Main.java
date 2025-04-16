// Main.java
public class Main {
    public static void main(String[] args) {
        Time timeA = new Time("Mulherada do FC", "Batalha da Conquista");
        Jogadora jogadoraA = new Jogadora("Ana", 22, "Atacante", 9);

        timeA.cadastrar();          // Chamando método da interface
        jogadoraA.cadastrar();      // Chamando método da interface

        timeA.adicionarJogadora(jogadoraA);
    }
}
