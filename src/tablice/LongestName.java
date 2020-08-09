package tablice;

public class LongestName {
    public String findLongestName(String[]names){
        int longName = names.length;
        String longestName=names[0];
        for (int i=1; i<longName;i++){
            if(names[i].length()>longestName.length()){
                longestName=names[i];
            }
        }
return longestName;
    }
}
