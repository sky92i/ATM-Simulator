import java.io.PrintStream;
import java.awt.event.*;
import javax.swing.Timer;

public class ATMGui extends javax.swing.JFrame {
    // Creates new form ATMGui
    public ATMGui() {
        initComponents();
        userAuthenticated = false; // user is not authenticated to start
        currentAccountNumber = 0; // no current account number to start
        screen = new Screen(); // create screen
        keypad = new Keypad(); // create keypad 
        cashDispenser = new CashDispenser(); // create cash dispenser
        bankDatabase = new BankDatabase(); // create acct info database
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnZero = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnDot = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnTwoZero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        btnOne.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnOne, gridBagConstraints);

        btnTwo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnTwo, gridBagConstraints);

        btnThree.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnThree, gridBagConstraints);

        btnFour.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnFour, gridBagConstraints);

        btnFive.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnFive, gridBagConstraints);

        btnSix.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnSix, gridBagConstraints);

        btnSeven.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnSeven, gridBagConstraints);

        btnEight.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnEight, gridBagConstraints);

        btnNine.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnNine, gridBagConstraints);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(9);
        jTextArea1.setText("Welcome!\nPlease insert your card.\n(Enter your account number)");
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        btnZero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnZero, gridBagConstraints);

        btnA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnA.setText(">>>");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        getContentPane().add(btnA, gridBagConstraints);

        btnB.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnB.setText(">>>");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(btnB, gridBagConstraints);

        btnD.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnD.setText("<<<");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        getContentPane().add(btnD, gridBagConstraints);

        btnE.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnE.setText("<<<");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        getContentPane().add(btnE, gridBagConstraints);

        btnEnter.setBackground(new java.awt.Color(153, 255, 153));
        btnEnter.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEnter.setText("ENTER");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnEnter, gridBagConstraints);

        btnClear.setBackground(new java.awt.Color(255, 204, 102));
        btnClear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.setToolTipText("");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnClear, gridBagConstraints);

        btnCancel.setBackground(new java.awt.Color(255, 102, 102));
        btnCancel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnCancel, gridBagConstraints);

        jTextField1.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jTextField1, gridBagConstraints);

        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnDot, gridBagConstraints);

        btnC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnC.setText(">>>");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(btnC, gridBagConstraints);

        btnF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnF.setText("<<<");
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        getContentPane().add(btnF, gridBagConstraints);

        btnTwoZero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnTwoZero.setText("00");
        btnTwoZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoZeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnTwoZero, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        if (state == 1) {
            jTextField1.setText(jTextField1.getText() + "*");
            tempPin.append("1");
        }
        else jTextField1.setText(jTextField1.getText() + "1");
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        if (state == 1) {
            jTextField1.setText(jTextField1.getText() + "*");
            tempPin.append("2");
        }
        else jTextField1.setText(jTextField1.getText() + "2");
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        if (state == 1) {
            jTextField1.setText(jTextField1.getText() + "*");
            tempPin.append("3");
        }
        else jTextField1.setText(jTextField1.getText() + "3");
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        if (state == 1) {
            jTextField1.setText(jTextField1.getText() + "*");
            tempPin.append("4");
        }
        else jTextField1.setText(jTextField1.getText() + "4");
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        if (state == 1) {
            jTextField1.setText(jTextField1.getText() + "*");
            tempPin.append("5");
        }
        else jTextField1.setText(jTextField1.getText() + "5");
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        if (state == 1) {
            jTextField1.setText(jTextField1.getText() + "*");
            tempPin.append("6");
        }
        else jTextField1.setText(jTextField1.getText() + "6");
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        if (state == 1) {
            jTextField1.setText(jTextField1.getText() + "*");
            tempPin.append("7");
        }
        else jTextField1.setText(jTextField1.getText() + "7");
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        if (state == 1) {
            jTextField1.setText(jTextField1.getText() + "*");
            tempPin.append("8");
        }
        else jTextField1.setText(jTextField1.getText() + "8");
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        if (state == 1) {
            jTextField1.setText(jTextField1.getText() + "*");
            tempPin.append("9");
        }
        else jTextField1.setText(jTextField1.getText() + "9");
    }//GEN-LAST:event_btnNineActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        if (state == 1) {
            jTextField1.setText(jTextField1.getText() + "*");
            tempPin.append("0");
        }
        else jTextField1.setText(jTextField1.getText() + "0");
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        if (jTextField1.getText().indexOf(".") != -1) return;
        else if (state == 1 || state == 0 || state == 22 || state == 2 || state == 231 || state == 88)
            return;
        else jTextField1.setText(jTextField1.getText() + ".");
    }//GEN-LAST:event_btnDotActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        switch (state) {
            case 0:
                tempAccountNo = 0;
                tempPin.setLength(0);
                tempAccountNo = getIntValue();
                if(tempAccountNo == 0) break;
                state = 1;
                textFieldclear();
                jTextArea1.setText("Please enter your PIN."
                        + "\n\n\n\n\t                             Exit<<");
                break;
            case 1:
                String tempPinFinal = tempPin.toString();
                if(tempPinFinal.equals("")) break;
                userAuthenticated = bankDatabase.authenticateUser( tempAccountNo, Integer.parseInt(tempPinFinal) );
                if (userAuthenticated) {
                    state = 2;
                    textFieldclear();
                    currentAccountNumber = tempAccountNo;
                    displayMainMenu();
                }
                else {
                    jTextArea1.setText("Wrong PIN.");
                    delayText(2000, "Please enter your PIN."
                            + "\n\n\n\n\t                             Exit<<");
                    tempPin.setLength(0);
                    textFieldclear();
                    state = 1;
                }
                break;
            case 22:
                amountInput = getIntValue();
                if (amountInput % 100 != 0 || amountInput == 0) {
                    jTextArea1.setText("\nInvalid value. Please try again.");
                    ActionListener taskPerformer = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            textAreaclear();
                            displayMenuOfAmountsWithdraw();
                        }
                    };
                    Timer timer = new Timer(2000, taskPerformer);
                    timer.setRepeats(false);
                    timer.start();
                    textFieldclear();
                }
                else {
                    textAreaclear(); textFieldclear();
                    jTextArea1.setText("Comfirmation\n\nWithdraw $" + amountInput + "\nPress Enter button to continue."
                            + "\n\t                             Back<<");
                    state = 221;
                }
                break;
            case 221:
                textAreaclear(); textFieldclear();
                if(bankDatabase.overdrawnAvailability(currentAccountNumber)) {
                    if(bankDatabase.getAvailableBalance(currentAccountNumber) <= 0)
                        availableBalance = bankDatabase.getOverdrawnLimit(currentAccountNumber);
                    else
                        availableBalance = bankDatabase.getOverdrawnLimit(currentAccountNumber) +
                                bankDatabase.getAvailableBalance(currentAccountNumber);
                }
                else
                    availableBalance = bankDatabase.getAvailableBalance(currentAccountNumber);
                
                if(amountInput <= availableBalance) {
                    if ( cashDispenser.isSufficientCashAvailable(amountInput)) {
                        state = 882;
                        performTransactions();
                    }
                    else {
                        screen.displayMessageLine( 
                            "\nInsufficient cash available in the ATM." +
                            "\nPlease choose a smaller amount." );
                        ActionListener taskPerformer = new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                textAreaclear(); state = 22;
                                displayMenuOfAmountsWithdraw();
                            }
                        };
                        Timer timer = new Timer(3500, taskPerformer);
                        timer.setRepeats(false);
                        timer.start();
                        textFieldclear();
                    }
                }
                else {
                    screen.displayMessageLine( 
                        "\nInsufficient funds in your account." +
                        "\nPlease choose a smaller amount." );
                    ActionListener taskPerformer = new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                textAreaclear(); state = 22;
                                displayMenuOfAmountsWithdraw();
                            }
                        };
                        Timer timer = new Timer(3500, taskPerformer);
                        timer.setRepeats(false);
                        timer.start();
                        textFieldclear();
                }
                break;
            case 231:
                accountInput = getIntValue();
                if (bankDatabase.accountExistence(accountInput) || accountInput == tempAccountNo) {
                    jTextArea1.setText("Account does not exist"
                            + "\n\nOR"
                            + "\n\nSelf‐transfer is not allowed");
                    ActionListener taskPerformer = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            textAreaclear();
                            displayMenuOfPayee();
                        }
                    };
                    Timer timer = new Timer(3500, taskPerformer);
                    timer.setRepeats(false);
                    timer.start();
                    textFieldclear();
                }
                else {
                    state = 232;
                    textAreaclear();
                    textFieldclear();
                    displayMenuOfAmountsTransfer();
                }
                break;
            case 232:
                if (!isValidDouble() || getDoubleValue() == 0) {
                    jTextArea1.setText("\nInvalid value. Please enter again.");
                    ActionListener taskPerformer = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            textAreaclear();
                            textFieldclear();
                            displayMenuOfAmountsTransfer();
                        }
                    };
                    Timer timer = new Timer(2000, taskPerformer);
                    timer.setRepeats(false);
                    timer.start();
                    textFieldclear();
                }          
                else {
                    amountInput = getDoubleValue();
                    textAreaclear();
                    performTransactions();
                    state = 883;
                }
                break;
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        if (state == 1) { tempPin.setLength(0); }
            jTextField1.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        textFieldclear();
        if (state == 2) {
            state = 88;
            mainMenuSelection = 1;
            PrintStream printStream = new PrintStream(new CustomOutputStream(jTextArea1));
            System.setOut(printStream);
            System.setErr(printStream);
            textAreaclear();
            performTransactions();
        }
        else if (state == 22)
            jTextField1.setText("200");
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        textFieldclear();
        switch (state) {
            case 2:
                state = 22;
                mainMenuSelection = 2;
                PrintStream printStream = new PrintStream(new CustomOutputStream(jTextArea1));
                System.setOut(printStream);
                System.setErr(printStream);
                textAreaclear();
                displayMenuOfAmountsWithdraw();
                break;
            case 22:
                jTextField1.setText("400"); break;
            case 883:
                displayMainMenu();
                textFieldclear();
                state = 2;
                break;
        }
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        switch (state) {
            case 1:
            case 2:
            case 22:
            case 231:
            case 232:
            case 88:
                state = 0;
                textFieldclear();
                jTextArea1.setText("Please take your card.\n\nGoodbye!");
                delayText(2000, "Welcome!\nPlease insert your card.\n(Enter your account number)");
                break;
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        textFieldclear();
        switch (state) {
            case 22:
                jTextField1.setText("500"); break;
            case 2:
                state = 231;
                mainMenuSelection = 3;
                PrintStream printStream = new PrintStream(new CustomOutputStream(jTextArea1));
                System.setOut(printStream);
                System.setErr(printStream);
                textAreaclear();
                displayMenuOfPayee();
                break;
            case 882:
                state = 0;
                textFieldclear();
                jTextArea1.setText("Printing invoice...\n\nThe invoice is printed out.");
                delayText(2000,"Card ejected.\n\nPlease take your card.");
                delayText(4000,"Cash dispensed.\n\nPlease take your cash.");
                delayText(6000,"Goodbye!");
                delayText(8000, "Welcome!\nPlease insert your card.\n(Enter your account number)");
                break;
            case 883:
                state = 0;
                textFieldclear();
                jTextArea1.setText("Please take your card.\n\nGoodbye!");
                delayText(2000, "Welcome!\nPlease insert your card.\n(Enter your account number)");
                break;
        }
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        if (state == 2) {
            state = 0;
            textFieldclear();
            jTextArea1.setText("Please take your card.\n\nGoodbye!");
            delayText(2000, "Welcome!\nPlease insert your card.\n(Enter your account number)");
        }
        else if (state == 22)
            jTextField1.setText("800");
    }//GEN-LAST:event_btnDActionPerformed
    
    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        switch (state) {
            case 22:
                jTextField1.setText("1000"); break;
            case 883:
                jTextArea1.setText("Printing invoice...\n\nThe invoice is printed out.");
                delayText(2000, ">>View my balance\tExit<<\n\n>>Withdraw cash\n\n>>Transfer cash");
                textFieldclear();
                state = 2;
                break;
        }
    }//GEN-LAST:event_btnEActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        switch (state) {
            case 1:
                state = 0;
                textFieldclear();
                jTextArea1.setText("Please take your card.\n\nGoodbye!");
                delayText(2000, "Welcome!\nPlease insert your card.\n(Enter your account number)");
                break;
            case 882:
                state = 0;
                textFieldclear();
                jTextArea1.setText("Card ejected.\n\nPlease take your card.");
                delayText(4000,"Cash dispensed.\n\nPlease take your cash.");
                delayText(6000,"Goodbye!");
                delayText(8000, "Welcome!\nPlease insert your card.\n(Enter your account number)");
                break;
            case 883:
                state = 0;
                textFieldclear();
                jTextArea1.setText("Printing invoice...\n\nThe invoice is printed out.");
                delayText(3000, "Please take your card.\n\nGoodbye!");
                delayText(5000, "Welcome!\nPlease insert your card.\n(Enter your account number)");
                break;
            case 22:
            case 221:
            case 231:
            case 232:
            case 88:
                displayMainMenu();
                textFieldclear();
                state = 2;
                break;
        }
    }//GEN-LAST:event_btnFActionPerformed

    private void btnTwoZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoZeroActionPerformed
        if (state == 1) {
            jTextField1.setText(jTextField1.getText() + "*");
            tempPin.append("00");
        }
        else jTextField1.setText(jTextField1.getText() + "00");
    }//GEN-LAST:event_btnTwoZeroActionPerformed

    public double getDoubleValue() {
        if(!jTextField1.getText().equals(""))
            return Double.parseDouble(jTextField1.getText());
        else return 0;
    }
    
    private boolean isValidDouble() {
        try {
            Double.parseDouble(jTextField1.getText());
                return true;
        }
        catch(NumberFormatException e) {
            return false;
        }
    }

    public int getIntValue() {
        if(!jTextField1.getText().equals(""))
            return Integer.parseInt(jTextField1.getText());
        else return 0;
    }
    
    public void delayText(int time, String text) {
        ActionListener taskPerformer = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    jTextArea1.setText(text);
                }
            };
            Timer timer = new Timer(time, taskPerformer);
            timer.setRepeats(false);
            timer.start();
    }
    
    public void textFieldclear() { jTextField1.setText(""); }
    
    public void textAreaclear() { jTextArea1.setText(""); }
    
    public void run() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ATMGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATMGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATMGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATMGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATMGui().setVisible(true);
            }
        });
    }
    
    public void displayMenuOfAmountsWithdraw() {
        // display the menu
        screen.displayMessageLine( ">>$200\t                             $800<<" );
        screen.displayMessageLine( "\n>>$400\t                           $1000<<" );
        screen.displayMessageLine( "\n>>$500\t                             Back<<" );
        screen.displayMessage( "\nChoose or type a withdrawal amount: " );
        if(bankDatabase.overdrawnAvailability(currentAccountNumber)) {
            screen.displayMessageLine("\nAvailable overdrawn limit: $"
            + bankDatabase.getOverdrawnLimit(currentAccountNumber));
        }
    }
   
    public void displayMenuOfPayee() {
        screen.displayMessageLine( "Please enter payee account number." );
        screen.displayMessageLine( "\n\n\n\t                             Back<<" );
    }
   
    public void displayMenuOfAmountsTransfer() {
        screen.displayMessageLine( "Please enter amount." );
        if(bankDatabase.overdrawnAvailability(currentAccountNumber)) {
            screen.displayMessageLine("\nAvailable overdrawn limit: $"
            + bankDatabase.getOverdrawnLimit(currentAccountNumber));
            screen.displayMessageLine( "\n\t                             Back<<" );
        }
        else
            screen.displayMessageLine( "\n\n\n\t                             Back<<" );
    }

    private void performTransactions() 
    {
        // local variable to store transaction currently being processed
        Transaction currentTransaction = null;

           // decide how to proceed based on user's menu selection
            switch ( mainMenuSelection )
            {
                // user chose to perform one of three transaction types
                case BALANCE_INQUIRY:
                case WITHDRAWAL:
                case TRANSFER:
                    // initialize as new object of chosen type
                    currentTransaction = createTransaction( mainMenuSelection );
                    currentTransaction.execute(amountInput, accountInput); // execute transaction
                    textFieldclear();
                    break;
                case EXIT: // user chose to terminate session
                    screen.displayMessageLine( "\nExiting the system..." );
                    break;
                default: // user did not enter an integer from 1-4
                    screen.displayMessageLine( 
                        "\nYou did not enter a valid selection. Try again." );
                    break;
            } // end switch
    } // end method performTransactions
   
    private Transaction createTransaction( int type )
    {
        Transaction temp = null; // temporary Transaction variable

        // determine which type of Transaction to create     
        switch ( type )
        {
            case BALANCE_INQUIRY: // create new BalanceInquiry transaction
                temp = new BalanceInquiry( 
                    currentAccountNumber, screen, bankDatabase );
                break;
            case WITHDRAWAL: // create new Withdrawal transaction
                temp = new Withdrawal( currentAccountNumber, screen, 
                    bankDatabase, keypad, cashDispenser );
                break;
            case TRANSFER:
                temp = new Transfer( currentAccountNumber, screen,
                        bankDatabase, keypad );
                break;
        } // end switch

        return temp; // return the newly created object
    } // end method createTransaction
   
    private void displayMainMenu() {
        jTextArea1.setText( ">>View my balance\tExit<<\n\n>>Withdraw cash\n\n>>Transfer cash" );
    } // end method displayMainMenu
    
    private int state, tempAccountNo, mainMenuSelection, accountInput;
    private double amountInput, availableBalance;
    StringBuilder tempPin = new StringBuilder();
    
    private boolean userAuthenticated; // whether user is authenticated
    private int currentAccountNumber; // current user's account number
    private Screen screen; // ATM's screen
    private Keypad keypad; // ATM's keypad
    private CashDispenser cashDispenser; // ATM's cash dispenser
    private BankDatabase bankDatabase; // account information database

    // constants corresponding to main menu options
    private static final int BALANCE_INQUIRY = 1;
    private static final int WITHDRAWAL = 2;
    private static final int TRANSFER = 3;
    private static final int EXIT = 4;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnTwoZero;
    private javax.swing.JButton btnZero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}