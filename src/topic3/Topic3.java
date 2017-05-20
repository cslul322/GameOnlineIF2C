package topic3;
import java.util.Scanner;
import java.util.Stack;
public class Topic3 {

    public static void main(String[] args) {
        ClanCoC jv2 = new ClanCoC();
        Pasukan jv4 = new Pasukan();
        int[] cslul = {13400,13150,13900};
        
        Stack<String>s1=new Stack<String>();
        Stack<String>s2=new Stack<String>();
        
        String y;
        int x;
        
        do{
        System.out.println("Pilih Menu");
            System.out.println("1.Melihat anggota clan");
            System.out.println("2.Melihat pertandingan antar clan");
            System.out.println("3.Melihat clan dengan trophy terkecil");
            Scanner scan = new Scanner(System.in);
            x = scan.nextInt();
            
            if(x == 1){
                jv2.clan1();
                jv2.clan2();
                jv2.clan3();
            }else if(x == 2){
                System.out.println("Ada pertandingan antar clan Sleysher dan Imba");
                System.out.println("Ketik sembarang huruf untuk melanjutkan");
                y = scan.next();
                System.out.println("\nPemenang nya adalah clan Imba");
                System.out.println("Menyisakan clan Imba dan CSGo");
                s1.push("Sleysher");
                s1.push("Imba");
                s1.push("CSGO");
                System.out.println(s1.pop());
                System.out.println(s1.pop());
                System.out.println("\nPertandingan final antar Imba dan CSGo");
                System.out.println("Ketik sembarang huruf untuk melanjutkan");
                y = scan.next();
                s2.push("Sleysher");
                s2.push("Imba");
                s2.push("CSGO");
                System.out.println(s2.pop());
                System.out.println("Pemenang pertandingan antar Clan adalh CSGo,Lul");
            }else if(x == 3){
                System.out.println("Clan dengan trophy terkecil");
                for(int i = 0;i<cslul.length;i++){
                int index = i;
                for(int j = i+1;j<cslul.length;j++)
                    if(cslul[j]<cslul[index])
                        index = j;
                int smll = cslul[index];
                cslul[index] = cslul[i];
                cslul[i] = smll;
            }
            for(int i:cslul){
                System.out.println(i);
            }
            System.out.println("1.Imba      = 13150");
            System.out.println("2.Sleysher  = 13400");
            System.out.println("3.CSGo      = 13900");
        }
        }while(true);
    }
}
