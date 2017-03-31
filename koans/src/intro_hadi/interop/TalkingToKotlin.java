package intro_hadi.interop;

import intro_hadi.classes.Customer;
import intro_hadi.classes.Status;

import java.io.IOException;

/**
 * Created by paetztm on 3/30/2017.
 */
public class TalkingToKotlin {

    public static void main(String[] args) {

        Customer customerKotlin = new Customer(1, "name", 33);
        String value = customerKotlin.email;

        customerKotlin.changeStatus(Status.Past);
        customerKotlin.changeStatus();
        customerKotlin.preferential();

        System.out.println(UtilityClass.prefix("Hello", "World"));
        UtilityClass.getCopyrightYear();
        System.out.println(UtilityClass.NewYear);

        CustomerKotlin ck = new CustomerKotlin(1, "Tim", "tim@google.com");
        CustomerKotlinKt.extension(ck);
    }

    public void loadStats(Customer customerKotlin)
    {
        try {
            customerKotlin.loadStatistics("filename");
        } catch( IOException e)
        {

        }
    }

}
