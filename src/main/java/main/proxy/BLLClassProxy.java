package main.proxy;

public class BLLClassProxy extends BLLClass {

    @Override
    public void DoThing1() {

    }

    @Override
    public void DoThing2() {

    }

    private void LogUserOperation() {
        //记录每一个业务操作的时间和操作人信息
        System.out.println("记录每一个业务操作的时间和操作人信息");
    }
}


