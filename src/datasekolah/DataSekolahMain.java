/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasekolah;

import abstractsekolah.Abstract;
import java.io.IOException;
import utils.Login;

/**
 *
 * @author Karim
 */
public class DataSekolahMain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Abstract abs = new Login();
        abs.login();
    }
    
}
