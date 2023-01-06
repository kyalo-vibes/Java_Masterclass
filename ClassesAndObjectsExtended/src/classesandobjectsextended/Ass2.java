package classesandobjectsextended;

public class Ass2 {
    public static void main(String[] args){
        reverseMeth();
    }

    static String reverseMeth(){
        String str = "My.name.is.Kyalo";
        String words[]=str.split("\\s");
        String s="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            s+=sb.toString()+" ";
        }
        return s.trim();
    }
}
