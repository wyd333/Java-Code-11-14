public class Test11 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "��";
        dog.age = 11;
        dog.eat();
        dog.wangwang();
        System.out.println(dog.name);

        Cat cat = new Cat();
        cat.name = "è";
        cat.mewmew();
        System.out.println(cat.name);
    }
}
