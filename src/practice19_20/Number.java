package practice19_20;

import practice16.InternetOrder;

import java.util.*;

public class Number {
    private String alpha = "АВЕКМНОРСТУХ";
    private ArrayList<String> list = new ArrayList<>();
    private HashSet<String> hashSet = new HashSet<>();
    private TreeSet<String> treeSet = new TreeSet<>();

    private void addLetter(StringBuffer s){
        Random r = new Random();
        s.append(alpha.charAt(r.nextInt(alpha.length())));
    }

    private String getRegion(String s){
        if (s.length()==1) s='0'+s;
        return s;
    }

    public void generate(){
        Random r = new Random();
        int reg = r.nextInt(199)+1;
        StringBuffer str = new StringBuffer();
        addLetter(str);
        str.append(r.nextInt(10));
        str.append(r.nextInt(10));
        str.append(r.nextInt(10));
        addLetter(str);
        addLetter(str);
        str.append(getRegion(Integer.toString(reg)));
        list.add(str.toString());
        hashSet.add(str.toString());
        treeSet.add(str.toString());
    }

    public  ArrayList<String> getList(){
        return this.list;
    }

    public void sort(){
        Collections.sort(list);
    }

    public boolean straightSearch(String s){
        return list.contains(s);
    }

    public boolean binSearch(String s){
        return Collections.binarySearch(list,s)>=0;
    }

    public boolean hashSearch(String s){
        return hashSet.contains(s);
    }

    public boolean treeSearch(String s){
        return treeSet.contains(s);
    }

}
