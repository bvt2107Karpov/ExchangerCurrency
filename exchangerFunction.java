import javax.swing.JOptionPane;

public class exchangerFunction {

    public boolean check(String input){
        try{
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public void RUBToUSD(double finput){
        double RUBToUSD = finput * 0.015896;
        JOptionPane.showMessageDialog(null, "Amount of Dollars: " + RUBToUSD + "$");
    }

    public void RUBToEUR(double finput){
        double RUBToEUR = finput * 0.015127;
        JOptionPane.showMessageDialog(null, "Amount of Euros: " + RUBToEUR + "€");
    }

    public void RUBToYEN(double finput){
        double RUBToYEN = finput * 2.17;
        JOptionPane.showMessageDialog(null, "Amount in Yen: " + RUBToYEN + "¥");
    }

    public void RUBToLIR(double finput){
        double RUBToLIR = finput * 0.29613;
        JOptionPane.showMessageDialog(null, "Amount of Lira: " + RUBToLIR + "₺");
    }
//
    public void USDToRUB(double finput){
        double USDToRUB = finput * 62.91;
        JOptionPane.showMessageDialog(null, "Amount in Rubs: " + USDToRUB + "₽");;
    }

    public void USDToEUR(double finput){
        double USDToEUR = finput * 0.95211;
        JOptionPane.showMessageDialog(null, "Amount of Euros: " + USDToEUR + "€");
    }

    public void USDToYen(double finput){
        double USDToYen = finput * 136.66;
        JOptionPane.showMessageDialog(null, "Amount in Yen: " + USDToYen + "¥");
    }

    public void USDToLIR(double finput){
        double USDToLIR = finput * 18.64;
        JOptionPane.showMessageDialog(null, "Amount of Lira: " + USDToLIR + "₺");
    }
//
    public void EURToUSD(double finput){
        double EURToUSD = finput * 1.05;
        JOptionPane.showMessageDialog(null, "Amount of Dollars: " + EURToUSD + "$");
    }

    public void EURToRUB(double finput){
        double EURToRUB = finput * 66.11;
        JOptionPane.showMessageDialog(null, "Amount in Rubs: " + EURToRUB + "₽");
    }

    public void EURToYEN(double finput){
        double EURToYEN = finput * 143.33;
        JOptionPane.showMessageDialog(null, "Amount in Yen: " + EURToYEN + "¥");
    }

    public void EURToLIR(double finput){
        double EURToLIR = finput * 19.6;
        JOptionPane.showMessageDialog(null, "Amount of Lira: " + EURToLIR + "₺");
    }
//
    public void LIRToUSD(double finput){
        double LIRToUSD = finput * 0.053648;
        JOptionPane.showMessageDialog(null, "Amount of Dollars: " + LIRToUSD + "$");
    }

    public void LIRToEUR(double finput){
        double LIRToEUR = finput * 0.051018;
        JOptionPane.showMessageDialog(null, "Amount of Euros: " + LIRToEUR + "€");
    }

    public void LIRToYEN(double finput){
        double LIRToYEN = finput * 7.29;
        JOptionPane.showMessageDialog(null, "Amount in Yen: " + LIRToYEN + "¥");
    }

    public void LIRToRUB(double finput){
        double LIRToRUB = finput * 3.38;
        JOptionPane.showMessageDialog(null, "Amount in Rubs: " + LIRToRUB + "₽");
    }
//
    public void YENToUSD(double finput){
        double YENToUSD = finput * 0.007317;
        JOptionPane.showMessageDialog(null, "Amount of Dollars: " + YENToUSD + "$");
    }

    public void YENToEUR(double finput){
        double YENToEUR = finput * 0.006977;
        JOptionPane.showMessageDialog(null, "Amount of Euros: " + YENToEUR + "€");
    }

    public void YENToRUB(double finput){
        double YENToRUB = finput * 0.4609;
        JOptionPane.showMessageDialog(null, "Amount in Rubs: " + YENToRUB + "₽");
    }

    public void YENToLIR(double finput){
        double YENToLIR = finput * 0.1372;
        JOptionPane.showMessageDialog(null, "Amount of Lira: " + YENToLIR + "₺");
    }    
}
