import Abstracts.BaseGamerManager;
import Abstracts.SaleService;
import Concretes.*;
import Entities.Campaing;
import Entities.Gamer;
import Entities.Product;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        BaseGamerManager gamerManager=new GamerManager(new GamerCheckManager());
        Gamer serhat=new Gamer(1,"Serhat","Güney", LocalDate.of(1998,9,6),"474454545");
        gamerManager.save(serhat);

        ProductManager productManager=new ProductManager();

        Product Gta=new Product(1,"GTA5",180,"Açık dünyalı oyun",10);

        productManager.add(Gta);
        productManager.remove(Gta);
        productManager.update(Gta);

        Campaing blackFriday=new Campaing(1,"Kara Cuma",25);

        CampaingManager campaingManager=new CampaingManager();
        campaingManager.addCampaing(blackFriday);
        campaingManager.removeCampaing(blackFriday);
        campaingManager.campaingDiscount(blackFriday);

        SaleService sale=new SaleManager();

        sale.sellWithCampaing(Gta,serhat,blackFriday);
        sale.sellWithoutCampaing(Gta,serhat);


    }
}
