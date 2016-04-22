package stockbroker9;

/**
 * Created by Matthew on 4/22/2016.
 */

import java.io.*;
import java.net.*;


public class MultiServerThread extends Thread {
    private Socket socket = null;

    public MultiServerThread(Socket socket) {
        super("MultiServerThread");
        this.socket = socket;
    }

    public void run() {
        PrintWriter out = null;
        BufferedReader in = null;
        String s = null;
        Process p = null;
        BufferedReader stdInput;
        int choice = 0;
        String temp = null;
    }
}
