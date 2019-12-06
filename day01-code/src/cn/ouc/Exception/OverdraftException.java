package cn.ouc.Exception;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-04 14:40
 **/
public class OverdraftException extends Exception {
    private double deficit;

    public OverdraftException(String message, double deficit) {
        super(message);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }
}
