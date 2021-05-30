package kodlama.io.northwind.business.concretes;

import kodlama.io.northwind.business.abstracts.UserService;
import kodlama.io.northwind.core.dataAccess.IUserDao;
import kodlama.io.northwind.core.entities.User;
import kodlama.io.northwind.core.utilities.results.DataResult;
import kodlama.io.northwind.core.utilities.results.Result;
import kodlama.io.northwind.core.utilities.results.SuccessDataResult;
import kodlama.io.northwind.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {
    private final IUserDao iUserDao;

    @Autowired
    public UserManager(IUserDao iUserDao) {
        this.iUserDao = iUserDao;
    }

    @Override
    public Result add(User user) {
        this.iUserDao.save(user);
        return new SuccessResult("kulaıcı eklendi");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<>(this.iUserDao.findByEmail(email), "kulanıcı bulundu");
    }
}
