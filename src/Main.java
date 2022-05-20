import java.util.*;

public class Main {
    public static void main(String[] args) {

        String input = "!raceCAR?";
        System.out.println(palindrome(input));
    }

    public static boolean palindrome(String input){
        if(input.isBlank()) return false;

        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
        StringBuilder buildStack = new StringBuilder();
        StringBuilder buildQueue = new StringBuilder();

        for(int i = 0; i < input.length(); i++){
            char s = input.toLowerCase().charAt(i);
            if(s >='a' && s<= 'z') {
                stack.push(s);
                queue.add(s);
            }
        }

        while(!stack.isEmpty() && !queue.isEmpty()){
            buildStack.append(stack.pop());
            buildQueue.append(queue.remove());
        }

        return buildQueue.toString().equals(buildStack.toString());
    }
}
