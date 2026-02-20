public class StringFormatApp {
    public static void main(String[] args){
        if (args.length <3){
            System.out.println("error, incorrect input");
            return;
        }
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        float height = Float.parseFloat(args[2]);
        float spaceheight = (height * 1.023f)*100;
        float MarsAge = age/1.88f;

        System.out.printf("name: %-20s Age: %3d Height: %4.2fm\n",name,age,height);
        System.out.printf("My space height would be %1f cm%n",spaceheight);
        System.out.printf("On Mars I would be approximately %1.0f years old. %n",MarsAge);
    }
}