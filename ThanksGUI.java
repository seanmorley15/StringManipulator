// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextField;
// import javax.swing.JButton;
// import javax.swing.JPanel;
// import java.awt.BorderLayout;
// import java.awt.Color;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import javax.swing.JButton;

// public class ThanksGUI {
//     public static void main(String[] args) {
//         // Create a JFrame
//         JFrame frame = new JFrame("Thanks GUI");
//         frame.setSize(300, 200);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setLocationRelativeTo(null);

//         RepeatLetter rl = new RepeatLetter();

//         // Create a panel to hold components
//         JPanel panel = new JPanel(new BorderLayout());

//         // Create a JLabel for instructions
//         JLabel instructionLabel = new JLabel("Enter a string:");
//         panel.add(instructionLabel, BorderLayout.NORTH);

//         JButton scrambleButton = new JButton("Scramble");
//         panel.add(scrambleButton, BorderLayout.SOUTH);
        

//         // Create a JPanel for text field and submit button
//         JPanel inputPanel = new JPanel();
//         JTextField stringField = new JTextField(20);
//         inputPanel.add(stringField);
//         JTextField tField = new JTextField(20);
//         inputPanel.add(tField);

//         JButton submitButton = new JButton("Submit");
//         inputPanel.add(submitButton);

//         panel.add(inputPanel, BorderLayout.CENTER);

//         // Create a JLabel for displaying "Thanks!" message
//         JLabel thanksLabel = new JLabel();
//         panel.add(thanksLabel, BorderLayout.SOUTH);

//         // Add the panel to the frame
//         frame.add(panel);

//         // Action listener for the submit button
//         submitButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 // Get the text from the text field
//                 // String userInput = ;

//                 // Display thanks message
//                 String string = stringField.getText();

//                 String t = tField.getText();
//                 String result = rl.repeatLetter(string, t);
//                 thanksLabel.setText(result);
//             }
//         });

//         // Set the frame visible after all components are added
//         frame.setVisible(true);
//     }
// }
