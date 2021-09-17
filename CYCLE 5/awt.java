import java.awt.*;
import java.awt.event.*;

class MaxFind implements ActionListener {

    MaxFind() {
        Frame maniFrame = new Frame();

        Label L1 = new Label("NO 1");
        Label L2 = new Label("NO 2");
        Label L3 = new Label("NO 3");
        Label L4 = new Label("MAX NO");

        Button B1 = new Button("Submit");

        TextField T1 = new TextField();
        TextField T2 = new TextField();
        TextField T3 = new TextField();
        TextField T4 = new TextField();

        // set posiotion and size
        L1.setBounds(50, 50, 80, 50);
        L2.setBounds(150, 50, 80, 50);
        L3.setBounds(250, 50, 80, 50);
        L4.setBounds(350, 50, 80, 50);
        T1.setBounds(50, 100, 80, 50);
        T2.setBounds(150, 100, 80, 50);
        T3.setBounds(250, 100, 80, 50);
        T4.setBounds(350, 100, 80, 50);
        B1.setBounds(150, 200, 80, 30);

        // Add componants to frame
        maniFrame.add(B1);
        maniFrame.add(L1);
        maniFrame.add(L2);
        maniFrame.add(L3);
        maniFrame.add(L4);
        maniFrame.add(T1);
        maniFrame.add(T2);
        maniFrame.add(T3);
        maniFrame.add(T4);

        // Action events
        B1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(T1.getText());
                int b = Integer.parseInt(T2.getText());
                int c = Integer.parseInt(T3.getText());
                int large=0;

                if (a >= b && a >= c) {
                    large = a;
                } else if (b >= a && b >= c) {
                    large = b;
                } else if (c >= a && c >= b) {
                    large = c;
                }

                T4.setText(Integer.toString(large));
            }
        });

        maniFrame.setSize(600, 300);
        maniFrame.setTitle("Max of 3 Numbers");
        maniFrame.setLayout(null);
        maniFrame.setVisible(true);
    }

    public static void main(String args[]) {
        MaxFind maxObj = new MaxFind();
    }

    public void actionPerformed(ActionEvent e) {

    }

}