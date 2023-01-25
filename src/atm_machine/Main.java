/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_machine;

import java.io.IOException;
/**
 *
 * @author iTozz
 */

public class Main extends OptionMenu {
    public static void main(String[] args) throws IOException{
        OptionMenu opsiMenu = new OptionMenu();
        opsiMenu.getLogin();
    }
}