/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdn;

/**
 *
 * @author Ahmed Ibrahim
 */
public class Route {
    String parentIP;
    String childIP;
    public Route(String pIP, String cIP){
        this.parentIP = pIP;
        this.childIP = cIP;
    }
}
