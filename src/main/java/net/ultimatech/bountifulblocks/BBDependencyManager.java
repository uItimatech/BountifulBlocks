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
}
