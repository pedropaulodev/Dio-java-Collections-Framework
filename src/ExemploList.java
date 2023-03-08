import java.util.*;

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
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

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


        // para trazer um valor de uma posição especifica da lista nos utilizamos o metodo get.
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        //para exibir o menor valor da coleção nos podemos utilizar o metodo min da classe Collections
        // e passar como parametro a nossa propria collection list
        //esta comparação para saber a menor nota é possivel graças a list ser do tipo double, pois dentro de double
        // existe a interface comparable.
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        // analogo ao metodo utilizado acima temos o metodo max da classe Collections
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        /*para fazer a soma dos valores de uma list nós precisaremos utilizar o metodo iterator
        //primeiro criando uma variavel do tipo iterator double que receberá o notas.iterator
        //depois utilizamos o metodo HasNext que basicamente verifica se ainda ha valores dentro da lista
        // de forma sequencial, dessa forma em conjunto com um while ele passará por todos os valores
        //dai dentro do while nos pedimos para que uma variavel receba os valores desse metodo next.
         */
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println("exiba a soma dos valores: "+ soma);

        //para verificar a qtd de elementos de uma list utilizamos o metodo size
        System.out.println("a media dos elementos é "+soma/notas.size());

        //para remover um elemento utilizamos o  metodo remove que pode receber a posição ou o proprio elemento.
        System.out.println("removendo a nota 0 com o objeto");
        notas.remove(0d);

        /* de novo utilizamos o iterator para dizer ao while, enquanto houver proximo (hasNext)
        pegue o proximo iterator1.next e coloque na variavel next.
        depois nos utilizamos um if para verificar se é menor q set, e se for true utilizamos o remove para remover
         */
        System.out.println("remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        //para apagar todos os elementos de uma lista utilizamos o metodo clear.
        System.out.println("apague todos os elementos de uma lista");
        notas.clear();
        System.out.println(notas);

        /*
        ainda temos o metodo notas.isEmpty que nos retorna se a lista esta vazia ou não.
         */
        System.out.println("confira se a lista esta vazia" + notas.isEmpty());
    }

}
