package testDesignPattern.desiginBuddhism.TemplateMethod;

public abstract class HummerModel  {

    private boolean alarmFlag = true;

    // 基本方法(4个抽象方法)：必须有子类实现且对应不同的类

    // 基本方法分三种：具体方法、抽象方法、钩子方法
    protected abstract void start();

    protected abstract void stop();

    protected abstract void engineBoom();

    protected abstract void alarm();

    // 模板方法:定义调用顺序且不能改变
    final public void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    protected boolean isAlarm(){
        return this.alarmFlag; // 抽象类实现，子类可重写
    };

    public void setAlarmFlag(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }


}
