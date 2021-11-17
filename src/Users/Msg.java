package Users;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Msg {
    User owner;
    String filename;

    public Msg(User p) {
        owner = p; // whose messages
    }

    /*
    addMsg
    Takes User and String to make a message 
    called in the messages screen when a user writes a messages
    */
    public static void addMsg(User u, String c) {
        String name = u.getName();
        msgToTxt(name, c, u);
    }

    /*
    msgToTxt
    takes a message and adds it to the txt file where it is stored for later use
    */
    public static void msgToTxt(String name, String content, User owner) {
    	String filename = owner.Name + owner.Birthday +"_Msgs.txt";
        File msgFile = new File(filename);
        try {
            FileWriter fw = new FileWriter(msgFile, true);
            fw.write(name + " | " + content + "\n");
            fw.close();
            System.out.println("msg added: " + name);
        }catch(Exception e) {
        	
        }
    }

    /*
    readMsg
    takes a patient 
    reads the message file and outputs an array list of all the messages so it can be
    used and shown on screen later
    */
    public static ArrayList < String > readMsg(User owner) {
    	String filename = owner.Name + owner.Birthday +"_Msgs.txt";
    	ArrayList < String > msgList = new ArrayList < String > ();
    	try {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();
        

        while (line != null) {
                msgList.add(line);

            line = br.readLine();
        }
        br.close();
        System.out.println("msgs init");
    	}catch(Exception e) {
    		
    	}
        
        

        return msgList;

    }
}
