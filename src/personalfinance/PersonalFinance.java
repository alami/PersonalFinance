/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinance;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import personalfinance.settings.Text;

/**
 *
 * @author user
 */
public class PersonalFinance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        init();
        System.out.println("Personal Finance ! "
                + Text.get("PROGRAM_NAME")+" ! "
                + Arrays.toString(Text.getMonths()));
    }
    private static void init() {
        try {
            Text.init();
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Roboto-Light.ttf")));
        } catch (FontFormatException ex) {
            Logger.getLogger(PersonalFinance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PersonalFinance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
