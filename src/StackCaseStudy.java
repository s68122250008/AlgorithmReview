
import java.util.Stack;

public class StackCaseStudy {

    private static void printStack(Stack<String> stack) {
        if (stack.isEmpty()) {
            System.out.println("(Stack ว่างเปล่า)");
            return;
        }

        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println((i == stack.size() - 1 ? "บนสุด " : "        ") + stack.get(i));
        }
    }

    public static void main(String[] args) {
        Stack<String> commandStack = new Stack<>();

        commandStack.push("Type Data");
        commandStack.push("Type Structure");
        commandStack.push("Delete Structure");
        commandStack.push("Type Algorithm");
        commandStack.push("Type Java");

        System.out.println("สถานะ Stack ");
        printStack(commandStack);

        System.out.println("Undo 2 ครั้ง");
        for (int i = 1; i <= 2; i++) {
            if (!commandStack.isEmpty()) {
                String undoneCommand = commandStack.pop();

                System.out.println("Undo ครั้งที่ " + i + ": ยกเลิกคำสั่ง " + undoneCommand + "");
            } else {
                System.out.println("Undo ครั้งที่ " + i + ": ไม่สามารถ Undo ได้ Stack ว่างแล้ว");
            }
        }

        System.out.println("สถานะ Stack หลังจาก Undo");
        printStack(commandStack);
    }
}