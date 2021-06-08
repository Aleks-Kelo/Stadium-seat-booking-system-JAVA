
package stadiumseatbooker;

/**
 *
 * @author Arbri Muca
 * @author Leandro Pasha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInOrRegister().setVisible(true);
            }
        });
        // TODO code application logic here
    }
    
}
