import java.util.*;

public class Helloworld implements List{

  public static void main(String []args)
  {
    Scanner console=new Scanner(System.in);
    List<String> a= new ArrayList<>(5);
    String greeting;
    System.out.println("Enter 5 ways to say hi:");
    for(int i=0;i<5;i++){
      greeting=console.next();
      System.out.println(greeting);
      a.add(i,greeting);
      System.out.print("Hello World"); }
      System.out.println("Now add one more:");
      greeting=console.next();
      a.add(greeting);
      System.out.println("Now let's move through the list.");
      Iterator<String> b=a.iterator;
     while (b.hasNext()){
       int i=1;
       System.out.println(a.get(i)+ " is the greeting at spot "+ i);
       }}
    }