import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author orlan
 */
public class Alquiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        
        ArrayList<Barco> listBarco = new ArrayList();
        
        Yate yt= new Yate(14,2500,50,30,"Frost");
        Deportiva dp = new Deportiva(3000,40,15,"España");
        Velero vl = new Velero(6,30,10,"The Girl");
        
        yt.calcularPrecio();
        dp.calcularPrecio();
        vl.calcularPrecio();
        
        listBarco.add(yt);
        listBarco.add(dp);
        listBarco.add(vl);
        
        System.out.println(yt.toString());
        System.out.println(dp.toString());
        System.out.println(vl.toString());

    }

}
