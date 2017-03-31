package intro_hadi.interop;

import java.util.List;

/**
 * Created by paetztm on 3/30/2017.
 */
public interface CustomerRepoJava {
    CustomerJava getById(int id);
    List<CustomerJava> getAll();
}
