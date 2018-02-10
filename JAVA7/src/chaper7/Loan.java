package chaper7;

public class Loan {
      private double monthlyInterestRate; //定义贷款月利率
      private int numberOfMonths; //定义贷款总月数
      private double loanAmount;//定义贷款额
      
      //构造方法，初始化成员变量
      public Loan(double annualInterestRate,int numberOfYears,double loanAmount) {
    	  this.monthlyInterestRate=annualInterestRate/(100*2);
    	  this.numberOfMonths=numberOfYears*12;
    	  this.loanAmount=loanAmount;
      }
      public double getMonthlyPayment() {
    	  return (loanAmount*monthlyInterestRate*Math.pow(
    			  1+monthlyInterestRate,(double) numberOfMonths))
    			  /(Math.pow(1+monthlyInterestRate,(double) numberOfMonths)-1);
      }
      //返回等额本息还款方式下的支付的总本息
      public double getTotaPayment() {
      	  return getMonthlyPayment()*numberOfMonths;
      } 
}

