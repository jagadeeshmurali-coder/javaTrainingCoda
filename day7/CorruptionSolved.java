package day7;

public class CorruptionSolved {

	public static void main(String[] args) {
		DeathC d = new DeathC();
		OpenSchools o = new OpenSchools();
		License l = new License();
		
		SevaIssuesDeathC svc1 = new SevaIssuesDeathC(d,o,l);
		SevaIssuesClrCert svc2 = new SevaIssuesClrCert(d,o,l);
		SevaIssuesLic svc3 = new SevaIssuesLic(d,o,l);
		
		Seva s = new Seva();
		s.setCommands(0, svc3);
		s.setCommands(1, svc2);
		s.setCommands(2, svc1);
		
		s.executeCommands(1);
	}
}

class Seva{
	Commands c[]=new Commands[5];
	public Seva() {
		for(int i=0;i<5;i++) {
			c[i]=new DummyCommands();
		}
	}
	
	public void setCommands(int slot,Commands commands) {
		this.c[slot]=commands;
	}
	public void executeCommands(int slot) {
		this.c[slot].executeNew();
	}
}
class DummyCommands extends Commands{
	@Override
	public void executeNew() {
		System.out.println("I am dummy yet to be operational...");
	}
}

abstract class Commands{
	public Commands() {
		// TODO Auto-generated constructor stub
	}
	private DeathC d;private OpenSchools o;private License l;

	public Commands(DeathC d, OpenSchools o, License l) {
		super();
		this.d = d;
		this.o = o;
		this.l = l;
	}

	public final DeathC getD() {
		return d;
	}

	public final OpenSchools getO() {
		return o;
	}

	public final License getL() {
		return l;
	}
	
	public abstract void executeNew();
}

class SevaIssuesDeathC extends Commands{

	public SevaIssuesDeathC(DeathC d, OpenSchools o, License l) {
		super(d, o, l);
	}

	@Override
	public void executeNew() {
		System.out.println("Procedure Started............");
		//business logic
		getO().procedure(); getD().dataCollection();getD().enquiry();getD().issueCert();
		System.out.println("Fullfilled.....");
		
	}
	
}

class SevaIssuesClrCert extends Commands{

	public SevaIssuesClrCert(DeathC d, OpenSchools o, License l) {
		super(d, o, l);
	}

	@Override
	public void executeNew() {
		System.out.println("Procedure Started............");
		//business logic
		getO().procedure(); getD().dataCollection();getD().enquiry();getO().clearence();;
		System.out.println("Fullfilled.....");
		
	}
	
}

class SevaIssuesLic extends Commands{

	public SevaIssuesLic(DeathC d, OpenSchools o, License l) {
		super(d, o, l);
	}

	@Override
	public void executeNew() {
		System.out.println("Procedure Started............");
		//business logic
		getO().procedure(); getD().dataCollection();getL().licenceReq();;getL().rtoApproval();;
		System.out.println("Fullfilled.....");
		
	}
	
}
class DeathC{
	public void enquiry() {
		System.out.println("requested..........");
	}
	public void dataCollection() {
		System.out.println("Data collected.............");
	}
	public void issueCert() {
		System.out.println("Death Certificate issued.............");
	}
}
class OpenSchools{
	public void procedure() {
		System.out.println("procedure informed.....");
	}
	public void clearence() {
		System.out.println("Clearence certs issued.......");
	}
}
class License{
	public void licenceReq() {
		System.out.println("Licence requested.......");
	}
	public void rtoApproval() {
		System.out.println("Approved by rto.......");
	}
}
