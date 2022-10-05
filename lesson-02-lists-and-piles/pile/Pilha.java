import java.util.LinkedList;

public class Pilha{
    private LinkedList<String> items = new LinkedList<String>();

    public void empilha(String s){
        items.addLast(s);
    }

    public String desempilha(){
        return items.removeLast();
    }

    public int getTamanho(){
        return items.size();
    }

    public LinkedList<String> getItems(){
        return new LinkedList<String>(items);
    }
}