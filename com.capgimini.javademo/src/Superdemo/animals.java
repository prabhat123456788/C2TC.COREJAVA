package Superdemo;

 class Animals{
Animals()
{System.out.println("animal is created");}
 }
 class Dogs extends Animals{
Dogs(){
super();
System.out.println("dog is created");
}
 }
class testSuper3{
public static void main(String args[]) {
Dogs d=new Dogs();	
}
}
