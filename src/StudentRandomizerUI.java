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
        mainFrame.setSize(500, 350);
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


        Checkbox studentOne = new Checkbox(machine.getName(0));
        Checkbox studentTwo = new Checkbox(machine.getName(1));
        Checkbox studentThree = new Checkbox(machine.getName(2));
        Checkbox studentFour = new Checkbox(machine.getName(3));
        Checkbox studentFive = new Checkbox(machine.getName(4));
        Checkbox studentSix = new Checkbox(machine.getName(5));
        Checkbox studentSeven = new Checkbox(machine.getName(6));
        Checkbox studentEight = new Checkbox(machine.getName(7));
        Checkbox studentNine = new Checkbox(machine.getName(8));
        Checkbox studentTen = new Checkbox(machine.getName(9));
        Checkbox studentEleven = new Checkbox(machine.getName(10));
        Checkbox studentTwelve = new Checkbox(machine.getName(11));
        Checkbox studentThirteen = new Checkbox(machine.getName(12));
        Checkbox studentFourteen = new Checkbox(machine.getName(13));

        studentOne.setState(true);
        studentTwo.setState(true);
        studentThree.setState(true);
        studentFour.setState(true);
        studentFive.setState(true);
        studentSix.setState(true);
        studentSeven.setState(true);
        studentEight.setState(true);
        studentNine.setState(true);
        studentTen.setState(true);
        studentEleven.setState(true);
        studentTwelve.setState(true);
        studentThirteen.setState(true);
        studentFourteen.setState(true);

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

        studentEight.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                machine.setIsPresent(7, (e.getStateChange() == 1 ? true : false));
            }
        });

        studentNine.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                machine.setIsPresent(8, (e.getStateChange() == 1 ? true : false));
            }
        });

        studentTen.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                machine.setIsPresent(9, (e.getStateChange() == 1 ? true : false));
            }
        });

        studentEleven.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                machine.setIsPresent(10, (e.getStateChange() == 1 ? true : false));
            }
        });

        studentTwelve.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                machine.setIsPresent(11, (e.getStateChange() == 1 ? true : false));
            }
        });

        studentThirteen.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                machine.setIsPresent(12, (e.getStateChange() == 1 ? true : false));
            }
        });

        studentFourteen.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                machine.setIsPresent(13, (e.getStateChange() == 1 ? true : false));
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
                studentEight.setEnabled(false);
                studentNine.setEnabled(false);
                studentTen.setEnabled(false);
                studentEleven.setEnabled(false);
                studentTwelve.setEnabled(false);
                studentThirteen.setEnabled(false);
                studentFourteen.setEnabled(false);
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
                studentEight.setEnabled(true);
                studentNine.setEnabled(true);
                studentTen.setEnabled(true);
                studentEleven.setEnabled(true);
                studentTwelve.setEnabled(true);
                studentThirteen.setEnabled(true);
                studentFourteen.setEnabled(true);
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
        controlPanel.add(studentEight);
        controlPanel.add(studentNine);
        controlPanel.add(studentTen);
        controlPanel.add(studentEleven);
        controlPanel.add(studentTwelve);
        controlPanel.add(studentThirteen);
        controlPanel.add(studentFourteen);
        buttonPanel.add(pickRandom);
        buttonPanel.add(reset);

        mainFrame.setVisible(true);
    }
}
