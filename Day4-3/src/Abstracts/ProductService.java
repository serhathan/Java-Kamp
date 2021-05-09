package Abstracts;

import Entities.Product;

public interface ProductService {
    void add(Product product);
    void remove(Product product);
    void update(Product product);
}
