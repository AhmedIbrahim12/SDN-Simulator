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
public class Packet {

    String srcIP;
    String destIP;
    String data;

    public Packet(String sIP, String dIP, String msg) {
        this.srcIP = sIP;
        this.destIP = dIP;
        this.data = msg;
    }

    public String getSrcIP() {
        return this.srcIP;
    }

    public String getdestIP() {
        return this.destIP;
    }
}
