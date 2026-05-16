import config.DBCon.*;
import config.DBCon;
import depot.ClientRepository;
import commercial.Client;
public class Test {

        public static  void main(String [] args){
            DBCon.getInstance().init("root","");
            Client c = new Client("Mme Zghal Samira","98 750 641",2500);
            ClientRepository cr = new ClientRepository();
            System.out.println(cr.save(c));
        }
    }



