package Abstracts;

import Entities.Campaing;

public interface CampaingService {
    void addCampaing(Campaing campaing);
    void removeCampaing(Campaing campaing);
    double campaingDiscount(Campaing campaing);
}
