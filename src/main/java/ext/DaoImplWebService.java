package ext;

import dao.IDao;

public class DaoImplWebService implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Service : ");
        return 90;
    }
}
