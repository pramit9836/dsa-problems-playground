package dsa.problems.stack;

import java.util.ArrayList;

/**
 * @author pramitk
 * @project dsa-problems-playground
 * @date 24/08/24
 */

/**
 * Problem Statement: Design special stack with getmin in O(1) time and O(1) space
 */
public class StackOperationsWithGetMinElement {

    static Integer minElement;
    public static void main(String[] args) {

        int[] elements = {8,10,-2,3,7};
        ArrayList<Integer> stack = new ArrayList<>();

        for (int element : elements) {
            System.out.println("Inserting: "+ element);
            StackOperationsWithGetMinElement.push(element, stack);
        }

        System.out.println("Stack elements: "+ stack.toString());

        while (!stack.isEmpty()) {
            System.out.println("Popped element: "+ StackOperationsWithGetMinElement.pop(stack));
            System.out.println("Current min element: "+ minElement);
        }
    }

    /**
     * Push(x): Insert x at the top of the stack
     *
     * If the stack is empty, insert x into the stack and make minEle equal to x.
     * If the stack is not empty, compare x with minEle. Two cases arise:
     * If x is greater than or equal to minEle, simply insert x.
     * If x is less than minEle, insert (2*x – minEle) into the stack and make minEle equal to x.
     * For example, let the previous minEle be 3. Now we want to insert 2. We update minEle as 2 and insert 2*2 – 3 = 1 into the stack
     */
    public static void push(int currentElement, ArrayList<Integer> stack) {
        if (minElement != null && currentElement < minElement) {
            stack.add((2 * currentElement) - getMinElement());
            System.out.println("Inserted: "+ currentElement);
            minElement = currentElement;
        } else {
            stack.add(currentElement);
            if (stack.size() == 1) {
                minElement = currentElement;
            }
        }
    }

    /**
     * Pop(): Removes an element from the top of the stack
     *
     * Remove the element from the top. Let the removed element be y. Two cases arise:
     * If y is greater than or equal to minEle, the minimum element in the stack is still minEle.
     * If y is less than minEle, the minimum element now becomes (2*minEle – y), so update (minEle = 2*minEle – y). This is where we retrieve the previous minimum from the current minimum and its value in the stack.
     * For example, let the element to be removed be 1 and minEle be 2. We remove 1 and update minEle as 2*2 – 1 = 3
     */
    public static int pop(ArrayList<Integer> stack) {
        int popElement;
        if (minElement != null && stack.get(stack.size()-1) < minElement) {
            popElement = minElement;
            minElement = (2 * minElement) - stack.get(stack.size()-1);
        } else {
            popElement = stack.get(stack.size() - 1);
        }
        stack.remove(stack.size()-1);
        return popElement;
    }

    public static int getMinElement() {
        return minElement;
    }
}
