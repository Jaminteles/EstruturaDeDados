package Lista1;
import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] perguntas = {"Telefonou para a vítima?", "Esteve no local do crime?", "Mora perto da vítima?", "Devia para a vítima?", "Já trabalhou com a vítima?"};
        int qntSim = 0;
        String Situacao;

        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            String resposta = sc.nextLine();
            if (Objects.equals(resposta, "Sim")) {
                qntSim++;
            }
        }

        switch (qntSim) {
            case 0, 1:
                Situacao = "Inocente";
                break;
            case 2:
                Situacao = "Suspeito";
                break;
            case 3, 4:
                Situacao = "Cúmplice";
                break;
            case 5:
                Situacao = "Assassino";
                break;
        }
    }
}
