import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Calculator {

    JFrame frame;
    JPanel left;
    JPanel right;

    JTextArea typingSpace;
    DrawingPanel renderSpace;
    JPanel row1;
    JPanel row2;
    JPanel row3;
    JPanel row4;
    JPanel row5;
    JPanel row6;

    elementButton sin;
    elementButton cos;
    elementButton tan;
    elementButton divide;

    elementButton pow;
    elementButton leftPrths;
    elementButton rightPrths;
    elementButton multiply;

    elementButton square;
    elementButton seven;
    elementButton eight;
    elementButton nine;
    elementButton subtract;

    elementButton log;
    elementButton four;
    elementButton five;
    elementButton six;
    elementButton add;

    elementButton one;
    elementButton two;
    elementButton three;

    elementButton zero;
    elementButton decimal;
    elementButton negative;

    public Calculator()
    {
        frame = new JFrame("Calculator");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        left = new JPanel();
        left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
        right = new JPanel();
        right.setLayout(new BorderLayout());
        frame.add(left, BorderLayout.WEST);
        frame.add(right, BorderLayout.EAST);

        typingSpace = new JTextArea();
        left.add(typingSpace);

        renderSpace = new DrawingPanel();
        right.add(renderSpace, BorderLayout.WEST);

        row1 = new JPanel();
        row1.setLayout(new BoxLayout(row1, BoxLayout.X_AXIS));
        sin = new elementButton(typingSpace, "sin");
        row1.add(sin);
        cos = new elementButton(typingSpace, "cos");
        row1.add(cos);
        tan = new elementButton(typingSpace, "tan");
        row1.add(tan);
        divide = new elementButton(typingSpace, "/");
        row1.add(divide);
        left.add(row1);

        row2 = new JPanel();
        row2.setLayout(new BoxLayout(row2, BoxLayout.X_AXIS));
        pow = new elementButton(typingSpace, "^");
        row2.add(pow);
        leftPrths = new elementButton(typingSpace, "(");
        row2.add(leftPrths);
        rightPrths = new elementButton(typingSpace, ")");
        row2.add(rightPrths);
        multiply = new elementButton(typingSpace, "*");
        row2.add(multiply);
        left.add(row2);

        row3 = new JPanel();
        row3.setLayout(new BoxLayout(row3, BoxLayout.X_AXIS));
        square = new elementButton(typingSpace, "^2");
        row3.add(square);
        seven = new elementButton(typingSpace, "7");
        row3.add(seven);
        eight = new elementButton(typingSpace, "8");
        row3.add(eight);
        nine = new elementButton(typingSpace, "9");
        row3.add(nine);
        subtract = new elementButton(typingSpace, "-");
        row3.add(subtract);
        left.add(row3);

        row4 = new JPanel();
        row4.setLayout(new BoxLayout(row4, BoxLayout.X_AXIS));
        log = new elementButton(typingSpace, "log");
        row4.add(log);
        four = new elementButton(typingSpace, "4");
        row4.add(four);
        five = new elementButton(typingSpace, "5");
        row4.add(five);
        six = new elementButton(typingSpace, "6");
        row4.add(six);
        add = new elementButton(typingSpace, "+");
        row4.add(add);
        left.add(row4);

        row5 = new JPanel();
        row5.setLayout(new BoxLayout(row5, BoxLayout.X_AXIS));
        one = new elementButton(typingSpace, "1");
        row5.add(one);
        two = new elementButton(typingSpace, "2");
        row5.add(two);
        three = new elementButton(typingSpace, "3");
        row5.add(three);
        left.add(row5);

        row6 = new JPanel();
        row6.setLayout(new BoxLayout(row6, BoxLayout.X_AXIS));
        decimal = new elementButton(typingSpace, ".");
        row6.add(decimal);
        zero = new elementButton(typingSpace, "0");
        row6.add(zero);
        negative = new elementButton(typingSpace, "—");
        row6.add(negative);
        left.add(row6);

        frame.pack();
        frame.setVisible(true);
    }

}
