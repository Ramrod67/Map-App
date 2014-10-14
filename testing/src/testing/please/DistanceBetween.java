package testing.please;

public class DistanceBetween {
	double Rad = 6371; // km
	double É”1;
	double É”2;	
	double É¢É”;
	double É¢É…;
	public DistanceBetween(double lat1,double lat2, double lon1, double lon2) {
		super();
		É”1=Math.toRadians(lat1);
		É”2=Math.toRadians(lat2);
		É¢É” = Math.toRadians((lat2-lat1));
		É¢É… = Math.toRadians((lon2-lon1));	
	}
	
	public double findDist(){
		double a = Math.sin(É¢É”/2) * Math.sin(É¢É”/2) +
		        Math.cos(É”1) * Math.cos(É”2) *
		        Math.sin(É¢É…/2) * Math.sin(É¢É…/2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

		double d = Rad * c;
		return d;
	}
	
	
	
}
