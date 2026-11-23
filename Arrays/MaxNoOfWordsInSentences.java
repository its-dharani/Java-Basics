public class MaxNoOfWordsInSentences {
    public static void main(String[] args){
        String[] sentences = {
                "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"
        };
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String[] words= sentences[i].split(" ");
            int sum=words.length;
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
