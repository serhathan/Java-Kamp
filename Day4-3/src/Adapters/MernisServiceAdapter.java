package Adapters;

import Abstracts.GamerCheckService;
import Entities.Gamer;
import MernisServiceReferance.RJGKPSPublicSoap;

public class MernisServiceAdapter implements GamerCheckService {
    @Override
    public boolean CheckIfRealGamer(Gamer gamer) {
        RJGKPSPublicSoap client=new RJGKPSPublicSoap();
        try {
            return client.TCKimlikNoDogrula(Long.valueOf(gamer.getNationalityIdentity()),gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(),gamer.getBirthOfDay().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
