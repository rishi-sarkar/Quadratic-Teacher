/*
 * Rishi Sarkar
 * Aug 21, 2018
 * Quadratics Teacher
 * To help teach Grade 9 students with their quadratics skills
 */
import java.awt.Color;
import java.awt.Point;
public class Quadratics_Teacher extends javax.swing.JFrame {
    
    static int min = -5, max = 5;// for randomizer used in future question generator
    static int q = 0, w = 0, e = 0, r = 0, t = 0;//  q(wx+e)(rx+t) < not the exact formula but easier for me to use
    static int a = 0, b = 0, c = 0;// ax^2 + bx + c < expanded formula
    //  (q*w*r)x^2 + (q*e*r + q*w*t)x + (q*e*t)   < expansion method
    static String coef = "", first = "", second = "";//for the three parts of the answer: coef(first)(second) = q(wx+e)(rx+t)
    
    static int cp = 0, hs = 0;//current points & high score < for unlimited option
    static int cpq = 0, qNum = 0;//current points & question number < for quiz option
    
    //multiple small and large dividers are put throughout the code for organization

    public Quadratics_Teacher() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        jlpMultiplePanes = new javax.swing.JLayeredPane();
        pnlHome = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSubtitle1 = new javax.swing.JLabel();
        lblSubtitle2 = new javax.swing.JLabel();
        lblSubtitle3 = new javax.swing.JLabel();
        lblFormat1 = new javax.swing.JLabel();
        lblFormat2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescription = new javax.swing.JTextArea();
        txtDescription1 = new javax.swing.JTextField();
        txtDescription2 = new javax.swing.JTextField();
        txtDescription3 = new javax.swing.JTextField();
        lblFormat3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlSandbox = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();
        lblQ1 = new javax.swing.JLabel();
        lblQuestion1 = new javax.swing.JLabel();
        lblQA1 = new javax.swing.JLabel();
        lblLine1a = new javax.swing.JLabel();
        lblLine1b = new javax.swing.JLabel();
        lblOutcome1 = new javax.swing.JLabel();
        lblU1 = new javax.swing.JLabel();
        lblUser1 = new javax.swing.JLabel();
        lblAns1 = new javax.swing.JLabel();
        lblAnswer1 = new javax.swing.JLabel();
        txtAnswer1 = new javax.swing.JTextField();
        btnNQ1 = new javax.swing.JButton();
        lblDif1 = new javax.swing.JLabel();
        sldDif1 = new javax.swing.JSlider();
        pnlQuiz = new javax.swing.JPanel();
        lblTitle3 = new javax.swing.JLabel();
        lblQ3 = new javax.swing.JLabel();
        lblQuestion3 = new javax.swing.JLabel();
        lblQA3 = new javax.swing.JLabel();
        lblLine3a = new javax.swing.JLabel();
        lblLine3b = new javax.swing.JLabel();
        lblOutcome3 = new javax.swing.JLabel();
        lblU3 = new javax.swing.JLabel();
        lblUser3 = new javax.swing.JLabel();
        lblAns3 = new javax.swing.JLabel();
        lblAnswer3 = new javax.swing.JLabel();
        lblShow3a = new javax.swing.JLabel();
        lblShow3b = new javax.swing.JLabel();
        lblCP3 = new javax.swing.JLabel();
        lblQNum3 = new javax.swing.JLabel();
        lblShow3c = new javax.swing.JLabel();
        lblFinal3 = new javax.swing.JLabel();
        lblTNum3 = new javax.swing.JLabel();
        btnNQ3 = new javax.swing.JButton();
        txtAnswer3 = new javax.swing.JTextField();
        sldDif3 = new javax.swing.JSlider();
        lblDif3 = new javax.swing.JLabel();
        pnlUnlimited = new javax.swing.JPanel();
        lblTitle2 = new javax.swing.JLabel();
        lblQ2 = new javax.swing.JLabel();
        lblQuestion2 = new javax.swing.JLabel();
        lblQA2 = new javax.swing.JLabel();
        lblLine2a = new javax.swing.JLabel();
        lblLine2B = new javax.swing.JLabel();
        lblOutcome2 = new javax.swing.JLabel();
        lblU2 = new javax.swing.JLabel();
        lblUser2 = new javax.swing.JLabel();
        lblAns2 = new javax.swing.JLabel();
        lblAnswer2 = new javax.swing.JLabel();
        lblShow2a = new javax.swing.JLabel();
        lblCP2 = new javax.swing.JLabel();
        lblShow2b = new javax.swing.JLabel();
        lblHS2 = new javax.swing.JLabel();
        lblDif2 = new javax.swing.JLabel();
        btnNQ2 = new javax.swing.JButton();
        txtAnswer2 = new javax.swing.JTextField();
        sldDif2 = new javax.swing.JSlider();
        btnHome = new javax.swing.JButton();
        btnSandbox = new javax.swing.JButton();
        btnQuiz = new javax.swing.JButton();
        btnUnlimited = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quadratics Teacher");
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pnlBackground.setBackground(new java.awt.Color(0, 204, 204));
        pnlBackground.setForeground(new java.awt.Color(0, 204, 255));

        jlpMultiplePanes.setBackground(new java.awt.Color(102, 102, 102));
        jlpMultiplePanes.setForeground(new java.awt.Color(102, 102, 102));

