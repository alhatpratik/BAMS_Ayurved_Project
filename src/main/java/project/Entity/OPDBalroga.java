package project.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class OPDBalroga {

	
	@Id
	private double dopd_bal_record_no;
	@Column
	private double dopd_bal_yearly_no;
	@Column
	private double dopd_bal_sr_no;
	
	@OneToOne
	@JoinColumn(name = "patient_id", referencedColumnName = "record_no")
	private Patient dopd_bal_patient;

	public double getDopd_bal_record_no() {
		return dopd_bal_record_no;
	}

	public void setDopd_bal_record_no(double dopd_bal_record_no) {
		this.dopd_bal_record_no = dopd_bal_record_no;
	}

	public double getDopd_bal_yearly_no() {
		return dopd_bal_yearly_no;
	}

	public void setDopd_bal_yearly_no(double dopd_bal_yearly_no) {
		this.dopd_bal_yearly_no = dopd_bal_yearly_no;
	}

	public double getDopd_bal_sr_no() {
		return dopd_bal_sr_no;
	}

	public void setDopd_bal_sr_no(double dopd_bal_sr_no) {
		this.dopd_bal_sr_no = dopd_bal_sr_no;
	}

	public Patient getDopd_bal_patient() {
		return dopd_bal_patient;
	}

	public void setDopd_bal_patient(Patient dopd_bal_patient) {
		this.dopd_bal_patient = dopd_bal_patient;
	}
	
	
	
//	@Column
//	double yearly_no;
//	@Column
//	double sr_no;
//	@Column
//	double new_no;
//	@Column
//	double old_no;
//	@Column
//	String name;
//	@Column
//	String address;
//	@Column
//	int age;
//	@Column
//	char sex;
//	@Column
//	String department;
//	@Column
//	String diagnosis;
//	@Column
//	LocalDate date;
//	@Column
//	LocalDate discharge_date;
//	@Column
//	double weight;
//	@Id
//	double record_no;
//	
//	public double getRecord_no() {
//		return record_no;
//	}
//	public void setRecord_no(double record_no) {
//		this.record_no = record_no;
//	}
//	public double getWeight() {
//		return weight;
//	}
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}
//	public LocalDate getDischarge_date() {
//		return discharge_date;
//	}
//	public void setDischarge_date(LocalDate discharge_date) {
//		this.discharge_date = discharge_date;
//	}
//	public double getSr_no() {
//		return sr_no;
//	}
//	public void setSr_no(double sr_no) {
//		this.sr_no = sr_no;
//	}
//	public double getYearly_no() {
//		return yearly_no;
//	}
//	public void setYearly_no(double yearly_no) {
//		this.yearly_no = yearly_no;
//	}
//	public double getNew_no() {
//		return new_no;
//	}
//	public void setNew_no(double new_no) {
//		this.new_no = new_no;
//	}
//	public double getOld_no() {
//		return old_no;
//	}
//	public void setOld_no(double old_no) {
//		this.old_no = old_no;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public char getSex() {
//		return sex;
//	}
//	public void setSex(char sex) {
//		this.sex = sex;
//	}
//	public String getDepartment() {
//		return department;
//	}
//	public void setDepartment(String department) {
//		this.department = department;
//	}
//	public String getDiagnosis() {
//		return diagnosis;
//	}
//	public void setDiagnosis(String diagnosis) {
//		this.diagnosis = diagnosis;
//	}
//	public LocalDate getDate() {
//		return date;
//	}
//	public void setDate(LocalDate date) {
//		this.date = date;
//	}
	
}
