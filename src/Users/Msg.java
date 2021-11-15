package Users;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Msg {
    Patient owner;
    String filename;

    public Msg(Patient p) {
        owner = p; // whose messages
        this.filename = /*uniquePatientIdentifier*/ +"_Msgs.txt";
    }

    /*
    addMsg
    Takes User and String to make a message 
    called in the messages screen when a user writes a messages
    */
    public static void addMsg(User u, String c) {
        //String name = u.getName;
        msgToTxt(name, c);
    }

    /*
    msgToTxt
    takes a message and adds it to the txt file where it is stored for later use
    */
    public static void msgToTxt(String name, String content) {
        File msgFile = new File(filename);
        try {
            FileWriter fw = new FileWriter(msgFile, true);
            fw.write(name + " | " + content + "\n");
            fw.close();
            System.out.println("msg added: " + name);
        }
    }

    /*
    readMsg
    takes a patient 
    reads the message file and outputs an array list of all the messages so it can be
    used and shown on screen later
    */
    public static ArrayList < String > readMsg() {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();
        public static ArrayList < String > msgList = new ArrayList < String > ();

        while (line != null) {
            try {
                msgList.add(line);
            }
            line = br.readLine();
        }
        br.close();
        System.out.println("msgs init");

        return msgList;

    }
}
