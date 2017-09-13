/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissorgame;
import java.util.Random;
/**
 *
 * @author Yo
 */
public class Game {
    private String game;
    private String playerPick;
    private int botScore;
    private int playerScore;
    private int rnd;
    Random random = new Random();
    
    public Game(String game){
        this.game = game;
        playerPick = "";
        botScore = 0;
        playerScore = 0;
        rnd = 0;
    }
    @Override
    public String toString(){
      return String.format("You are playing "+game+" game");  
    }
  
    public int getRandom() {
        int rnd = random.nextInt(3) + 1;
        return rnd;
    }
  
  
    public void isComparing(String userInput, int botPick){
        rnd = botPick;
        playerPick = userInput;
        if(playerPick.equalsIgnoreCase("Rock")){
            if(rnd == 1){
             playerScore += 0;
             botScore += 0;
             System.out.println("Your current score: "+ playerScore);
             System.out.println("Bot's current score: "+ botScore);
            }else if(rnd == 2){
             playerScore ++;
             botScore +=0;
             System.out.println("Your current score: "+ playerScore);
             System.out.println("Bot's current score: "+ botScore);
            }else if(rnd == 3){
             playerScore +=0;
             botScore ++;
             System.out.println("Your current score: "+ playerScore);
             System.out.println("Bot's current score: "+ botScore);
            }
            
         }
         if(playerPick.equalsIgnoreCase("Scissor")){
            if(rnd == 1){
             playerScore +=0;
             botScore ++;
             System.out.println("Your current score: "+ playerScore);
             System.out.println("Bot's current score: "+ botScore);
           }if(rnd == 2){
             playerScore += 0;
             botScore += 0;
             System.out.println("Your current score: "+ playerScore);
             System.out.println("Bot's current score: "+ botScore);
           }else if(rnd == 3){
             playerScore ++;
             botScore +=0; 
             System.out.println("Your current score: "+ playerScore);
             System.out.println("Bot's current score: "+ botScore);
           }
           
          }
          if(playerPick.equalsIgnoreCase("Paper")){
            if(rnd == 1){
             playerScore ++;
             botScore +=0;
             System.out.println("Your current score: "+ playerScore);
             System.out.println("Bot's current score: "+ botScore);
            }else if(rnd == 2){
             playerScore +=0;
             botScore ++;
             System.out.println("Your current score: "+ playerScore);
             System.out.println("Bot's current score: "+ botScore);
            }if(rnd == 3){
             playerScore += 0;
             botScore += 0;
             System.out.println("Your current score: "+ playerScore);
             System.out.println("Bot's current score: "+ botScore);
            }
            
        }
        
     }
   
 
    
   
    
    public void displayGamePick(){
         if(rnd == 1){
            System.out.println("Bot chooses rock");
         }else if(rnd == 2){
            System.out.println("Bot chooses scissor");
         }else{
            System.out.println("Bot chooses paper");
         }
    }
    
   
    
    
   
}
