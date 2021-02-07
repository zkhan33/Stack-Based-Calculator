/*
 * Author: Zarina Khan
 * Simple Java program to create a calculator based on what is on top of the stack. 
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class StackBasedCalculator extends JFrame {

    public static void main(String[] args) {
        StackBasedCalculator sbc = new StackBasedCalculator();
        sbc.setLocationRelativeTo(null);
        sbc.setVisible(true);

    }
    private JTextArea jTextArea;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, bequal, bclear;

    public StackBasedCalculator() {
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 550);
        this.setLayout(null);
        jTextArea = new JTextArea();
        jTextArea.setSize(305, 100);
        jTextArea.setLocation(55, 40);
        b1 = new JButton("1");
        b1.setSize(75, 55);
        b1.setLocation(50, 300);
        b2 = new JButton("2");
        b2.setSize(75, 55);
        b2.setLocation(130, 300);
        b3 = new JButton("3");
        b3.setSize(75, 55);
        b3.setLocation(210, 300);
        b4 = new JButton("4");
        b4.setSize(75, 55);
        b4.setLocation(50, 250);
        b5 = new JButton("5");
        b5.setSize(75, 55);
        b5.setLocation(130, 250);
        b6 = new JButton("6");
        b6.setSize(75, 55);
        b6.setLocation(210, 250);
        b7 = new JButton("7");
        b7.setSize(75, 55);
        b7.setLocation(50, 200);
        b8 = new JButton("8");
        b8.setSize(75, 55);
        b8.setLocation(130, 200);
        b9 = new JButton("9");
        b9.setSize(75, 55);
        b9.setLocation(210, 200);
        b10 = new JButton("0");
        b10.setSize(155, 55);
        b10.setLocation(50, 350);
        b11 = new JButton("/");
        b11.setSize(75, 55);
        b11.setLocation(290, 150);
        b12 = new JButton("*");
        b12.setSize(75, 55);
        b12.setLocation(290, 200);
        b13 = new JButton("-");
        b13.setSize(75, 55);
        b13.setLocation(290, 250);
        b14 = new JButton("+");
        b14.setSize(75, 55);
        b14.setLocation(290, 300);
        bequal = new JButton("=");
        bequal.setSize(155, 55);
        bequal.setLocation(210, 350);
        bclear = new JButton("Clear");
        bclear.setSize(235, 55);
        bclear.setLocation(50, 150);

        this.add(jTextArea);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(b10);
        this.add(b11);
        this.add(b12);
        this.add(b13);
        this.add(b14);
        this.add(bequal);
        this.add(bclear);
        Stack stack = new Stack();

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("1");

            }

        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("2");

            }

        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("3");
            }

        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("4");

            }

        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("5");

            }

        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("6");

            }

        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("7");

            }

        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("8");

            }

        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("9");

            }

        });
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("0");

            }

        });
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stack.push(jTextArea.getText());
                stack.push("/");
                jTextArea.setText("");
                b11.setBackground(Color.red);
            }

        });
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stack.push(jTextArea.getText());
                stack.push("*");
                jTextArea.setText("");
                b12.setBackground(Color.red);

            }

        });
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stack.push(jTextArea.getText());
                stack.push("-");
                jTextArea.setText("");
                b13.setBackground(Color.red);

            }

        });
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stack.push(jTextArea.getText());
                stack.push("+");
                jTextArea.setText("");
                b14.setBackground(Color.red);

            }

        });

        bequal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stack.push(jTextArea.getText());
                float a = Integer.parseInt((String) stack.pop());
                String operation = (String) stack.pop();
                float b = Integer.parseInt((String) stack.pop());
                switch (operation) {
                    case "/":
                        b11.setBackground(null);
                        float c = (float) b / a;
                        jTextArea.setText(String.valueOf(c));
                        stack.push(c);
                        if (a == 0) {
                            JOptionPane.showMessageDialog(null, "Cannot divide by zero.");
                        }
                        break;
                    case "*":
                        b12.setBackground(null);
                        float d = (float) a * b;
                        jTextArea.setText(String.valueOf(d));
                        stack.push(d);
                        break;
                    case "-":
                        b13.setBackground(null);
                        jTextArea.setText(String.valueOf(b - a));
                        stack.push(b - a);
                        break;
                    case "+":
                        b14.setBackground(null);
                        jTextArea.setText(String.valueOf(a + b));
                        stack.push(a + b);
                        break;
                }

            }

        });
        bclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText("");
                stack.clear();
            }

        });
    }
}
