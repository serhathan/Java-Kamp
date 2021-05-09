package Concretes;

import Abstracts.ProductService;
import Entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager implements ProductService {

    public ProductManager() {

    }


    @Override
    public void add(Product product) {
        System.out.println("Oyun eklendi:"+product.getName()+" fiyat:"+product.getUnitPrice());

    }


    @Override
    public void remove(Product product) {
        System.out.println("Oyun silindi:"+product.getName()+" fiyat:"+product.getUnitPrice());

    }

    @Override
    public void update(Product product) {
        System.out.println("Oyun güncellendi:"+product.getName()+" fiyat:"+product.getUnitPrice());

    }
}
