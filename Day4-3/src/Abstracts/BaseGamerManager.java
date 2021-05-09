package Abstracts;

import Entities.Gamer;

public abstract class BaseGamerManager implements GamerService{
    @Override
    public void save(Gamer gamer) {
        System.out.println("Oyuncu eklendi:"+gamer.getFirstName());
    }
}
