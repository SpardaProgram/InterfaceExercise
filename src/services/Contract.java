package services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private double totalValue;
	private Date date;
	private int number;
	
	List<Parcela> parcela = new ArrayList<>();	
	public Contract() {
		
	}
	public Contract(double totalValue, Date date, int number) {
		this.totalValue = totalValue;
		this.date = date;
		this.number = number;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public List<Parcela> getParcela() {
		return parcela;
	}
	
	
	

}
