package cn.ouc.Exception;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-04 14:42
 **/
public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){

    }

    public void withdraw(double amt) throws OverdraftException {
        if(amt>balance){
            throw new OverdraftException("取款金额大于余额",amt-balance);
        }
    }
}
