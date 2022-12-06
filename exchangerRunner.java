import javax.swing.*;

public class exchangerRunner{
    public static void main(String[] args){
        exchangerFunction f = new exchangerFunction();
        Object[] option0 = {"USD", "EUR", "LIR", "YEN", "RUB", "Quit"};
        Object[] optionUSD = {"EUR", "LIR", "YEN", "RUB", "Quit"};
        Object[] optionEUR = {"USD", "LIR", "YEN", "RUB", "Quit"};
        Object[] optionLIR = {"USD", "EUR", "YEN", "RUB", "Quit"};
        Object[] optionYEN = {"USD", "EUR", "LIR", "RUB", "Quit"};
        Object[] optionRUB = {"USD", "EUR", "LIR", "YEN", "Quit"};
        Object[] option2 = {"Try again!", "Quit"};

        while (true){
            int choice0 = JOptionPane.showOptionDialog(null, "Choose your currency", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option0, option0[5]);;
            
            if (choice0 == 0){
                String input = JOptionPane.showInputDialog(null, "Enter USD value: ");
                System.out.println(input);

                if(f.check(input) == true){
                    double finput = Double.parseDouble(input);
                    int choice1 = JOptionPane.showOptionDialog(null, "Choose your currency", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionUSD, optionUSD[4]);;

                    if (choice1 == 0){
                        f.USDToEUR(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else if (choice1 == 1){
                        f.USDToLIR(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else if (choice1 == 2){
                        f.USDToYen(finput);;
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else if (choice1 == 3){
                        f.USDToRUB(finput);;
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else {break;}
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid output!");
    
                    int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
    
                    if (choice2 == 0){
    
                    } else {break;}
                }
            } else if (choice0 == 1){
                String input = JOptionPane.showInputDialog(null, "Enter EUR value: ");
                System.out.println(input);

                if(f.check(input) == true){
                    double finput = Double.parseDouble(input);
                    int choice1 = JOptionPane.showOptionDialog(null, "Choose your currency", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionEUR, optionEUR[4]);;

                    if (choice1 == 0){
                        f.EURToUSD(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else if (choice1 == 1){
                        f.EURToLIR(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else if (choice1 == 2){
                        f.EURToYEN(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else if (choice1 == 3){
                        f.EURToRUB(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else {break;}
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid output!");
    
                    int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
    
                    if (choice2 == 0){
    
                    } else {break;}
                }
            } else if (choice0 == 2){
                String input = JOptionPane.showInputDialog(null, "Enter LIR value: ");
                System.out.println(input);

                if(f.check(input) == true){
                    double finput = Double.parseDouble(input);
                    int choice1 = JOptionPane.showOptionDialog(null, "Choose your currency", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionLIR, optionLIR[4]);;

                    if (choice1 == 0){
                        f.LIRToUSD(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else if (choice1 == 1){
                        f.LIRToEUR(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else if (choice1 == 2){
                        f.LIRToYEN(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else if (choice1 == 3){
                        f.LIRToRUB(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else {break;}
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid output!");
    
                    int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
    
                    if (choice2 == 0){
    
                    } else {break;}
                }
            } else if (choice0 == 3){
                String input = JOptionPane.showInputDialog(null, "Enter YEN value: ");
                System.out.println(input);

                if(f.check(input) == true){
                    double finput = Double.parseDouble(input);
                    int choice1 = JOptionPane.showOptionDialog(null, "Choose your currency", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionYEN, optionYEN[4]);;

                    if (choice1 == 0){
                        f.YENToUSD(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else if (choice1 == 1){
                        f.YENToEUR(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else if (choice1 == 2){
                        f.YENToLIR(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else if (choice1 == 3){
                        f.YENToRUB(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else {break;}
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid output!");
    
                    int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
    
                    if (choice2 == 0){
    
                    } else {break;}
                }
            } else if (choice0 == 4){
                String input = JOptionPane.showInputDialog(null, "Enter RUB value: ");
                System.out.println(input);

                if(f.check(input) == true){
                    double finput = Double.parseDouble(input);
                    int choice1 = JOptionPane.showOptionDialog(null, "Choose your currency", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionRUB, optionRUB[5]);;

                    if (choice1 == 0){
                        f.RUBToUSD(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else if (choice1 == 1){
                        f.RUBToEUR(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else if (choice1 == 2){
                        f.RUBToLIR(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else if (choice1 == 3){
                        f.RUBToYEN(finput);
    
                        int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                        if (choice2 == 0){
                        } else {break;}
                    } else {break;}
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid output!");
    
                    int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
    
                    if (choice2 == 0){
    
                    } else {break;}
                }
            
            } else {break;}

            
        }
    }


}