package br.unicamp.syspos.domain.custom;

import javax.persistence.*;

import br.unicamp.syspos.domain.basic.AcademicLife;

@Entity
public class CustomAcademicLife extends AcademicLife{

	private Long reprovedCreditSum;
	private Long blockedCreditSum;
	private Double crDac;
	private Double cpDac;

	@Column(name="REPROVEDCREDITSUM" , nullable=false )
	public Long getreprovedCreditSum(){
		return this.reprovedCreditSum;
	}

	@Column(name="BLOCKEDCREDITSUM" , nullable=false )
	public Long getblockedCreditSum(){
		return this.blockedCreditSum;
	}

	@Column(name="CRDAC" )
	public Double getcrDac(){
		return this.crDac;
	}

	@Column(name="CPDAC" )
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
