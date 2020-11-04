package lab3;

public class User {

	
		private String name=null;;
		private Email email=null;
		
		public User(String name,Email email) {
			this.name =name;
			this.email =email;
		}

		public String getName() {
			return name;
		}

		public Email getEmail() {
			return email;
		}

		@Override
		public String toString()
		{
			String display;
			display=this.getName() + " <" + this.email.getEmailAddress() + ">";
			return display;
		}
		
}
