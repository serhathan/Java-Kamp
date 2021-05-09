package Concretes;

import Abstracts.SaleService;
import Entities.Campaing;
import Entities.Gamer;
import Entities.Product;

public class SaleManager implements SaleService {
    @Override
    public void sellWithCampaing(Product product, Gamer gamer, Campaing campaing) {
        product.setDiscount(campaing.getCampaingDiscount());

        System.out.println("Oyun:"+product.getName()+" oyunun fiyatı:"+product.getUnitPrice()+" oyunun kampanyalı fiyatı:"+product.getUnitPriceAfterDiscount()+
                " Oyuncu:"+gamer.getFirstName());
    }

    @Override
    public void sellWithoutCampaing(Product product, Gamer gamer) {

        System.out.println("Oyun:"+product.getName()+" oyunun fiyatı:"+product.getUnitPrice()+ " Oyuncu:"+gamer.getFirstName());

    }
}
