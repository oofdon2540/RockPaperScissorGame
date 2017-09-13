/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissorgame;
import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class RockPaperScissorGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Game game = new Game("Rock,Paper,Scissor");
        System.out.println(game);
        
        for(int i =0;i < 4;i++){
            int botPick = game.getRandom();
            
            System.out.print("Rock, Paper or Scissor?: ");
         try{   
            String takeIn = scan.nextLine();
            game.isComparing(takeIn,botPick);
            game.displayGamePick();
         }catch(IllegalArgumentException iae){
            System.out.printf("Please type in Rock, Paper or Scissor", iae.getMessage());
         }
       }
    }   
}
