package Concretes;

import Abstracts.GamerCheckService;
import Entities.Gamer;
import MernisServiceReferance.RJGKPSPublicSoap;

public class GamerCheckManager implements GamerCheckService {
    @Override
    public boolean CheckIfRealGamer(Gamer gamer) {

        return true;
    }
}
