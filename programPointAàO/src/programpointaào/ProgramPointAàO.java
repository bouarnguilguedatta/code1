/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programpointaào;

/**
 *
 * @author Soumbi&Eli
 */
public class ProgramPointAàO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }public class Point{
        float x;
        float y;
        public void afficheCoordonnée(){
            System.out.println("abscisse" +x);
            System.out.println("ordonnée" +y);
        }
       public void main (String[]args){
         Point P = new Point();
           P.x=2;
           P.x=3;
           P.afficheCoordonnée();
               
           }
       }         
    }
    
}
