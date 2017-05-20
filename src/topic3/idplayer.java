package topic3;
import java.util.ArrayList;
public class idplayer {
  public int trophy1;
  public int trophy2;
  public int trophy3;
  public String cln1;
  public String cln2;
  public String cln3;
 
  public void cln1(){
    int a = 4000;
    int b = 3000;
    int c = 3300;
    int d = 3100;
    trophy1 = a+b+c+d;
   
   ArrayList<Player> j5 = new ArrayList<Player>();
   j5.add(new Player("_______________________________________\n"));
   j5.add(new Player("DragonSlayer\t\t="+a));
   j5.add("new Player("xXxPssySl4y3rxXx\t="+c));
   j5.add("new Player("Heslignign\t\t="+d));
   j5.add("new Player("CykaBlade\t\t="+b));
   j5.add("new Player("Jumlah Trophy\t\t="+trophy1));
   for(Player i: j5){
   System.out.println(i.getId());
   }
 }
 publicvoid cln2(){
   int a = 3200;
    int b = 3300;
    int c = 3250;
    int d = 3400;
    trophy2 = a+b+c+d;
   
   ArrayList<Player> j6 = new ArrayList<Player>();
   j6.add(new Player("_______________________________________\n"));
   j6.add(new Player("Chum         ="+a));
   j6.add("new Player("Sponge      ="+c));
   j6.add("new Player("Star        ="+d));
   j6.add("new Player("Squirrel    ="+b));
   j6.add("new Player("Jumlah Trophy\t\t="+trophy2));
   for(Player i: j6){
   System.out.println(i.getId());
   }
 }
 public void cln3(){         
    int a = 3350;
    int b = 3000;
    int c = 3900;
    int d = 3650;
    trophy3 = a+b+c+d;
   
   ArrayList<Player> j7 = new ArrayList<Player>();
   j7.add(new Player("_______________________________________\n"));
   j7.add(new Player("DragonFire        ="+a));
   j7.add("new Player("Patrick          ="+c));
   j7.add("new Player("Earth            ="+d));
   j7.add("new Player("Thunder          ="+b));
   j7.add("new Player("Jumlah Trophy\t\t="+trophy3));
   for(Player i: j7){
   System.out.println(i.getId());
   }
 }
}
