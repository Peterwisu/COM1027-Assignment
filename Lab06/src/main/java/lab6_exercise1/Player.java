package lab6_exercise1;
/**
 * 
 * This class specifiy a name and a rugby position of an player
 * 
 * @author Wish Suharidamrong
 *
 */
public class Player {
		//name of a player
		private String name=null;
		//position of a player in Rugby
		private RugbyPosition position=null;
		/**
		 * 
		 * @param name of player
		 * @param position of a player
		 */
		public Player(String name,RugbyPosition position) {
			this.name = name;
			this.position = position;
		}
		/**
		 * 
		 * @return name of player
		 */
		public String getName() {
			return name;
		}
		/**
		 * 
		 * @param name of player
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * 
		 * @return postion of a player
		 */
		public RugbyPosition getPosition() {
			return position;
		}
		/**
		 * 
		 * @param position of a player
		 */
		public void setPosition(RugbyPosition position) {
			this.position = position;
		}
		
		
}

