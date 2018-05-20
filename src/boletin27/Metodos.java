
package boletin27;

import static boletin27.Calculadora.*;

public class Metodos {
    
    static double num=0;
    static double resultado=0;
    String factor=null;
        public void introducir(String nombre) {

        switch (nombre) {
            case "+":
                condicion();
                factor="+";
                tNum.setText("");
                break;
            case "-":
                condicion();
                factor="-";
                tNum.setText("");
                break;
            case "/":
                condicion();
                factor="/";
                tNum.setText("");
                break;
            case "*":
                condicion();
                factor="*";
                tNum.setText("");
                break;
            case "=":
                calculo();
                factor=null;
                break;
            case "AC":
                num=0;
                resultado=0;
                tNum.setText("");
                break;
            default:
                tNum.setText(tNum.getText()+nombre);
                break;
        }

    }

    private void calculo() {
        if (resultado==0) {
            switch (factor) {
                case "+":
                    num+=Double.valueOf(tNum.getText());

                    break;
                case "-":
                    num-=Double.valueOf(tNum.getText());

                    break;
                case "/":
                    num/=Double.valueOf(tNum.getText());

                    break;
                case "*":
                    num*=Double.valueOf(tNum.getText());

                    break;
            }
            resultado=num;
        } else {
            switch (factor) {
                case "+":
                    resultado+=Double.valueOf(tNum.getText());

                    break;
                case "-":
                    resultado-=Double.valueOf(tNum.getText());

                    break;
                case "/":
                    resultado/=Double.valueOf(tNum.getText());

                    break;
                case "*":
                    resultado*=Double.valueOf(tNum.getText());

                    break;
            }
        }
        tNum.setText(Double.toString(resultado));

    }

    private void condicion() {
        if (factor!=null) {
            calculo();
        } else {
            num=Double.valueOf(tNum.getText());
        }
}
}