        pnlHome.setBackground(new java.awt.Color(102, 102, 102));

        lblTitle.setFont(new java.awt.Font("Noteworthy", 1, 48)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Home");

        lblSubtitle1.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        lblSubtitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitle1.setText("Sandbox - ");

        lblSubtitle2.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        lblSubtitle2.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitle2.setText("Quiz          - ");

        lblSubtitle3.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        lblSubtitle3.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitle3.setText("Unlimited -");

        lblFormat1.setFont(new java.awt.Font("Noteworthy", 1, 12)); // NOI18N
        lblFormat1.setForeground(new java.awt.Color(255, 255, 255));
        lblFormat1.setText("Answer should be in this format: a(bx+c)(dx+e). Change a, b, c, d, and e to the correct answer");

        lblFormat2.setFont(new java.awt.Font("Noteworthy", 1, 12)); // NOI18N
        lblFormat2.setForeground(new java.awt.Color(255, 255, 255));
        lblFormat2.setText("For each option, start off by pressing  'New Question' and typing the correct answer next to the");

        txaDescription.setEditable(false);
        txaDescription.setBackground(new java.awt.Color(102, 102, 102));
        txaDescription.setColumns(20);
        txaDescription.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        txaDescription.setForeground(new java.awt.Color(255, 255, 255));
        txaDescription.setLineWrap(true);
        txaDescription.setRows(5);
        txaDescription.setText("Quadratics Teacher is a software program to help you get more comfortable with solving quadratic questions. It is a free and unique way to enjoy and learn quadratics. You can choose from three options, which allow you to practise and test yourself in different ways.");
        txaDescription.setWrapStyleWord(true);
        txaDescription.setBorder(null);
        jScrollPane1.setViewportView(txaDescription);

        txtDescription1.setEditable(false);
        txtDescription1.setBackground(new java.awt.Color(102, 102, 102));
        txtDescription1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        txtDescription1.setForeground(new java.awt.Color(255, 255, 255));
        txtDescription1.setText("Unlimited random questions");

        txtDescription2.setEditable(false);
        txtDescription2.setBackground(new java.awt.Color(102, 102, 102));
        txtDescription2.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        txtDescription2.setForeground(new java.awt.Color(255, 255, 255));
        txtDescription2.setText("More difficult but limited number of questions");

        txtDescription3.setEditable(false);
        txtDescription3.setBackground(new java.awt.Color(102, 102, 102));
        txtDescription3.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        txtDescription3.setForeground(new java.awt.Color(255, 255, 255));
        txtDescription3.setText("Unlimited questions with a scorekeeper");

        lblFormat3.setFont(new java.awt.Font("Noteworthy", 1, 12)); // NOI18N
        lblFormat3.setForeground(new java.awt.Color(255, 255, 255));
        lblFormat3.setText("'Answer' section. You have to press Enter after typing in the answer for the program to process it.");

        jLabel1.setFont(new java.awt.Font("Noteworthy", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Program made by Rishi Sarkar");

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jLabel1))
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubtitle1)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(txtDescription1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubtitle2)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(txtDescription2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblSubtitle3)
                .addGap(3, 3, 3)
                .addComponent(txtDescription3, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblFormat1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblFormat2, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblFormat3, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1))
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubtitle1)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtDescription1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubtitle2)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtDescription2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubtitle3)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtDescription3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(lblFormat1)
                .addGap(0, 0, 0)
                .addComponent(lblFormat2)
                .addGap(0, 0, 0)
                .addComponent(lblFormat3))
        );

        pnlSandbox.setBackground(new java.awt.Color(102, 102, 102));
        pnlSandbox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle1.setFont(new java.awt.Font("Noteworthy", 1, 48)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("Sandbox");
        pnlSandbox.add(lblTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 6, 204, 72));

        lblQ1.setFont(new java.awt.Font("Noteworthy", 1, 20)); // NOI18N
        lblQ1.setForeground(new java.awt.Color(255, 255, 255));
        lblQ1.setText("  Question:");
        pnlSandbox.add(lblQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 97, -1));

        lblQuestion1.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblQuestion1.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion1.setText("   ");
        pnlSandbox.add(lblQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 293, -1));

        lblQA1.setFont(new java.awt.Font("Noteworthy", 1, 21)); // NOI18N
        lblQA1.setForeground(new java.awt.Color(255, 255, 255));
        lblQA1.setText("  Answer:");
        pnlSandbox.add(lblQA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 105, -1));

        lblLine1a.setForeground(new java.awt.Color(255, 255, 255));
        lblLine1a.setText("——————————————————————");
        pnlSandbox.add(lblLine1a, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        lblLine1b.setForeground(new java.awt.Color(255, 255, 255));
        lblLine1b.setText("——————————————————————");
        pnlSandbox.add(lblLine1b, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        lblOutcome1.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        lblOutcome1.setForeground(new java.awt.Color(255, 255, 255));
        lblOutcome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlSandbox.add(lblOutcome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 109, 51));

        lblU1.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblU1.setForeground(new java.awt.Color(255, 255, 255));
        lblU1.setText("Your answer is:");
        pnlSandbox.add(lblU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 277, 93, -1));

        lblUser1.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblUser1.setForeground(new java.awt.Color(255, 255, 255));
        pnlSandbox.add(lblUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 277, 96, 23));

        lblAns1.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblAns1.setForeground(new java.awt.Color(255, 255, 255));
        lblAns1.setText("The correct answer is:");
        pnlSandbox.add(lblAns1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 322, 146, -1));

        lblAnswer1.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblAnswer1.setForeground(new java.awt.Color(255, 255, 255));
        pnlSandbox.add(lblAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 322, 185, 20));

        txtAnswer1.setBackground(new java.awt.Color(102, 102, 102));
        txtAnswer1.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        txtAnswer1.setForeground(new java.awt.Color(255, 255, 255));
        txtAnswer1.setText("   ");
        txtAnswer1.setBorder(null);
        txtAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswer1ActionPerformed(evt);
            }
        });
        pnlSandbox.add(txtAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 165, 286, -1));

        btnNQ1.setText("Next Question");
        btnNQ1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNQ1ActionPerformed(evt);
            }
        });
        pnlSandbox.add(btnNQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 365, 194, -1));

        lblDif1.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblDif1.setForeground(new java.awt.Color(255, 255, 255));
        lblDif1.setText("Difficulty Level");
        pnlSandbox.add(lblDif1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 93, 30));

        sldDif1.setFont(new java.awt.Font("Noteworthy", 1, 11)); // NOI18N
        sldDif1.setForeground(new java.awt.Color(255, 255, 255));
        sldDif1.setMajorTickSpacing(2);
        sldDif1.setMaximum(10);
        sldDif1.setMinimum(4);
        sldDif1.setMinorTickSpacing(1);
        sldDif1.setOrientation(javax.swing.JSlider.VERTICAL);
        sldDif1.setPaintLabels(true);
        sldDif1.setPaintTrack(false);
        sldDif1.setValue(5);
        sldDif1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldDif1StateChanged(evt);
            }
        });
        pnlSandbox.add(sldDif1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 40, -1));

        pnlQuiz.setBackground(new java.awt.Color(102, 102, 102));
        pnlQuiz.setPreferredSize(new java.awt.Dimension(490, 363));

        lblTitle3.setFont(new java.awt.Font("Noteworthy", 1, 48)); // NOI18N
        lblTitle3.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle3.setText("Quiz");

        lblQ3.setFont(new java.awt.Font("Noteworthy", 1, 20)); // NOI18N
        lblQ3.setForeground(new java.awt.Color(255, 255, 255));
        lblQ3.setText("  Question:");

        lblQuestion3.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblQuestion3.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion3.setText("   ");

        lblQA3.setFont(new java.awt.Font("Noteworthy", 1, 21)); // NOI18N
        lblQA3.setForeground(new java.awt.Color(255, 255, 255));
        lblQA3.setText("  Answer:");

        lblLine3a.setForeground(new java.awt.Color(255, 255, 255));
        lblLine3a.setText("——————————————————————");

        lblLine3b.setForeground(new java.awt.Color(255, 255, 255));
        lblLine3b.setText("——————————————————————");

        lblOutcome3.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        lblOutcome3.setForeground(new java.awt.Color(255, 255, 255));
        lblOutcome3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOutcome3.setText("   ");

        lblU3.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblU3.setForeground(new java.awt.Color(255, 255, 255));
        lblU3.setText("Your answer is:");

        lblUser3.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblUser3.setForeground(new java.awt.Color(255, 255, 255));
        lblUser3.setText("   ");

        lblAns3.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblAns3.setForeground(new java.awt.Color(255, 255, 255));
        lblAns3.setText("The correct answer is: ");

        lblAnswer3.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblAnswer3.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer3.setText("   ");

        lblShow3a.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblShow3a.setForeground(new java.awt.Color(255, 255, 255));
        lblShow3a.setText("Current Points:");

        lblShow3b.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblShow3b.setForeground(new java.awt.Color(255, 255, 255));
        lblShow3b.setText("Final Score:");

        lblCP3.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblCP3.setForeground(new java.awt.Color(255, 255, 255));
        lblCP3.setText("0");

        lblQNum3.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblQNum3.setForeground(new java.awt.Color(255, 255, 255));
        lblQNum3.setText("0");

        lblShow3c.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblShow3c.setForeground(new java.awt.Color(255, 255, 255));
        lblShow3c.setText("Q");

        lblFinal3.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblFinal3.setForeground(new java.awt.Color(255, 255, 255));
        lblFinal3.setText("   ");

        lblTNum3.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblTNum3.setForeground(new java.awt.Color(255, 255, 255));
        lblTNum3.setText("Out of   10");

        btnNQ3.setText("Next Question");
        btnNQ3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNQ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNQ3ActionPerformed(evt);
            }
        });

        txtAnswer3.setBackground(new java.awt.Color(102, 102, 102));
        txtAnswer3.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        txtAnswer3.setForeground(new java.awt.Color(255, 255, 255));
        txtAnswer3.setText("   ");
        txtAnswer3.setBorder(null);
        txtAnswer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswer3ActionPerformed(evt);
            }
        });

        sldDif3.setFont(new java.awt.Font("Noteworthy", 1, 11)); // NOI18N
        sldDif3.setForeground(new java.awt.Color(255, 255, 255));
        sldDif3.setMajorTickSpacing(2);
        sldDif3.setMaximum(10);
        sldDif3.setMinimum(4);
        sldDif3.setMinorTickSpacing(1);
        sldDif3.setOrientation(javax.swing.JSlider.VERTICAL);
        sldDif3.setPaintLabels(true);
        sldDif3.setPaintTrack(false);
        sldDif3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldDif3StateChanged(evt);
            }
        });

        lblDif3.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblDif3.setForeground(new java.awt.Color(255, 255, 255));
        lblDif3.setText("Difficulty Level");

        javax.swing.GroupLayout pnlQuizLayout = new javax.swing.GroupLayout(pnlQuiz);
        pnlQuiz.setLayout(pnlQuizLayout);
        pnlQuizLayout.setHorizontalGroup(
            pnlQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuizLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(sldDif3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblQA3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblQ3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(lblDif3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblLine3b))
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblLine3a))
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(txtAnswer3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lblOutcome3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(pnlQuizLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lblUser3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblU3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lblShow3a, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(pnlQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblTNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCP3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(pnlQuizLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lblAnswer3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAns3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(lblShow3b)
                .addGap(28, 28, 28)
                .addComponent(lblFinal3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlQuizLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnNQ3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(lblShow3c)
                .addGap(9, 9, 9)
                .addComponent(lblQNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlQuizLayout.setVerticalGroup(
            pnlQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuizLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(sldDif3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lblQA3))
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblQ3))
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblDif3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(lblLine3b))
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblLine3a))
                    .addComponent(lblTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(txtAnswer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(lblOutcome3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblQuestion3)))
                .addGap(26, 26, 26)
                .addGroup(pnlQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser3)
                    .addComponent(lblU3)
                    .addComponent(lblShow3a)
                    .addComponent(lblTNum3)
                    .addComponent(lblCP3))
                .addGap(7, 7, 7)
                .addGroup(pnlQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnswer3)
                    .addComponent(lblAns3)
                    .addGroup(pnlQuizLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblShow3b)
                            .addComponent(lblFinal3))))
                .addGap(7, 7, 7)
                .addGroup(pnlQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNQ3)
                    .addComponent(lblShow3c)
                    .addComponent(lblQNum3)))
        );

        pnlUnlimited.setBackground(new java.awt.Color(102, 102, 102));
        pnlUnlimited.setForeground(new java.awt.Color(102, 102, 102));
        pnlUnlimited.setPreferredSize(new java.awt.Dimension(490, 363));

        lblTitle2.setFont(new java.awt.Font("Noteworthy", 1, 48)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle2.setText("Unlimited");

        lblQ2.setFont(new java.awt.Font("Noteworthy", 1, 20)); // NOI18N
        lblQ2.setForeground(new java.awt.Color(255, 255, 255));
        lblQ2.setText("  Question:");

        lblQuestion2.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblQuestion2.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion2.setText("   ");

        lblQA2.setFont(new java.awt.Font("Noteworthy", 1, 21)); // NOI18N
        lblQA2.setForeground(new java.awt.Color(255, 255, 255));
        lblQA2.setText("  Answer:");

        lblLine2a.setForeground(new java.awt.Color(255, 255, 255));
        lblLine2a.setText("——————————————————————");

        lblLine2B.setForeground(new java.awt.Color(255, 255, 255));
        lblLine2B.setText("——————————————————————");

        lblOutcome2.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        lblOutcome2.setForeground(new java.awt.Color(255, 255, 255));
        lblOutcome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOutcome2.setText("   ");

        lblU2.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblU2.setForeground(new java.awt.Color(255, 255, 255));
        lblU2.setText("Your answer is:");

        lblUser2.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblUser2.setForeground(new java.awt.Color(255, 255, 255));
        lblUser2.setText("   ");

        lblAns2.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblAns2.setForeground(new java.awt.Color(255, 255, 255));
        lblAns2.setText("The correct answer is:");

        lblAnswer2.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblAnswer2.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer2.setText("   ");

        lblShow2a.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblShow2a.setForeground(new java.awt.Color(255, 255, 255));
        lblShow2a.setText("Current Points:");

        lblCP2.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblCP2.setForeground(new java.awt.Color(255, 255, 255));
        lblCP2.setText("0");

        lblShow2b.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblShow2b.setForeground(new java.awt.Color(255, 255, 255));
        lblShow2b.setText("High Score:");

        lblHS2.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblHS2.setForeground(new java.awt.Color(255, 255, 255));
        lblHS2.setText("0");

        lblDif2.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        lblDif2.setForeground(new java.awt.Color(255, 255, 255));
        lblDif2.setText("Difficulty Level");

        btnNQ2.setText("Next Question");
        btnNQ2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNQ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNQ2ActionPerformed(evt);
            }
        });

        txtAnswer2.setBackground(new java.awt.Color(102, 102, 102));
        txtAnswer2.setFont(new java.awt.Font("Noteworthy", 1, 14)); // NOI18N
        txtAnswer2.setForeground(new java.awt.Color(255, 255, 255));
        txtAnswer2.setText("   ");
        txtAnswer2.setBorder(null);
        txtAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswer2ActionPerformed(evt);
            }
        });

        sldDif2.setFont(new java.awt.Font("Noteworthy", 1, 11)); // NOI18N
        sldDif2.setForeground(new java.awt.Color(255, 255, 255));
        sldDif2.setMajorTickSpacing(2);
        sldDif2.setMaximum(10);
        sldDif2.setMinimum(4);
        sldDif2.setMinorTickSpacing(1);
        sldDif2.setOrientation(javax.swing.JSlider.VERTICAL);
        sldDif2.setPaintLabels(true);
        sldDif2.setPaintTrack(false);
        sldDif2.setValue(5);
        sldDif2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldDif2StateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlUnlimitedLayout = new javax.swing.GroupLayout(pnlUnlimited);
        pnlUnlimited.setLayout(pnlUnlimitedLayout);
        pnlUnlimitedLayout.setHorizontalGroup(
            pnlUnlimitedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlUnlimitedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGroup(pnlUnlimitedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(txtAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(pnlUnlimitedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(lblOutcome2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                                .addComponent(lblAns2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lblAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(lblShow2b)))
                        .addGap(9, 9, 9)
                        .addComponent(lblHS2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblU2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(lblShow2a, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lblLine2B))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lblQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lblLine2a, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(lblCP2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(sldDif2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblQA2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(lblDif2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnNQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlUnlimitedLayout.setVerticalGroup(
            pnlUnlimitedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlUnlimitedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(txtAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(pnlUnlimitedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(lblUser2))
                            .addComponent(lblOutcome2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(pnlUnlimitedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAns2)
                            .addComponent(lblAnswer2)
                            .addComponent(lblShow2b)))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(lblHS2))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(lblU2))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(lblShow2a))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(lblLine2B))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblQuestion2))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblLine2a))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblQ2))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(lblCP2))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(sldDif2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(lblQA2))
                    .addGroup(pnlUnlimitedLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblDif2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(btnNQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jlpMultiplePanes.setLayer(pnlHome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpMultiplePanes.setLayer(pnlSandbox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpMultiplePanes.setLayer(pnlQuiz, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpMultiplePanes.setLayer(pnlUnlimited, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpMultiplePanesLayout = new javax.swing.GroupLayout(jlpMultiplePanes);
        jlpMultiplePanes.setLayout(jlpMultiplePanesLayout);
        jlpMultiplePanesLayout.setHorizontalGroup(
            jlpMultiplePanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
            .addGroup(jlpMultiplePanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlUnlimited, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
            .addGroup(jlpMultiplePanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
            .addGroup(jlpMultiplePanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlSandbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jlpMultiplePanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpMultiplePanesLayout.setVerticalGroup(
            jlpMultiplePanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jlpMultiplePanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlUnlimited, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
            .addGroup(jlpMultiplePanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
            .addGroup(jlpMultiplePanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlSandbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jlpMultiplePanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnHome.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        btnHome.setText("Home");
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnSandbox.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        btnSandbox.setText("Sandbox");
        btnSandbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSandbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSandboxActionPerformed(evt);
            }
        });

        btnQuiz.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        btnQuiz.setText("Quiz");
        btnQuiz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizActionPerformed(evt);
            }
        });

        btnUnlimited.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        btnUnlimited.setText("Unlimited");
        btnUnlimited.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUnlimited.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnlimitedActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnQuiz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(btnSandbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(btnUnlimited, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlpMultiplePanes))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSandbox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUnlimited, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jlpMultiplePanes)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//*****************************************
    private static int random(int min, int max) {//random number < equation is what I am more comfortable with
        int rNum = (int)(Math.random()*(max-min+1)+min);
        return rNum;
    }
    private static boolean factor(int a, int b) {//checks for common factors between two given numbers. Returns true if there are is than 1 common factor
        a = Math.abs(a);//user given variables
        b = Math.abs(b);
        //***************
        if (a < b) {//sorting out bigger number, making 'a' bigger than 'b'
            int temp = a;
            a = b;
            b = temp;
        }
        int factor = 1;//initializing common factor as 1
        //***************
        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                factor = i;//finding common factors and changing the value of factor depeding on the results
            }
        }
        //***************
        if (factor > 1) {//returning true or false depending on the number of factors common
            return true;
        } else {
            return false;
        }
    }
    private static void generate() {//generating random numbers for the 5 variables needed for the construction of the question & answer
        
        do {//not allowing any number to be 0 (for simplicity and comfort for the user)
            q = random(-2, -2);
        } while (q == 0);//allowing 'q' to be from -2 to 2 (making it easier for the user)
        
        do {//allowing 'w' & 'r' to be from 1 to max (due to q already having an option for negative)
            w = random(1, max);
        } while (w == 0);
        do {
            e = random(min, max);//allowing 'e' & 't' to be from min to max
        } while (e == 0 || factor(e, w));//not allowing them to have a common factor with 'w' or 'r' (not needed because of 'q')
        do {
            r = random(1, max);
        } while (r == 0);
        do {
            t = random(min, max);
        } while (t == 0 || factor(t, r));
    }
    private static void expand() {//simpliying the equation using the formula in line 13 to construct the question
        a = q*r*w;
        b = (q*e*r) + (q*w*t);
        c = q*e*t;
    }
    private static String question() {//construction the question
        String question = "";//blank start; Question asked to the user
        //***************
        switch (a) {// if 'a' = 1, the program won't show it, but will show the negative sign if it's -1 (for user's comfort)
            case -1:
                question += "-x² ";
                break;
            case 1:
                question += "x² ";
                break;
            default:
                question += a + "x² ";
                break;
        }
        //***************
        if (b == 1) {//cases for 'b' = 1, 'b' = -1, 'b' < 0, 'b' > 0
            question += "+ x ";
        } else if (b == -1) {
            question += "- x ";
        } else if (b < 0) {
            question += "- " + Math.abs(b) +"x ";
        } else {
            question += "+ " + b +"x ";
        }
        //***************
        if (c < 0) {//cases for 'c' < 0, 'c' > 0
            question += "- " + Math.abs(c);
        } else {
            question += "+ " + c;
        }
        //***************
        return question;
    }
    private static String answer() {//construct the answer
        coef = "";//the three parts of the answer explained in line 14
        first = "";
        second = "";
        //*************** (coef)
        switch (q) {//if 'coef' is 1, it is not shown in the answer and not required from the user
            case 1:
                coef += "";
                break;
            case -1:
                coef += "-";
                break;
            default:
                coef += q + "";
                break;
        }
        //*************** (first)
        first += "(";//deals with the second part of the answer
        if (w == 1) {
            first += "x";
        } else {
            first += w + "x";
        }
        if (e > 0) {
            first += "+" + e + ")";
        } else {
            first += e +")";
        }
        //*************** (second)
        if (r == 1) {//deals with the third part of the answer
            second += "(x";
        } else {
            second += "(" + r + "x";
        }
        if (t > 0) {
            second += "+" + t + ")";
        } else {
            second += t +")";
        }
        String answer = coef + first + second;
        return answer;
    }
    private static boolean check(String user) {//compares the user's answer with the correct answer
        
        String answer = coef + first + second, answer1 = coef + second + first;
        
        if (answer.equals(user) || answer1.equals(user)) {//allows the user to put the answer in any order
            return true;
        } else {
            return false;
        }
    }
    private static void difficulty(int dif) {//adjusts difficulty
        String Max = Integer.toString(dif);
        String Min = "-" + Max;
        max = Integer.parseInt(Max);
        min = Integer.parseInt(Min);
    }
//*****************************************
    private void btnSandboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSandboxActionPerformed
        this.pnlHome.setVisible(false);
        this.pnlSandbox.setVisible(true);//changes 'tabs'
        this.pnlUnlimited.setVisible(false);
        this.pnlQuiz.setVisible(false);
        this.btnHome.setForeground(Color.BLACK);
        this.btnSandbox.setForeground(Color.red);//sets button color to red to indicate that it is opened and sets the others to default
        this.btnUnlimited.setForeground(Color.BLACK);
        this.btnQuiz.setForeground(Color.BLACK);
        max = 5;//sets the 'min' and 'max' to default
        min = -5;
    }//GEN-LAST:event_btnSandboxActionPerformed
    private void btnQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizActionPerformed
        this.pnlHome.setVisible(false);
        this.pnlSandbox.setVisible(false);
        this.pnlUnlimited.setVisible(false);
        this.pnlQuiz.setVisible(true);//changes 'tabs'
        this.btnHome.setForeground(Color.BLACK);
        this.btnSandbox.setForeground(Color.BLACK);
        this.btnUnlimited.setForeground(Color.BLACK);
        this.btnQuiz.setForeground(Color.red);//sets button color to red to indicate that it is opened and sets the others to default
        max = 10;//sets the 'min' and 'max' to more difficult numbers
        min = -10;
    }//GEN-LAST:event_btnQuizActionPerformed
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        this.pnlHome.setVisible(true);//changes 'tabs'
        this.pnlSandbox.setVisible(false);
        this.pnlUnlimited.setVisible(false);
        this.pnlQuiz.setVisible(false);
        this.btnHome.setForeground(Color.red);//sets button color to red to indicate that it is opened and sets the others to default
        this.btnSandbox.setForeground(Color.BLACK);
        this.btnUnlimited.setForeground(Color.BLACK);
        this.btnQuiz.setForeground(Color.BLACK);
        max = 5;//sets the 'min' and 'max' to default
        min = -5;
    }//GEN-LAST:event_btnHomeActionPerformed
    private void btnUnlimitedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnlimitedActionPerformed
        this.pnlHome.setVisible(false);
        this.pnlSandbox.setVisible(false);
        this.pnlUnlimited.setVisible(true);//changes 'tabs'
        this.pnlQuiz.setVisible(false);
        this.btnHome.setForeground(Color.BLACK);
        this.btnSandbox.setForeground(Color.BLACK);
        this.btnUnlimited.setForeground(Color.red);//sets button color to red to indicate that it is opened and sets the others to default
        this.btnQuiz.setForeground(Color.BLACK);
        max = 5;//sets the 'min' and 'max' to default
        min = -5;
    }//GEN-LAST:event_btnUnlimitedActionPerformed
