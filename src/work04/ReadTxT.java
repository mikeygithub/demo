package work04;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 2/19/20 12:48 AM
 * @Version 1.0
 * @Description:
 **/

public class ReadTxT extends JFrame {

    private JTextArea textAreaOutput;

    public ReadTxT() throws IOException {

        super("READTXT");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());
        textAreaOutput = new JTextArea("READTXT", 45, 80);
        textAreaOutput.setSelectedTextColor(Color.RED);
        // 激活自动换行功能
        textAreaOutput.setLineWrap(true);
        // 激活断行不断字功能
        textAreaOutput.setWrapStyleWord(true);
        BufferedReader reader = new BufferedReader(new FileReader("/home/mikey/DATA/MIKEY/IDEAWorkSpace/demo/src/work04/work04.txt"));
        String str = reader.readLine();
        String end = "";
        while ((str != null)) {
            end += str + "\n";
            str = reader.readLine();
        }
        textAreaOutput.setText(end);

        getContentPane().add(textAreaOutput);
        setSize(512, 300);

    }

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ReadTxT readTxT = new ReadTxT();
        readTxT.setVisible(true);
    }

}
