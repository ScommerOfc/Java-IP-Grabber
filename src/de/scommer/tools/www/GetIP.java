package de.scommer.tools.www;

import java.net.*;
import java.io.*;

public class GetIP {
    public GetIP() throws IOException {

    }

    public String returnIp() throws IOException {
        URL ipChecker = new URL("http://checkip.amazonaws.com");
        BufferedReader writeToString = new BufferedReader(
                new InputStreamReader(ipChecker.openStream()));
        String ipString = writeToString.readLine();
            return ipString;
    }
}
