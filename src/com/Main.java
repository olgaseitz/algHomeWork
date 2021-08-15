import java.util.*;

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void print(){
        System.out.println("Работник: " + this.name + "; Зарплата: " + this.salary);
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
}


public class Main {

    public static void main(String[] args) {

        //        Задание 3.1
        //       На основе массива из домашнего задания 2.1 реализуйте простой
        //       список и коллекцию.
        //       Оцените время выполнения преобразования.
        //       Задание 3.2
        //       На основе списка из задания 3.1 реализуйте основные методы
        //       добавления, удаления и получения объекта или элемента из списка.
        //       Оценить выполненные методы с помощью базового класса
        //       System.nanoTime().

        ArrayList<String> mArray = new ArrayList<>();
        ArrayList<String> mArrayCopy = new ArrayList<>(mArray);

        Collections.copy(mArrayCopy, mArray);

        mArray.add("Davidson");
        mArray.add("Smith");
        mArray.add("Johnson");
        mArray.add("Wesson");
        mArray.add("Dyson");
        mArray.add("Bowers");
        mArray.add("Lee");
        mArray.add("Morgan");

        System.out.println("Задания 3.1 и 3.2");
        System.out.println(mArray);

        mArray.add(4,"Johns");
        mArray.add(7, "May");

        System.out.println(mArray);
        System.out.println(mArray.get(2));

        mArray.remove(1);
        mArray.remove("Smith");

        System.out.println(mArray);
        System.out.println("----------");

        ArrayList<Employee> mArrayObj = new ArrayList<>();

        mArrayObj.add(new Employee("Davidson", 100000));
        mArrayObj.add(new Employee("Johnson", 60000));
        mArrayObj.add(new Employee("Wesson", 15000));
        mArrayObj.add(new Employee("Johns", 15000));
        mArrayObj.add(new Employee("Bowers", 30000));
        mArrayObj.add(new Employee("May", 45000));
        mArrayObj.add(new Employee("Lee", 10000));
        mArrayObj.add(new Employee("Morgan", 50000));


        mArrayObj.set(1, new Employee("Smith", 45000));
        mArrayObj.set(5, new Employee("Dyson", 25000));
        mArrayObj.remove(7);
        mArrayObj.remove("Morgan");

        System.out.println(mArrayObj.get(5));
        System.out.println(mArrayObj);
        mArrayObj.get(0);
        for (Employee number : mArrayObj)
        {
            number.print();
            System.out.println(number.getName() + " " + number.getSalary());

        }
        System.out.println("----------");
//       Задание 3.4
//       На основе списка из задания 3.1 реализуйте простой двусторонний
//       список и его базовые методы.
//        Реализуйте список заполненный объектами из вашего класса из задания 3.1

        LinkedList<String> lArray = new LinkedList<>();
        ArrayList<String> lArrayCopy = new ArrayList<>(lArray);

        lArray.add("Davidson");
        lArray.add("Smith");
        lArray.add("Johnson");

        System.out.println("Задание 3.4");
        System.out.println(lArray);

        lArray.add(1, "Wesson");
        lArray.set(2, "Johns");

        System.out.println(lArray);
        System.out.println(lArray.get(2));

        lArray.remove(1);
        lArray.remove("Wesson");

        lArray.addFirst("May");
        lArray.addLast("Lee");

        System.out.println(lArray + "\n");
        System.out.println(lArray.peekFirst() + "\n");
        System.out.println(lArray.peekLast() + "\n");
        System.out.println(lArray.pollFirst() + "\n");
        System.out.println(lArray.pollLast() + "\n");

        System.out.println(lArray + "\n");

        if(lArray.contains("May"))
        {
            System.out.println("Содержит May\n");
        }

        LinkedList<Employee> lArrayObj = new LinkedList<>();

        lArrayObj.add(new Employee("Davidson", 100000));
        lArrayObj.add(new Employee("Smith", 45000));
        lArrayObj.add(new Employee("Johnson", 60000));

        lArrayObj.set(2, new Employee("May", 45000));

        System.out.println(lArrayObj.get(1));
        System.out.println(lArrayObj);
        lArrayObj.get(0);
        for(Employee number : mArrayObj)
        {
            number.print();
            System.out.println(number.getName() + " " + number.getSalary());

        }
        System.out.println("----------");

        //       Задание 3.5
        //       Реализуйте итератор на основе связанных списков из задания 3.4 и
        //       выполните базовые операции итератора.
        //       Оцените время выполнения операций с помощью базового метода
        //       System.nanoTime()

        System.out.println("Задание 3.5");
        System.out.println(lArray.equals(lArrayCopy));
        System.out.println(lArray.hashCode());
        System.out.println(lArray + "\n");

        Iterator<String> iter = lArray.iterator();

        while(iter.hasNext())
        {
            System.out.println(iter.next() + "\n");
            iter.remove();
        }

        System.out.println("Содержимое: " + lArray + "\n");

       // LinkedList<Employee> lArrayObj = new LinkedList<>();

        lArrayObj.add(new Employee("Davidson", 100000));
        lArrayObj.add(new Employee("Smith", 45000));
        lArrayObj.add(new Employee("Johnson", 60000));

        lArrayObj.set(2, new Employee("Dyson", 25000));

        ListIterator<Employee> iter1 = mArrayObj.listIterator();

        while (iter1.hasNext())
        {
            iter1.next();
        }

        Random rand = new Random();

        Employee l;
        while (iter1.hasPrevious())
        {
            l = iter1.previous();
            l.print();
            iter1.set(new Employee("Surname", rand.nextInt(100000)));
        }

        System.out.println("-------------");

        for (Employee number : lArrayObj)
        {
            number.print();
            System.out.println(number.getName() + " " + number.getSalary());
        }

        System.out.println("-----------------");



    }
}










