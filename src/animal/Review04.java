package animal;

public class Review04 {

    public static void main(String[] args) {
    // Humanクラスのインスタンスで田中、鈴木、佐藤さんを生成
    Human tanaka = new Human("田中　太郎", 25, "電車");
    Human suzuki = new Human("鈴木　次郎", 30, "野球");
    Human sato = new Human("佐藤　花子", 20, "映画");
        
    tanaka.say();
    tanaka.think();
    suzuki.say();
    suzuki.think();
    sato.say();
    sato.think();
    }

}
