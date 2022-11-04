package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
    private ProductDao _productDao;
    private Logger[] _loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        _productDao = productDao;
        _loggers = loggers;
    }

    public void add(Product product) throws Exception {
        if (product.getUnitPrice()<10) {
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz.");
        }
        _productDao.add(product);

        for (Logger logger : _loggers) {
            logger.log(product.getName());
        }
    }
}
