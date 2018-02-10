package chaper7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class loanMain {
public static void main(String[]args) {
	double interestrate,loanvalue;//定义贷款和贷款额变量
	int loanperiod;
	Scanner in=new Scanner(System.in);
	System.out.println("请输入贷款年利率：");
	interestrate=in.nextDouble();//输入贷款利率
	System.out.println("请输入贷款年限：");
    loanperiod=in.nextInt();     //输入贷款年限
    System.out.println("请输入贷款总额：");
    loanvalue=in.nextDouble(); //输入贷款总额
    //创建贷款对象
    Loan loan=new Loan(interestrate,loanperiod,loanvalue);
    //创建DecimalFormat对象df,以控制输出时小数的位数
    DecimalFormat df=new DecimalFormat("#.00");
    System.out.println("等额本息情况下的月均还款额为："
         +df.format(loan.getMonthlyPayment())+"¥");
    System.out.println("贷款"+loanperiod+"年的总还款额为："
+df.format(loan.getTotaPayment())+"¥");
  }
}
