package animal;

public class Animal {

    // カプセル化したフィールドの定義
    private String name;
    private int age;

    //引数なしのコンストラクタ
    public Animal() {
    }
    //引数ありのコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 戻り値なしのsayメソットの定義
    public void say() {
        System.out.println( name + "です。" + age + "歳です。");

    }
}
