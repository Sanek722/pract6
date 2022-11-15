package zad_4_pr7;

public class MathFunc implements MathCalculable
{

    public double abs_num(double a, double bi) {
        return Math.sqrt(pow_num(a) + pow_num(bi));
    }


    public double pow_num(double num)
    {
        return num * num;
    }
}
