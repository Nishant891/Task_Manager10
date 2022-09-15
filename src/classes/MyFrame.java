package classes;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener{
    JList<String> list;
    JButton btn;
    JLabel label;

    public MyFrame() {
        Todo Obj = new Todo();
        this.setTitle("Task_Master");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.lightGray);

        label = new JLabel("Label");
        label.setBounds(100,50,200,50);

        DefaultListModel<String> myList= new DefaultListModel<>();

        list =  new JList<>(myList);
        list.setBounds(250,100,300,300);
        list.setFont(new Font("Arial",Font.BOLD,20));
        list.setBorder(new EmptyBorder(10,10,10,10));
        list.setLayoutOrientation(JList.VERTICAL);

        btn=new JButton("ADD");
        btn.setBounds(170,25,70,40);
        btn.addActionListener(this);
        btn.setBackground(Color.black);
        btn.setForeground(Color.white);

        this.add(btn);
        this.add(list);
        this.add(label);

        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        /*String msg="";
        if(list.getSelectedIndex()!=-1){
            msg="You Selected"+list.getSelectedValue();
        }*/
        String s = JOptionPane.showInputDialog("Add a task");
        DefaultListModel<String> myList= new DefaultListModel<>();

        list =  new JList<>(myList);
        list.setBounds(250,100,300,300);
        list.setFont(new Font("Arial",Font.BOLD,20));
        list.setBorder(new EmptyBorder(10,10,10,10));
        list.setLayoutOrientation(JList.VERTICAL);
        myList.addElement(s);
    }

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        Todo Obj = new Todo();
    }
}

