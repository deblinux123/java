public class ScopeDemo {
    static int classLevel = 100;
    public static void main(String[] args){
        int methodLevel = 50;

        if (true){
            int blockLevel = 25;
            System.out.println(blockLevel);
        }

        System.out.println(methodLevel);
        System.out.println(classLevel);
    }
    
}
