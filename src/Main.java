//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //CRIANDO A STRING
        String texto = "Testar codigo da string";

        //CRIANDO O CONTADOR PARA CONTAR A OCORRENCIA DA LETRA "A" OU "a"
        int contadorString = 0;

        //CRIANDO LAÇO PARA VERIFICAR DENTRO DA STRING texto A OCORRENCIA DA LETRA "A" OU "a"
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'A' || texto.charAt(i) == 'a') {
               contadorString++;
            }
        }
        System.out.println(contadorString);
    }
}