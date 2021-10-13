package de.scommer.tools.www;

import javax.mail.MessagingException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Connector extends JFrame {

    public static JTextField ipText;
    public static JButton grabIp;
    public static GetIP ipGrabber;

    public static void main(String[] args) throws IOException, MessagingException {
        GridLayout layoutMgr = new GridLayout();
        Connector guiFrame = new Connector();
        ipGrabber = new GetIP();

        ipText = new JTextField();
        grabIp = new JButton("Grab IP Address");

        grabIp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    ipText.setText(ipGrabber.returnIp());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        } );

        ipText.setEditable(false);

        guiFrame.setLayout(layoutMgr);
        guiFrame.add(grabIp);
        guiFrame.add(ipText);
        guiFrame.setVisible(true);
    }
}
