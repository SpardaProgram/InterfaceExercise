package services;

import java.util.Calendar;
import java.util.Date;

public class ContractService {
	private PaymentService pay;

	public ContractService(PaymentService pay) {
		this.pay = pay;
	}

	public void processContract(Contract c, int months) {
		double basicQuota = c.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			double updatedQuota = basicQuota + pay.interest(basicQuota, i);
			double fullQuota = updatedQuota + pay.paymentFee(updatedQuota);
			Date dueDate = addMonths(c.getDate(), i);
			c.getParcela().add(new Parcela(fullQuota,dueDate));
		}
	}

	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
