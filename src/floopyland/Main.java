/*
 *Time est; 10 hours
* time: 6 hours
 */
package floopyland;

import com.pauliankline.floopyconnector.Floopy;

/**
 * 
 * @author paul.kline
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Floopy floop = new Floopy(new ConcreteController());
//replace ConcreteController with your controller.
        floop.begin(5); //5 being the number of heroes.
    }

}
