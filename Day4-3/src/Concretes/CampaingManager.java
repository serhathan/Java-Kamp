package Concretes;

import Abstracts.CampaingService;
import Entities.Campaing;

public class CampaingManager implements CampaingService {
    @Override
    public void addCampaing(Campaing campaing) {
        System.out.println("Kampanya eklendi:"+campaing.getCampaingName());
    }

    @Override
    public void removeCampaing(Campaing campaing) {
        System.out.println("Kampanya silindi:"+campaing.getCampaingName());
    }

    @Override
    public double campaingDiscount(Campaing campaing) {

        return campaing.getCampaingDiscount();
    }
}
