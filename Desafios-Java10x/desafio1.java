public class desafio1 {
    public static void main(String[] args) {
        /*

        Desafio 1 - Criar um programa que represente três ninjas da vila da folha de Naruto e suas
        respectivas missões.
        Cada ninja tem um nome, idade e missão atribuida a ele, com o nome da missão, nível da
        dificuldade e status de conclusão.
        Caso o ninja tenha menos que 15 anos, ele só pode concluir missões C ou D, ninjas com 15
        anos ou mais podem concluir qualquer nível.

         */

        String ninja1 = "Naruto";
        String ninja2 = "Sasuke";
        String ninja3 = "Kakashi";

        int idadeNinja1 = 14;
        int idadeNinja2 = 15;
        int idadeNinja3 = 27;

        char nivelMissao1 = 'B';
        char nivelMissao2 = 'D';
        char nivelMissao3 = 'A';

        String missao1 = "B - Patrulha ao redor da vila";
        String missao2 = "D - Busca de plantas medicinais na floresta";
        String missao3 = "A - Investigar assassinato em uma região próxima";

        System.out.printf("\nNinja: %s\nIdade: %d\nMissão: %s\n", ninja1, idadeNinja1, missao1);
        System.out.print("Status: ");
            if (idadeNinja1 < 15){
                if(nivelMissao1 == 'C' || nivelMissao1 == 'D'){
                    System.out.println("Missão concluída com sucesso!");
                }
                else {
                    System.out.println("Ninja não pode concluir a missão designada pela restrição da sua idade");
                }
            }
            else{
                System.out.println("Missão concluída com sucesso!");
            }

        System.out.println("---------------------------------");

        System.out.printf("\nNinja: %s\nIdade: %d\nMissão: %s\n", ninja2, idadeNinja2, missao2);
        System.out.print("Status: ");
        if (idadeNinja2 < 15){
            if(nivelMissao2 == 'C' || nivelMissao2 == 'D'){
                System.out.println("Missão concluída com sucesso!");
            }
            else {
                System.out.println("Ninja não pode concluir a missão designada pela restrição da sua idade");
            }
        }
        else{
            System.out.println("Missão concluída com sucesso!");
        }

        System.out.println("---------------------------------");

        System.out.printf("\nNinja: %s\nIdade: %d\nMissão: %s\n", ninja3, idadeNinja3, missao3);
        System.out.print("Status: ");
        if (idadeNinja3 < 15){
            if(nivelMissao3 == 'C' || nivelMissao3 == 'D'){
                System.out.println("Missão concluída com sucesso!");
            }
            else {
                System.out.println("Ninja não pode concluir a missão designada pela restrição da sua idade");
            }
        }
        else{
            System.out.println("Missão concluída com sucesso!");
        }
    }
}
