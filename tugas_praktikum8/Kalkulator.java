/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author Dha Gas Gar
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame implements ActionListener {
    // Components
    JTextField display;
    JPanel panel;
    
    // Numbers and operators
    String[] buttons = {
        "8", "7", "9", "+", 
        "4", "5", "6", "-", 
        "1", "2", "3", "*", 
        ".", "0", "C", "/", 
        "=", "%", "B", "E"
    };
    
    JButton[] button = new JButton[buttons.length];

    String operand1 = "";
    String operand2 = "";
    String operator = "";
    boolean isOperatorClicked = false;

    // Constructor
    public Kalkulator() {
        // Create a frame
        setTitle("Aplikasi Kalkulator");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create display field
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 20));
        add(display, BorderLayout.NORTH);
        
        // Create panel for buttons
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        // Add buttons to panel
        for (int i = 0; i < buttons.length; i++) {
            button[i] = new JButton(buttons[i]);
            button[i].setFont(new Font("Arial", Font.PLAIN, 18));
            button[i].addActionListener(this);
            panel.add(button[i]);
        }

        // Add panel to frame
        add(panel);

        setVisible(true);
    }

    // Event handler
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
            if (!isOperatorClicked) {
                operand1 += command;
                display.setText(operand1);
            } else {
                operand2 += command;
                display.setText(operand2);
            }
        } else if (command.equals("C")) {
            operand1 = operand2 = operator = "";
            isOperatorClicked = false;
            display.setText("");
        } else if (command.equals("B")) {
            if (!isOperatorClicked && operand1.length() > 0) {
                operand1 = operand1.substring(0, operand1.length() - 1);
                display.setText(operand1);
            } else if (isOperatorClicked && operand2.length() > 0) {
                operand2 = operand2.substring(0, operand2.length() - 1);
                display.setText(operand2);
            }
        } else if (command.equals("=")) {
            double result = calculate(Double.parseDouble(operand1), Double.parseDouble(operand2), operator);
            display.setText(String.valueOf(result));
            operand1 = String.valueOf(result);
            operand2 = "";
            isOperatorClicked = false;
        } else if (command.equals("E")) {
            System.exit(0);
        } else {
            if (!operand1.equals("")) {
                isOperatorClicked = true;
                operator = command;
            }
        }
    }

    public double calculate(double num1, double num2, String op) {
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(this, "Tidak bisa dibagi dengan 0");
                    return 0;
                }
            case "%":
                return num1 % num2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        new Kalkulator();
    }
}