//*****************************************
    private void txtAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswer1ActionPerformed
        String user = this.txtAnswer1.getText();//user input
        this.lblUser1.setText(user);//displays user's answer
        this.lblAnswer1.setText(answer());//displays the correct answer
        if (check(this.txtAnswer1.getText())) {//checks if the user is correct or wrong and displays the corresponding message
            this.lblOutcome1.setText("Correct!");
        } else {
            this.lblOutcome1.setText("Wrong!");
        }
        this.txtAnswer1.setText("");//sets the text field where the user write his/her answer to blank
        
        difficulty(this.sldDif1.getValue());////adjusts difficulty
        generate();//generates random numbers for the contruction of the answer
        expand();//simplifies the random numbers for the construction of the question
        
        this.lblQuestion1.setText(question());//generates and displays the new question
    }//GEN-LAST:event_txtAnswer1ActionPerformed
    private void btnNQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNQ1ActionPerformed
        difficulty(this.sldDif1.getValue());////adjusts difficulty
        generate();//generates random numbers for the contruction of the answer
        expand();//simplifies the random numbers for the construction of the question
        
        this.lblQuestion1.setText(question());//generates and displays the new question
        this.lblUser1.setText("");//resets the user's answer's label
        this.lblAnswer1.setText("");//resets the correct answer's label
        this.lblOutcome1.setText("");//resets the outcome label
        this.txtAnswer1.setText("");
    }//GEN-LAST:event_btnNQ1ActionPerformed
