/*
 * @Author: your name
 * @Date: 2022-02-15 13:20:57
 * @LastEditTime: 2022-02-15 13:28:58
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\02-Arrays\06-Generic-Data-Structures\student.java
 */
public class student {
    private String name;
    private int score;

    public student(String Name, int Score){
        name = Name;
        score = Score;
    }
    @Override
    public String toString(){
        return String.format("Name : %s, Score : %d",name,score );
    }
}
