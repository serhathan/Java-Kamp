package Concretes;

import Abstracts.BaseGamerManager;
import Abstracts.GamerCheckService;
import Abstracts.GamerService;
import Entities.Gamer;

public class GamerManager extends BaseGamerManager {

    private GamerCheckService gamerCheckService;

    public GamerManager(GamerCheckService gamerCheckService) {
        this.gamerCheckService = gamerCheckService;
    }

    @Override
    public void save(Gamer gamer){
        if (gamerCheckService.CheckIfRealGamer(gamer)){
            super.save(gamer);
        }
        else {
            System.out.println("Gerçek oyuncu değil.");
        }
    }

}
