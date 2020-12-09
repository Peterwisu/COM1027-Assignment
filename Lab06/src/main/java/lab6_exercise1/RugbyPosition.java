package lab6_exercise1;
/**
 * This Class contains enumarated types values of a Rugby Position
 * 
 * @author Wish Suharitdamrong
 *
 */
public enum RugbyPosition {
		//constant Enum values 
		LOOSERHEAD(1),HOOKER(2),TIGHTHEAD(3),NUMBER4LOCK(4),NUMBER5LOCK(5),BLINDSIDEFLANKER(6),OPENSIDEFLANKER(7),NUMBER8(8),SCRUMHALF(9),
		FLYHALF(10),LEFTWING(11),INSIDECENTRE(12),OUTSIDECENTRE(13),RIGHTWING(14),FULLBACK(15);
		//index of an enum
		private int number;
		/**
		 * 
		 * @param number of an index of enum values
		 */
		private RugbyPosition(int number) {
			this.number= number;
		}
		
		
		
}
