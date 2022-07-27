import java.awt.*;

public class conversion {
    private  double moneda, resultado;
    private int div, div1;


    public conversion() {
    }

    public double getMoneda() {
        return moneda;
    }

    public void setMoneda(double moneda) {
        this.moneda = moneda;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getDiv() {
        return div;
    }

    public void setDiv(int div) {
        this.div = div;
    }

    public int getDiv1() {
        return div1;
    }

    public void setDiv1(int div1) {
        this.div1 = div1;
    }

    public double convesor(){
        if(div == 0 && div1 == 0){
            resultado = moneda * 910.25;
        }
        else if(div == 0 && div1 == 1){
            resultado = moneda;
        }
        else if(div == 0 && div1 == 2){
            resultado = moneda * 20.46;
        }
        else if(div == 0 && div1 == 3){
            resultado = moneda * 4467.80;
        }
        else if(div == 0 && div1 == 4){
            resultado = moneda * 3.92;
        }
        else if(div == 1 && div1 == 0){
            resultado = moneda;
        }
        else if(div == 1 && div1 == 1){
            resultado = moneda * 1.02;
        }
        else if(div == 1 && div1 == 2){
            resultado = moneda * 20.91;
        }
        else if(div == 1 && div1 == 3){
            resultado = moneda * 4567.66;
        }
        else if(div == 1 && div1 == 4){
            resultado = moneda * 4;
        }
        else if(div == 2 && div1 == 0){
            resultado = moneda * 44.62;
        }
        else if(div == 2 && div1 == 1){
            resultado = moneda * 0.049;
        }
        else if(div == 2 && div1 == 2){
            resultado = moneda;
        }
        else if(div == 2 && div1 == 3){
            resultado = moneda * 218.30;
        }
        else if(div == 2 && div1 == 4){
            resultado = moneda * 0.19;
        }
        else if(div == 3 && div1 == 0){
            resultado = moneda * 0.21;
        }
        else if(div == 3 && div1 == 1){
            resultado = moneda * 0.00022;
        }
        else if(div == 3 && div1 == 2){
            resultado = moneda * 0.0046;
        }
        else if(div == 3 && div1 == 3){
            resultado = moneda;
        }
        else if(div == 3 && div1 == 4){
            resultado = moneda * 0.00088;
        }
        else if(div == 4 && div1 == 0){
            resultado = moneda * 232.06;
        }
        else if(div == 4 && div1 == 1){
            resultado = moneda * 0.26;
        }
        else if(div == 4 && div1 == 2){
            resultado = moneda * 5.22;
        }
        else if(div == 4 && div1 == 3){
            resultado = moneda * 1141.47;
        }
        else if(div == 4 && div1 == 4){
            resultado = moneda ;
        }

        return resultado;
    }
}