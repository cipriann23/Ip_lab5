/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angrybirds;

/**
 *
 * @author rares
 */
public class AngryBirds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GameState myState = GameState.getInstance();
        GameState myState2 = GameState.getInstance();
        
        
        Pig john = new Pig(10);
        john.die();
    }
    
}
