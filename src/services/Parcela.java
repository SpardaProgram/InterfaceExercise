package services;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
	private Double amount;
	private Date dueDate;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Parcela() {

	}

	public Parcela(Double amount, Date dueDate) {
		this.amount = amount;
		this.dueDate = dueDate;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getValor() {
		return amount;
	}

	public Date getDate() {
		return dueDate;
	}
	
	

	public String toString() {
		return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
	}

}
