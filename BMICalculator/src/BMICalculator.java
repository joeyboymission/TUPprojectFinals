import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
public class BMICalculator {

    public static void main(String[] args) {
        JFrame win = new JFrame();
        JLabel bmiTitle = new JLabel("Welcome to BMI Calculator!");
        JLabel lblInput = new JLabel("Input");
        JLabel lblSum = new JLabel("Body Mass Index Summary");
        JLabel lblName = new JLabel("Name: ");
        JLabel lblAge = new JLabel("Age: ");
        JLabel lblSex = new JLabel("Sex: ");
        JRadioButton rMale = new JRadioButton("Male");
        JRadioButton rFemale = new JRadioButton("Female");

        JTabbedPane tabbedBMI = new JTabbedPane();
        JPanel standard = new JPanel();
        JPanel metric = new JPanel();

        JTextField txtName = new JTextField();
        JTextField txtAge = new JTextField();

        Border brd1 = BorderFactory.createLineBorder(Color.RED);
        Border brd2 = BorderFactory.createLineBorder(Color.RED);

        JLabel stdHeight = new JLabel("Height: ");

        //group radio buttons selection
        ButtonGroup rbttnSex = new ButtonGroup();
        rbttnSex.add(rMale);
        rbttnSex.add(rFemale);

        //tabbed pane function and behavior
        tabbedBMI.addTab("Standard", standard);
        tabbedBMI.addTab("Metric", metric);

        //Standard Panel contents
        standard.setLayout(new BorderLayout());
        standard.add(stdHeight);


        //Metric Panel contents
        metric.setLayout(new BorderLayout());


        //add position of each components
        bmiTitle.setBounds(20,20,520,20); 
        lblInput.setBounds(20,50,260,250);
        lblSum.setBounds(300,50,260,250);
        lblName.setBounds(40,70,120,20);
        lblAge.setBounds(40,100,120,20);
        lblSex.setBounds(40,130,120,20);
        txtName.setBounds(100,72,150,25);
        txtAge.setBounds(100,102,150,25);
        rMale.setBounds(100,130,60,20);
        rFemale.setBounds(165,130,90,20);
        tabbedBMI.setBounds(40,160,220,130);

        //add components to the window
        win.add(bmiTitle);
        win.add(lblInput);
        win.add(lblSum);
        win.add(lblName);
        win.add(lblAge);
        win.add(lblSex);
        win.add(txtName);
        win.add(txtAge);
        win.add(rMale);
        win.add(rFemale);
        win.add(tabbedBMI);

        //set font behavior
        bmiTitle.setFont(new Font("Tahoma",Font.BOLD,18));
        bmiTitle.setVerticalAlignment(JLabel.CENTER);
        bmiTitle.setHorizontalAlignment(JLabel.CENTER);

        lblInput.setBorder(brd1);
        lblInput.setFont(new Font("Tahoma",Font.PLAIN,15));
        lblInput.setHorizontalAlignment(JLabel.CENTER);
        lblInput.setVerticalAlignment(JLabel.TOP);

        lblSum.setBorder(brd2);
        lblSum.setFont(new Font("Tahoma",Font.PLAIN,15));
        lblSum.setHorizontalAlignment(JLabel.CENTER);
        lblSum.setVerticalAlignment(JLabel.TOP);

        lblName.setFont(new Font("Tahoma",Font.PLAIN,15));
        txtName.setHorizontalAlignment(JTextField.CENTER);

        lblAge.setFont(new Font("Tahoma",Font.PLAIN,15));
        txtAge.setHorizontalAlignment(JTextField.CENTER);

        lblSex.setFont(new Font("Tahoma",Font.PLAIN,15));
        rMale.setFont(new Font("Tahoma",Font.PLAIN,13));
        rFemale.setFont(new Font("Tahoma",Font.PLAIN,13));



        //set the behavior of window
        win.setTitle("BMI Calculator");
        win.setSize(600,350);
        win.setLayout(null);
        win.setResizable(false);
        win.setVisible(true);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
