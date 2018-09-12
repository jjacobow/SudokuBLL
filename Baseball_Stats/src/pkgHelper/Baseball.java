package pkgHelper;

public class Baseball {
	String Name;
	int Hits;
	int AtBats;
	int Doubles;
	int Triples;
	int HomeRuns;
	int Runs;
	int BaseOnBalls;
	int HitByPitch;
	int SacFly;
	
	public Baseball(String n,int AB,int H,int dub,int trip,int HR,int R,int BB,int HBP,int SF) {
		this.Name= n;
		this.AtBats = AB;
		this.Hits=H;
		this.Doubles= dub;
		this.Triples = trip;
		this.HomeRuns = HR;
		this.Runs = R;
		this.BaseOnBalls = BB;
	}
	public double BA() {
		return Hits/AtBats;
	}
	public double OBP() {
		return (Hits+BaseOnBalls+HitByPitch)/(AtBats + BaseOnBalls+HitByPitch+SacFly);
	}
	public double SLG() {
		return ((Hits- Doubles - Triples - HomeRuns) + 2*Doubles+3*Triples+4*HomeRuns)/AtBats;
	}
	public double OPS(){
		return OBP() + SLG();
	}
	public int TB() {
		return ((Hits- Doubles - Triples - HomeRuns)+Doubles*2 + Triples*3 + HomeRuns*4);
	}
}
	
