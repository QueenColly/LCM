import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddingList {

    public static void main(String[] args){

        String[ ] colors ={"black","blue","yellow"};
        List<String>view =Arrays.asList(colors);
        view.set(0,"white");
        IO.println(view);
        LinkedList<String> links = new LinkedList<>(view);
        links.add("red");
        IO.println(links);
        String[] copy = links.toArray(new String[0]);
        copy[0] = "pink";
        IO.println(Arrays.toString(copy));
        IO.println(links.getFirst()+ " " + copy.length);
    }
}