//*****************************************
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Not able to delete but is not needed
    }//GEN-LAST:event_formWindowActivated
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.pnlHome.setVisible(true);//opens the Home panel when the program is first run
        this.pnlSandbox.setVisible(false);
        this.pnlUnlimited.setVisible(false);
        this.pnlQuiz.setVisible(false);
        this.btnHome.setForeground(Color.red);//sets button color to red to indicate that it is opened and sets the others to default
        this.btnSandbox.setForeground(Color.BLACK);
        this.btnUnlimited.setForeground(Color.BLACK);
        this.btnQuiz.setForeground(Color.BLACK);
    }//GEN-LAST:event_formWindowOpened
//*****************************************
    private void txtAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswer2ActionPerformed
        String user = this.txtAnswer2.getText();
        this.lblUser2.setText(user);
        this.lblAnswer2.setText(answer());
        if (check(this.txtAnswer2.getText())) {
            this.lblOutcome2.setText("Correct!");
            cp++;//adds points to the user's current running score
            if (cp > hs) {//if highschore is similar to current score, one point is added to the highscore
                hs++;
            }
            this.lblCP2.setText(cp + "");//displays the current points and highscore
            this.lblHS2.setText(hs + "");
        } else {
            this.lblOutcome2.setText("Wrong!");
            cp = 0;//resets the current points
            this.lblCP2.setText(cp + "");//displays the current points and highscore
            this.lblHS2.setText(hs + "");
        }
        this.txtAnswer2.setText("");
        
        difficulty(this.sldDif1.getValue());
        generate();
        expand();
        
        this.lblQuestion2.setText(question());
    }//GEN-LAST:event_txtAnswer2ActionPerformed
    private void btnNQ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNQ2ActionPerformed
        difficulty(this.sldDif1.getValue());
        generate();
        expand();
        
        this.lblQuestion2.setText(question());
        this.lblUser2.setText("");
        this.lblAnswer2.setText("");
        this.lblOutcome2.setText("");
        this.txtAnswer2.setText("");
    }//GEN-LAST:event_btnNQ2ActionPerformed
