package testing.please;

public class DistanceBetween {
	double Rad = 6371; // km
	double ��1;
	double ��2;	
	double ����;
	double ����;
	public DistanceBetween(double lat1,double lat2, double lon1, double lon2) {
		super();
		��1=Math.toRadians(lat1);
		��2=Math.toRadians(lat2);
		���� = Math.toRadians((lat2-lat1));
		���� = Math.toRadians((lon2-lon1));	
	}
	
	public double findDist(){
		double a = Math.sin(����/2) * Math.sin(����/2) +
		        Math.cos(��1) * Math.cos(��2) *
		        Math.sin(����/2) * Math.sin(����/2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

		double d = Rad * c;
		return d;
	}
	
	
	
}
