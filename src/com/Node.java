//       Задание 3.3
//       Реализуйте простой односвязный список и его базовые методы.

class Node
{
    private int data;
    private Node link;

    public Node(int mydata)
    {
        data = mydata;
        link = null;
    }

    public void display()
    {
        System.out.print(data + " -> ");
        if(link != null)
        {
            link.display();
        }
        else
        {
            System.out.println("\n" + "-------------------");
        }
    }

    public void insert(int mydata)
    {
        if(link == null)
        {
            link = new Node(mydata);
        }
        else
        {
            link.insert(mydata);
        }
    }
}

class LinkList
{
    public static void main(String args[])
    {
        Node node = new Node(7);
        node.insert(4);
        node.insert(12);
        node.insert(6);
        node.insert(5);
        node.display();
    }

}
