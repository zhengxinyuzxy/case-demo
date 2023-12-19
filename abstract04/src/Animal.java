/**
 * @author zhengxinyu
 * @date 2023/4/28
 */
public abstract class Animal {
    public Animal() {
        System.out.println("animal无参构造方法执行");
    }

    public Animal(String s) {
        System.out.println("animal的String参数构造方法执行," + "\n" + "猫的名字：" + s);
    }

    private String animalName;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public abstract void eat();

    public abstract void sleep();

    public void specific() {
        System.out.println("animal特有方法");
    }
}
