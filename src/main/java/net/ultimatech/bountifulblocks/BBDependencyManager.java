package net.ultimatech.bountifulblocks;

public class BBDependencyManager {

    public static boolean isEchoingWildsInstalled() {
        try {
            Class.forName("net.ultimatech.echoingwilds.EchoingWilds");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public static boolean isPaleOakAvailable() {
        try {
            Class.forName("fr.iglee42.holycubepaleoak.HolycubePaleOak");
            return true;
        } catch (ClassNotFoundException e) {
            try {
                Class.forName("rs.onako2.IWantItEarlier");
                return true;
            } catch (ClassNotFoundException e2) {
                return false;
            }
        }
    }
}
