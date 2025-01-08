package Lab_Programs;
import Lab_Programs.cc.CurrencyConvertor;
import Lab_Programs.dc.DistanceConvertor;
import Lab_Programs.tc.TimeConvertor;

public class Program8 {
    public static void main(String[] args) {
        CurrencyConvertor obj1 = new CurrencyConvertor();
        DistanceConvertor obj2 = new DistanceConvertor();
        TimeConvertor obj3 = new TimeConvertor();

        obj1.USD_To_Rupee();
        obj1.Rupee_To_USD();
        obj1.Euro_To_Rupee();
        obj1.Rupee_To_Euro();
        obj1.Yen_To_Rupee();
        obj1.Rupee_To_Yen();

        obj2.Meter_To_Kilometer();
        obj2.Kilometer_To_Meter();
        obj2.Miles_To_Kilometer();
        obj2.Kilometer_To_Miles();

        obj3.Hours_To_Minutes();
        obj3.Minutes_To_Hours();
        obj3.Hours_To_Seconds();
        obj3.Seconds_To_Hours();
    }
}
