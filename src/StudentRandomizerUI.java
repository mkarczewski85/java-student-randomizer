import java.awt.*;
import java.awt.event.*;

public class StudentRandomizerUI {

    private Frame mainFrame;
    private Label headerLabel;
    private Label resultLabel;
    private Label clicksLabel;
    private Panel controlPanel;
    private Panel buttonPanel;

    public StudentRandomizerUI() {
        prepareGUI();
    }

    public static void main(String[] args) {
        StudentRandomizerUI start = new StudentRandomizerUI();
        start.MainProgramUI();
    }

    private void prepareGUI() {
        mainFrame = new Frame("Program losujący");
        mainFrame.setSize(400, 300);
        mainFrame.setResizable(false);
        mainFrame.setLayout(new GridLayout(5, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        resultLabel = new Label();
        resultLabel.setAlignment(Label.CENTER);
        resultLabel.setSize(350, 100);
        clicksLabel = new Label();
        clicksLabel.setAlignment(Label.CENTER);
        clicksLabel.setSize(350, 100);

        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        buttonPanel = new Panel();
        buttonPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(resultLabel);
        mainFrame.add(clicksLabel);
        mainFrame.add(buttonPanel);
        mainFrame.setVisible(true);
    }

    private void MainProgramUI() {

        RandomMachine machine = new RandomMachine();


        Checkbox studentOne = new Checkbox("Maciej");
        Checkbox studentTwo = new Checkbox("Marcin");
        Checkbox studentThree = new Checkbox("Michał");
        Checkbox studentFour = new Checkbox("Damian");
        Checkbox studentFive = new Checkbox("Piotr");
        Checkbox studentSix = new Checkbox("Dawid");
        Checkbox studentSeven = new Checkbox("Marta");

        studentOne.setState(true);
        studentTwo.setState(true);
        studentThree.setState(true);
        studentFour.setState(true);
        studentFive.setState(true);
        studentSix.setState(true);
        studentSeven.setState(true);

        Button pickRandom = new Button("LOSUJ");
        Button reset = new Button("RESETUJ");

        headerLabel.setText("Odznacz osoby nieobecne");
        resultLabel.setText("Nikogo jeszcze nie wylosowano");
        clicksLabel.setText("Pula jest pełna");

        studentOne.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                machine.setIsPresent(0, (e.getStateChange() == 1 ? true : false));
            }
        });

        studentTwo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                machine.setIsPresent(1, (e.getStateChange() == 1 ? true : false));
            }
        });

        studentThree.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                machine.setIsPresent(2, (e.getStateChange() == 1 ? true : false));
            }
        });

        studentFour.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                machine.setIsPresent(3, (e.getStateChange() == 1 ? true : false));
            }
        });

        studentFive.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                machine.setIsPresent(4, (e.getStateChange() == 1 ? true : false));
            }
        });

        studentSix.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                machine.setIsPresent(5, (e.getStateChange() == 1 ? true : false));
            }
        });

        studentSeven.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                machine.setIsPresent(6, (e.getStateChange() == 1 ? true : false));
            }
        });

        pickRandom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentOne.setEnabled(false);
                studentTwo.setEnabled(false);
                studentThree.setEnabled(false);
                studentFour.setEnabled(false);
                studentFive.setEnabled(false);
                studentSix.setEnabled(false);
                studentSeven.setEnabled(false);
                resultLabel.setText("Osoba wylosowana: " + machine.getRandomStudent());
                clicksLabel.setText("Pozostała liczba osób w puli: " + machine.getClicksLeft());
                if (machine.getClicksLeft() == 0) {
                    pickRandom.setEnabled(false);
                }
            }
        });

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                machine.reset();
                pickRandom.setEnabled(true);
                studentOne.setEnabled(true);
                studentTwo.setEnabled(true);
                studentThree.setEnabled(true);
                studentFour.setEnabled(true);
                studentFive.setEnabled(true);
                studentSix.setEnabled(true);
                studentSeven.setEnabled(true);
                resultLabel.setText("Program zresetowano");
                clicksLabel.setText("Pula jest pełna");
            }
        });

        controlPanel.add(studentOne);
        controlPanel.add(studentTwo);
        controlPanel.add(studentThree);
        controlPanel.add(studentFour);
        controlPanel.add(studentFive);
        controlPanel.add(studentSix);
        controlPanel.add(studentSeven);
        buttonPanel.add(pickRandom);
        buttonPanel.add(reset);

        mainFrame.setVisible(true);
    }
}