//*****************************************
    private void txtAnswer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswer3ActionPerformed
        String user = this.txtAnswer3.getText();
        this.lblUser3.setText(user);
        this.lblQNum3.setText(qNum + "");//changes the question number on the bottom of the screen
        this.lblQ3.setText("Question " + qNum + ":");//changes the question number in the middle of the screen
        this.lblAnswer3.setText(answer());
        if (check(this.txtAnswer3.getText())) {
            this.lblOutcome3.setText("Correct!");
            cpq++;//adds points of the user's current running points
            this.lblCP3.setText(cpq + "");//displays the current points
        } else {
            this.lblOutcome3.setText("Wrong!");
            this.lblCP3.setText(cpq + "");//displays the current points
        }
        this.txtAnswer3.setText("");
        
        difficulty(this.sldDif1.getValue());
        generate();
        expand();
        
        if (qNum == 10) {//if its the last question
            int total;
            total = cpq*10;//finds the final score of the user in percentage (*10 because the quiz is out of 10 questions)
            this.lblFinal3.setText(total + "%");
            this.lblUser3.setText("");//resets the question to blank
            this.txtAnswer3.setText("Press 'Next Question' to continue");//sets the answer to a message saying to press 'Next Question'
            this.txtAnswer3.setEditable(false);//disables editing the text field to write answers
            this.lblQuestion3.setText("");
            qNum = 1;//resets the question number
            this.btnNQ3.setEnabled(true);//enables the 'Next Question'
            this.sldDif3.setEnabled(true);//enables the difficulty slider
        } else {//if it isn't the last question
            this.lblQuestion3.setText(question());
            qNum++;//increases the question number by 1
            this.btnNQ3.setEnabled(false);//disables the 'Next Question'
            this.sldDif3.setEnabled(false);//disabled the difficulty slider
        }
        
    }//GEN-LAST:event_txtAnswer3ActionPerformed
    private void btnNQ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNQ3ActionPerformed
        difficulty(this.sldDif3.getValue());
        generate();
        expand();
        
        this.lblQuestion3.setText(question());
        this.lblUser3.setText("");
        this.lblAnswer3.setText("");
        this.lblOutcome3.setText("");
        this.txtAnswer3.setText("");
        this.lblQNum3.setText(qNum + "");//shows the question number in the bottom of the screen
        qNum++;//increases the question number by 1
        this.lblFinal3.setText("");// sets the final score label to blank
        this.btnNQ3.setEnabled(false);//disabled the 'Next Question'
        this.sldDif3.setEnabled(false);//disabled the difficulty slider
        this.lblQ3.setText("Question 1:");//shows the question number in the middle of the screen
        this.txtAnswer3.setEditable(true);//allows the user to edit the text field
        //The code under this line is either a glitch or a feature that I could not fix. It does not mess up the code but is just an extra line of code
        this.txtAnswer3.setText("");    }//GEN-LAST:event_btnNQ3ActionPerformed
