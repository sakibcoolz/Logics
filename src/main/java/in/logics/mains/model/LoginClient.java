package in.logics.mains.model;

public class LoginClient {
	
		private String username;
		private String password;
		
		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
		public LoginClient(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}
		
		public LoginClient() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "LoginClient [username=" + username + ", password=" + password ;
		}
		
		
		
}
