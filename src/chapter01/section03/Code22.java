package chapter01.section03;

import java.io.*;
import java.util.Scanner;

public class Code22 {

    static String[] words = new String[100000];     // 인덱스에 넣을 단어
    static int[] count = new int[100000];       // 단어가 등장한 횟수
    static int n = 0;       // 목록에 저장되는 단어의 개수

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // 사용자가 exit을 입력하면 끝나는 loop
        while(true) {
            System.out.print("$ ");
            String command = kb.next(); // 문자열을 읽을 땐 next()

            // 사용자의 명령을 읽는다.
            if(command.equals("read")){
                // 파일 이름도 문자열이므로 String으로 받는다.
                String fileName = kb.next();
                // 한꺼번에 다 하려고 하지 말고 메서드로 분리한다.
                makeIndex(fileName);
            }
            else if(command.equals("find")){
                String str = kb.next();
                int index = findWord(str);

                if(index > -1){
                    System.out.println("The word " + words[index] + " appears "
                            + count[index] + " times.");
                }else{
                    System.out.println("The word " + str + " does not appear.");
                }
            }
            else if(command.equals("saveas")){
                String fileName = kb.next();
                saveAs(fileName);
            }
            else if(command.equals("exit")){
                break;
            }
        }

        kb.close();
    }

    static void saveAs(String fileName){
        try {
            PrintWriter outputFile = new PrintWriter(new FileWriter(fileName));

            for(int i=0; i<n; i++){
                // 파일로 출력한다.
                outputFile.println(words[i] + " " + count[i]);
            }

            outputFile.close();
        }
        catch (IOException e) {
            System.out.println("Save failed.");
        }
    }

    static void makeIndex(String fileName){
        try {
            Scanner inputFile = new Scanner(new File(fileName));

            // 파일 내용을 읽는다.
            while(inputFile.hasNext()){
                // 단어를 하나씩 읽는다.
                String str = inputFile.next();
                // 단어가 존재하는지 찾아보는 메서드를 실행한다.
                addWord(str);
            }

            // 읽었으면 닫아준다.
            inputFile.close();
        }catch(FileNotFoundException e){
            System.out.println("No file");

            // 파일이 없다고 종료하는 것보다는 계속 할 수 있게 return 한다.
            return;
        }
    }

    static void addWord(String str){
        // 찾은 단어의 index를 저장한다. 못 찾으면 -1을 리턴한다.
        int index = findWord(str);

        if(index != -1){
            count[index]++;
        }else{
            // 기존에 없다면 새롭게 추가해준다.
            words[n] = str;
            // 추가 되었으니 count도 1이 된다.
            count[n] = 1;
            // 총 단어의 개수도 증가한다.
            n++;
        }
    }

    static int findWord(String str){
        // 저장된 단어 개수 i만큼 반복해 찾는다.
        for(int i=0; i<n; i++){
            if(words[i].equals(str)){
                return i;
            }
        }
        return -1;
    }
}
