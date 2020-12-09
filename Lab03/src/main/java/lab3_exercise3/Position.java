package lab3_exercise3;
/**
 * 
 * A classs to model a role name of a Position.
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Position {
	//Name of a role.
    private String role=null;
    	/**
    	 *  Constructor to allow outside class to create object of Position class.
    	 */
        public Position() {
            super();
            
        }
        /**
         * 
         * @return name of a role.
         */
        public String getRoleName() {
            return role;
        }
        /**
         * 
         * @param role name of a position
         */
        public void setRoleName(String role) {
            this.role = role;
        }
        
}
