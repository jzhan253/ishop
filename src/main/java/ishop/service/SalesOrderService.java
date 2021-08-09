package ishop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ishop.dao.SalesOrderDao;
import ishop.model.SalesOrder;

@Service
public class SalesOrderService {

    @Autowired
    private SalesOrderDao salesOrderDao;

    public void addSalesOrder(SalesOrder salesOrder) {
        salesOrderDao.addSalesOrder(salesOrder);
    }
}
