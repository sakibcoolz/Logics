package in.logics.mains.service;

import in.logics.mains.model.LoginClient;
import in.logics.mains.model.ValidLogins;

public interface LoginService {
	ValidLogins logins(LoginClient client);
}
