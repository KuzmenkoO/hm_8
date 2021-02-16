package homeWork8;

public class TestHomeWork {
    public static void main(String[] args) {
        System.out.println("тестуємо myArrayList");
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        for (int i = 1; i <= 5; i++) {
            myArrayList.add(i);
        }
        System.out.println((myArrayList) + "  " + myArrayList.size());
        for (int i = 6; i <= 10; i++) {
            myArrayList.add(i);
        }
        myArrayList.add(100);
        System.out.println(myArrayList + "  " + myArrayList.size());
        for (int i = 11; i <= 15; i++) {
            myArrayList.add(i);
        }
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(15));
        System.out.println(myArrayList + "  " + myArrayList.size());

        System.out.println(myArrayList.size());

        System.out.println(myArrayList.get(21));

        myArrayList.remove(25);

        myArrayList.remove(5);
        System.out.println(myArrayList + "  " + myArrayList.size());
        myArrayList.clear();
        System.out.println(myArrayList);
        System.out.println(myArrayList + "  " + myArrayList.size());


        System.out.println("\nтестуємо MyHashMap");
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
        myHashMap.put(1, "a");
        myHashMap.put(2, "b");
        myHashMap.put(3, "c");
        myHashMap.put(2, "d");
        myHashMap.put(3, "f");
        myHashMap.put(4, "g");
        myHashMap.put(5, "e");

        System.out.println(myHashMap);
        System.out.println("розмір = " + myHashMap.size());

        System.out.println(myHashMap.get(3));

        myHashMap.remove(3);
        System.out.println(myHashMap);
        System.out.println("розмір = " + myHashMap.size());

        myHashMap.remove(1);
        System.out.println(myHashMap);
        System.out.println("розмір = " + myHashMap.size());

        myHashMap.clear();
        System.out.println(myHashMap + "розмір = " + myHashMap.size());


//        System.out.println("\nтестуємо MyLinkedList");
//        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
//        myLinkedList.add("Київ");
//        myLinkedList.add("Львів");
//        myLinkedList.add("Тернопіль");
//        myLinkedList.add("Одеса");
//        System.out.println("розмір створеного LinkedList - " + myLinkedList.size());
//
//        myLinkedList.remove(1);
//
//        System.out.println("розмір LinkedList після видалення елементу - " + myLinkedList.size());
//
//        System.out.println("Отримуємо елементи");
//        System.out.println(myLinkedList.get(0));
//        System.out.println(myLinkedList.get(1));
//        System.out.println(myLinkedList.get(2));
//
//        System.out.println("Тест  - " + myLinkedList.get(10));
//        System.out.println("Тест  - " + myLinkedList.get(-2));
//
//        System.out.println("Видаляємо список, провіряєм розмір");
//        myLinkedList.clear();
//        System.out.println(myLinkedList.get(0));
//        System.out.println(myLinkedList.size());
//
//
//        System.out.println("\nтестуємо MyQueue");
//        MyQueue<String> myQueue = new MyQueue<>();
//        myQueue.add(1);
//        myQueue.add(2);
//        myQueue.add(3);
//        myQueue.add(4);
//        myQueue.add(5);
//        myQueue.add(6);
//        myQueue.add(7);
//        myQueue.add(8);
//        myQueue.add(9);
//        myQueue.add(10);
//        System.out.println(myQueue.toString() + " " + myQueue.size());
//        myQueue.add(11);
//        System.out.println(myQueue.toString() + " " + myQueue.size());
//        myQueue.remove(0);
//        System.out.println(myQueue.peek());
//        System.out.println(myQueue.pull());
//        System.out.println(myQueue.peek());
//        myQueue.add(12);
//        myQueue.add(13);
//        System.out.println(myQueue.toString() + " " + myQueue.size());
//        myQueue.clear();
//        System.out.println(myQueue.toString() + " " + myQueue.size());
//
//
//        System.out.println("\nтестуємо MyStack");
//        MyStack<Integer> stack = new MyStack<>();
//        System.out.println(stack);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        System.out.println(stack.remove(3));
//        stack.push(5);
//        stack.push(6);
//        stack.push(7);
//        System.out.println(stack.remove(3));
//        stack.push(8);
//        stack.push(9);
//        stack.push(10);
//        stack.push(11);
//        stack.push(12);
//        System.out.println(stack);
//        System.out.println(stack.size());
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack);
//        System.out.println(stack.remove(0));
//        System.out.println(stack);
//        System.out.println(stack.clear());
//        System.out.println(stack);
    }
}

