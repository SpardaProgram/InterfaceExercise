import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import services.Contract;
import services.ContractService;
import services.Parcela;
import services.Paypal;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer n = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		Double totalValor = sc.nextDouble();
		Contract contract = new Contract(totalValor, date, n);
		ContractService cs = new ContractService(new Paypal());
		System.out.print("Enter number of installments: ");
		int parcelaAmount = sc.nextInt();
		cs.processContract(contract, parcelaAmount);
		System.out.println("Installments: ");
		for(Parcela par : contract.getParcela()) {
			System.out.println(par);
		}
		sc.close();
	}
}
