package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int monthlySalary = 1000000;
		int bonus = monthlySalary * 4 * 20/100;
		int monthlyTax = monthlySalary * 10/100;
		int annualTax = monthlyTax * 12;
		int bonusTax = bonus * 55 / 1000;
		int annualSalary = monthlySalary *12;
		int annualIncomeAfterTax = annualSalary - annualTax + bonus - bonusTax;
		
		System.out.println("���� : " + annualSalary + ", ���� ���� : " + (annualSalary - annualTax));
		System.out.println("���ʽ� : " + bonus + ", ���� ���ʽ� : " + (bonus - bonusTax));
		System.out.println("���޾� : " + annualIncomeAfterTax);

	}

}
