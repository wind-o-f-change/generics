package ru.innopolis.dao.map;

import ru.innopolis.dao.UserInfoDAO;
import ru.innopolis.model.UserInfo;

import java.util.HashMap;
import java.util.UUID;

/**
 * UserInfoDAOImpl.
 *
 * @author Ilya_Sukhachev
 */
public class UserInfoDAOImpl extends AbstractDao<UserInfo, UUID> implements UserInfoDAO {

    public UserInfoDAOImpl(Class<? extends UserInfo> elementClass) {
        super((Class<UserInfo>) elementClass, new HashMap<>());
    }
}
