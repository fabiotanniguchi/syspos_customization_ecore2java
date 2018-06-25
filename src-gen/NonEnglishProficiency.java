package br.unicamp.syspos.domain.extended;

import javax.persistence.*;

@Entity
@Table(name="NONENGLISHPROFICIENCY")
public class NonEnglishProficiency{

	private String description;
	private Double score;
	private Long dateMillis;
	private Long academicLifeId;

	@Column(name="DESCRIPTION" )
	public String getdescription(){
		return this.description;
	}

	@Column(name="SCORE" , nullable=false )
	public Double getscore(){
		return this.score;
	}

	@Column(name="DATEMILLIS" , nullable=false )
	public Long getdateMillis(){
		return this.dateMillis;
	}

	@Column(name="ACADEMICLIFEID" , nullable=false )
	public Long getacademicLifeId(){
		return this.academicLifeId;
	}


	public void getdescription(String description){
		this.description = description;
	}

	public void getscore(Double score){
		this.score = score;
	}

	public void getdateMillis(Long dateMillis){
		this.dateMillis = dateMillis;
	}

	public void getacademicLifeId(Long academicLifeId){
		this.academicLifeId = academicLifeId;
	}

}
