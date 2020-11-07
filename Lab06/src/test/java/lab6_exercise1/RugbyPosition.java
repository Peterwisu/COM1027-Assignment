package lab6_exercise1;

public enum RugbyPosition {

		LOOSERHEAD(1),HOOKER(2),TIGHTHEAD(3),NUMBER4LOCK(4),NUMBER5LOCK(5),BLINDSIDEFLANKER(6),OPENSIDEFLANKER(7),NUMBER8(8),SCRUMHALF(9),
		FLYHALF(10),LEFTWING(11),INSIDECENTRE(12),OUTSIDECENTRE(13),RIGHTWING(14),FULLBACK(15);
		
		private int number;
		private RugbyPosition(int number) {
			this.number= number;
		}
		
		
		
}
