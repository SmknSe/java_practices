package practice19_20;

public class main {
    public static String getOutput(String n, boolean f, long time){
        return n+(f? " " : "не ")+"найден, поиск занял "+time+" нс";
    }

    public static void main(String[] args) {
        Number number = new Number();
        for(int i=0;i<150000;i++){
            number.generate();
        }
        System.out.println(number.getList());
        String test = number.getList().get(100900);
        System.out.println("Искомый номер: "+test);
        number.sort();
        boolean f;
        long time;
        time = System.nanoTime();
        f = number.straightSearch(test);
        System.out.println("Поиск перебором: "+getOutput(test,f,System.nanoTime()-time));

        time = System.nanoTime();
        f = number.binSearch(test);
        System.out.println("Бинарный поиск: "+getOutput(test,f,System.nanoTime()-time));

        time = System.nanoTime();
        f = number.hashSearch(test);
        System.out.println("Поиск в HashSet: "+getOutput(test,f,System.nanoTime()-time));

        time = System.nanoTime();
        f = number.treeSearch(test);
        System.out.println("Поиск в treeSet: "+getOutput(test,f,System.nanoTime()-time));
    }
}
