public class StringLinearSearch {
    public static void main(String[] args) {
        String name = "Afzal";
        char target = 'f';
        System.out.println(linearSearch(name, target));
    }

    static boolean linearSearch(String name, char target){
        if(name.length() == 0){
            return false;
        }

        for (int i = 0; i <name.length(); i++){
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}