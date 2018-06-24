@Entity
public class LanguageNonEnglishProficiency{

	private Long academicLifeId;
	private Double score;
	private Long dateMillis;
	private String description;

	public Long getacademicLifeId(){
		return this.academicLifeId;
	}
	public Double getscore(){
		return this.score;
	}
	public Long getdateMillis(){
		return this.dateMillis;
	}
	public String getdescription(){
		return this.description;
	}

	public void getacademicLifeId(Long academicLifeId){
		this.academicLifeId = academicLifeId;
	}
	public void getscore(Double score){
		this.score = score;
	}
	public void getdateMillis(Long dateMillis){
		this.dateMillis = dateMillis;
	}
	public void getdescription(String description){
		this.description = description;
	}
}
