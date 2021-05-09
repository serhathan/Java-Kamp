package Abstracts;

import Entities.Campaing;
import Entities.Gamer;
import Entities.Product;

public interface SaleService {
    void sellWithCampaing(Product product, Gamer gamer, Campaing campaing);
    void sellWithoutCampaing(Product product,Gamer gamer);
}
