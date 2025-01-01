import java.util.Scanner;

class game{
    
    public void show(){
        int a = (int)(Math.random()*100);
        int x = 0;
        
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the Number Between 1-100 :- ");
         x = sc.nextInt();
        if(a>x){
            System.out.println("The Guessed Number is Low ");
        }
        else if(a<x){
            System.out.println("The Guessed Number is High ");
        }
        else{
            System.out.println("WoW the Guessed was right !");
        }
        }
        while(x>=0);
        
    }
}




public class guess_game {
    public static void main(String[] args) {
        game obj = new game();
        obj.show();
        
    }
}
