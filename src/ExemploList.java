import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        // como criar lists com generics e diamonds (tipo da lista)
        List<Double> notas = new ArrayList<Double>();

        //o metodo add pode ser utilizado passando uma posição expeficida da array
        // para adicionar o valor ou então passar os valores em ordem de gravação como no exemplo.
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(0.0);
        notas.add(3.6);

        //no metodo list podemos imprimir de formas diferentes, só com a variavel ou com o metodo toString.
        //como utilizamos lista, a impressão sera na ordem que os itens foram inseridos (sequencial)
        System.out.println(notas.toString());

        // para exibir a posição de um elemento dentro da lista utilizamos o metodo indexOf
        // nos passamos um objeto e ele retorna um int que é a posição.
        System.out.println("Exiba a posição da nota 5.0: "+ notas.indexOf(5d));

        //para adicionar um valor a uma posição especifica nos usamos o mesmo add, porem passando a posição e o valor
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        //para substituir um valor por outro nos utilizamos o metodo set que recebe a posição e o valor como parametro.
        //no caso passamos o metodo indexoff para achar a posição de um valor, e depois o valor q o substituirá
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        // o metodo para verificar se ha um valor na lista é o conteins, que te devolve um true ou false se houver ou não o elemento
        System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5d));
    }

}
