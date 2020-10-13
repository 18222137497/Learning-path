package cn.itcast.web.proxy;

public class Lenovo implements saleCompute{
    @Override
    public String sale(double money) {
        System.out.println("联想官方购买");
        return "买了一个"+money+"元的电脑";
    }

    @Override
    public void show() {
        System.out.println("一台电脑");
    }
}