//*****************************************
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);//exits the program
    }//GEN-LAST:event_btnExitActionPerformed
//*****************************************
    private void sldDif1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldDif1StateChanged
        difficulty(this.sldDif1.getValue());
    }//GEN-LAST:event_sldDif1StateChanged
    private void sldDif2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldDif2StateChanged
        difficulty(this.sldDif2.getValue());
    }//GEN-LAST:event_sldDif2StateChanged
    private void sldDif3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldDif3StateChanged
        difficulty(this.sldDif3.getValue());
    }//GEN-LAST:event_sldDif3StateChanged
//*****************************************

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Quadratics_Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quadratics_Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quadratics_Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quadratics_Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quadratics_Teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnNQ1;
    private javax.swing.JButton btnNQ2;
    private javax.swing.JButton btnNQ3;
    private javax.swing.JButton btnQuiz;
    private javax.swing.JButton btnSandbox;
    private javax.swing.JButton btnUnlimited;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane jlpMultiplePanes;
    private javax.swing.JLabel lblAns1;
    private javax.swing.JLabel lblAns2;
    private javax.swing.JLabel lblAns3;
    private javax.swing.JLabel lblAnswer1;
    private javax.swing.JLabel lblAnswer2;
    private javax.swing.JLabel lblAnswer3;
    private javax.swing.JLabel lblCP2;
    private javax.swing.JLabel lblCP3;
    private javax.swing.JLabel lblDif1;
    private javax.swing.JLabel lblDif2;
    private javax.swing.JLabel lblDif3;
    private javax.swing.JLabel lblFinal3;
    private javax.swing.JLabel lblFormat1;
    private javax.swing.JLabel lblFormat2;
    private javax.swing.JLabel lblFormat3;
    private javax.swing.JLabel lblHS2;
    private javax.swing.JLabel lblLine1a;
    private javax.swing.JLabel lblLine1b;
    private javax.swing.JLabel lblLine2B;
    private javax.swing.JLabel lblLine2a;
    private javax.swing.JLabel lblLine3a;
    private javax.swing.JLabel lblLine3b;
    private javax.swing.JLabel lblOutcome1;
    private javax.swing.JLabel lblOutcome2;
    private javax.swing.JLabel lblOutcome3;
    private javax.swing.JLabel lblQ1;
    private javax.swing.JLabel lblQ2;
    private javax.swing.JLabel lblQ3;
    private javax.swing.JLabel lblQA1;
    private javax.swing.JLabel lblQA2;
    private javax.swing.JLabel lblQA3;
    private javax.swing.JLabel lblQNum3;
    private javax.swing.JLabel lblQuestion1;
    private javax.swing.JLabel lblQuestion2;
    private javax.swing.JLabel lblQuestion3;
    private javax.swing.JLabel lblShow2a;
    private javax.swing.JLabel lblShow2b;
    private javax.swing.JLabel lblShow3a;
    private javax.swing.JLabel lblShow3b;
    private javax.swing.JLabel lblShow3c;
    private javax.swing.JLabel lblSubtitle1;
    private javax.swing.JLabel lblSubtitle2;
    private javax.swing.JLabel lblSubtitle3;
    private javax.swing.JLabel lblTNum3;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblTitle3;
    private javax.swing.JLabel lblU1;
    private javax.swing.JLabel lblU2;
    private javax.swing.JLabel lblU3;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JLabel lblUser2;
    private javax.swing.JLabel lblUser3;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlQuiz;
    private javax.swing.JPanel pnlSandbox;
    private javax.swing.JPanel pnlUnlimited;
    private javax.swing.JSlider sldDif1;
    private javax.swing.JSlider sldDif2;
    private javax.swing.JSlider sldDif3;
    private javax.swing.JTextArea txaDescription;
    private javax.swing.JTextField txtAnswer1;
    private javax.swing.JTextField txtAnswer2;
    private javax.swing.JTextField txtAnswer3;
    private javax.swing.JTextField txtDescription1;
    private javax.swing.JTextField txtDescription2;
    private javax.swing.JTextField txtDescription3;
    // End of variables declaration//GEN-END:variables
}