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

    ElementButton sin;
    ElementButton cos;
    ElementButton tan;
    ElementButton divide;

    ElementButton pow;
    ElementButton leftPrths;
    ElementButton rightPrths;
    ElementButton multiply;

    ElementButton square;
    ElementButton seven;
    ElementButton eight;
    ElementButton nine;
    ElementButton subtract;

    ElementButton log;
    ElementButton four;
    ElementButton five;
    ElementButton six;
    ElementButton add;

    ElementButton one;
    ElementButton two;
    ElementButton three;

    ElementButton zero;
    ElementButton decimal;
    ElementButton negative;

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
        sin = new ElementButton(typingSpace, "sin");
        row1.add(sin);
        cos = new ElementButton(typingSpace, "cos");
        row1.add(cos);
        tan = new ElementButton(typingSpace, "tan");
        row1.add(tan);
        divide = new ElementButton(typingSpace, "/");
        row1.add(divide);
        left.add(row1);

        row2 = new JPanel();
        row2.setLayout(new BoxLayout(row2, BoxLayout.X_AXIS));
        pow = new ElementButton(typingSpace, "^");
        row2.add(pow);
        leftPrths = new ElementButton(typingSpace, "(");
        row2.add(leftPrths);
        rightPrths = new ElementButton(typingSpace, ")");
        row2.add(rightPrths);
        multiply = new ElementButton(typingSpace, "*");
        row2.add(multiply);
        left.add(row2);

        row3 = new JPanel();
        row3.setLayout(new BoxLayout(row3, BoxLayout.X_AXIS));
        square = new ElementButton(typingSpace, "^2");
        row3.add(square);
        seven = new ElementButton(typingSpace, "7");
        row3.add(seven);
        eight = new ElementButton(typingSpace, "8");
        row3.add(eight);
        nine = new ElementButton(typingSpace, "9");
        row3.add(nine);
        subtract = new ElementButton(typingSpace, "-");
        row3.add(subtract);
        left.add(row3);

        row4 = new JPanel();
        row4.setLayout(new BoxLayout(row4, BoxLayout.X_AXIS));
        log = new ElementButton(typingSpace, "log");
        row4.add(log);
        four = new ElementButton(typingSpace, "4");
        row4.add(four);
        five = new ElementButton(typingSpace, "5");
        row4.add(five);
        six = new ElementButton(typingSpace, "6");
        row4.add(six);
        add = new ElementButton(typingSpace, "+");
        row4.add(add);
        left.add(row4);

        row5 = new JPanel();
        row5.setLayout(new BoxLayout(row5, BoxLayout.X_AXIS));
        one = new ElementButton(typingSpace, "1");
        row5.add(one);
        two = new ElementButton(typingSpace, "2");
        row5.add(two);
        three = new ElementButton(typingSpace, "3");
        row5.add(three);
        left.add(row5);

        row6 = new JPanel();
        row6.setLayout(new BoxLayout(row6, BoxLayout.X_AXIS));
        decimal = new ElementButton(typingSpace, ".");
        row6.add(decimal);
        zero = new ElementButton(typingSpace, "0");
        row6.add(zero);
        negative = new ElementButton(typingSpace, "—");
        row6.add(negative);
        left.add(row6);

        frame.pack();
        frame.setVisible(true);
    }

}
