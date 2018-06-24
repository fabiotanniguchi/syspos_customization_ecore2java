package br.unicamp.syspos.domain.extended;

import javax.persistence.*;

@Entity
@Table(name="LANGUAGENONENGLISHPROFICIENCY")
public class LanguageNonEnglishProficiency{

	private Long academicLifeId;
	private Double score;
	private Long dateMillis;
	private String description;

	@Column(name="ACADEMICLIFEID")
	public Long getacademicLifeId(){
		return this.academicLifeId;
	}

	@Column(name="SCORE")
	public Double getscore(){
		return this.score;
	}

	@Column(name="DATEMILLIS")
	public Long getdateMillis(){
		return this.dateMillis;
	}

	@Column(name="DESCRIPTION")
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
