package lab6_exercise2;

public class Player {

		private String name;
		private RugbyPosition position;
		
		public Player(String name,RugbyPosition position) {
			this.name = name;
			this.position = position;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public RugbyPosition getPosition() {
			return position;
		}
		public void setPosition(RugbyPosition position) {
			this.position = position;
		}
		
		
}

