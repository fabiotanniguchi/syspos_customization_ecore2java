@Entity
public class CustomizedAcademicLife extends AcademicLife{

	private Long reprovedCreditSum;
	private Long blockedCreditSum;
	private Double crDac;
	private Double cpDac;

	public Long getreprovedCreditSum(){
		return this.reprovedCreditSum;
	}
	public Long getblockedCreditSum(){
		return this.blockedCreditSum;
	}
	public Double getcrDac(){
		return this.crDac;
	}
	public Double getcpDac(){
		return this.cpDac;
	}

	public void getreprovedCreditSum(Long reprovedCreditSum){
		this.reprovedCreditSum = reprovedCreditSum;
	}
	public void getblockedCreditSum(Long blockedCreditSum){
		this.blockedCreditSum = blockedCreditSum;
	}
	public void getcrDac(Double crDac){
		this.crDac = crDac;
	}
	public void getcpDac(Double cpDac){
		this.cpDac = cpDac;
	}

}
