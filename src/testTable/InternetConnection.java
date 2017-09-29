/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testTable;

/**
 *
 * @author cgntuser
 */

import java.net.*;
import javax.swing.JOptionPane;

public class InternetConnection 
{
    //public InternetConnection ()//
            public static boolean InternetConnection ()
    {
        Socket sock = new Socket();
        InetSocketAddress addr = new InetSocketAddress("www.google.com",80); 

        try
        {
            sock.connect(addr,3000);
            JOptionPane.showMessageDialog(null,"You are connected!");
            //XamppLoginTest.setVisible(true);
            return true;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Please check your Internet Connection!");

            return false;
        }
        finally
        {
            try
            {
                sock.close();
            }
            catch (Exception e)
            {

            }
        }
    }
}
